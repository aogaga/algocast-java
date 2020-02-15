// --- Directions
// Check to see if two provided strings are anagrams of eachother.
// One string is an anagram of another if it uses the same characters
// in the same quantity. Only consider characters, not spaces
// or punctuation.  Consider capital letters to be the same as lower case
// --- Examples
//   anagrams("rail safety", "fairy tales") --> True
//   anagrams("RAIL! SAFETY!", "fairy tales") --> True
//   anagrams("Hi there", "Bye there") --> False

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

class Anagrams{


	public static void main(String args[]){

		System.out.println(isAnagram("rail safety", "fairy tales"));
			System.out.println(isAnagram("RAIL! SAFETY!", "fairy tales"));
				System.out.println(isAnagram("Hi there", "Bye there"));
	}	


	public static boolean isAnagram(String a, String b){

      HashMap<Character, Integer> mapa = getMapOfStr(a);
      HashMap<Character, Integer> mapb = getMapOfStr(b);

      if(mapa.size() != mapb.size()){
      	return false;
      }

      Iterator myIterator = mapa.entrySet().iterator();

      while(myIterator.hasNext()){
      	Map.Entry  mapElement = (Entry) myIterator.next();

      	char mapkey = (char) mapElement.getKey();
      	int mapval = (int) mapElement.getValue();


      	if(mapa.get(mapkey)  != mapb.get(mapkey)){

      		return false;
      	}
      }

      return true;

	}


	public static HashMap<Character, Integer> getMapOfStr(String str){
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length() ; i++ ) {
			
			char x = Character.toLowerCase(str.charAt(i));

			if(Character.isAlphabetic(x)){

				if(map.containsKey(x)){

					int elemCount = map.get(x);
					elemCount++;

					map.replace(x, elemCount);
				}else{
					map.put(x, 1);
				}
			}
		}

		return map;
	}

}