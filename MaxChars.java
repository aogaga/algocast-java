// --- Directions
// Given a string, return the character that is most
// commonly used in the string.
// --- Examples
// maxChar("abcccccccd") === "c"
// maxChar("apple 1231111") === "1"

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

class MaxChars{

	public static void main(String args[]){
	
	System.out.println(getMaxChars("abcccccccd"));
	System.out.println(getMaxChars("apple 1231111"));
	  
	}

	
	public static char getMaxChars(String str){
	
	
	//loop through the string and get each char count
	//loop through the map and get the count and char
	//return the highest character 
	

	
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();

	
	for(int i = 0; i < str.length(); i++){
	
		char tmpChar = str.charAt(i);	
		if(map.containsKey(tmpChar)){
			int currentCharCount = map.get(tmpChar);
			currentCharCount++;
			map.replace(tmpChar, currentCharCount);

		}else{
			map.put(tmpChar, 1);
		}
	
	}


	Iterator myIterator = map.entrySet().iterator();

	int hightestValue = 0;
	char hightestKey = str.charAt(0);

	while(myIterator.hasNext()){

		Map.Entry mapelem = (Entry) myIterator.next();

		int elemValue =  (int) mapelem.getValue();
		char elemKey = (char) mapelem.getKey();


		if(elemValue > hightestValue){
			hightestValue = elemValue;
			hightestKey = elemKey;
		}


	}

	return hightestKey;

	}

}
