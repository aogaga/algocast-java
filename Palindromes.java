class Palindromes{
	public static void main(String args[]){

		System.out.println(isPalindrome("abbad"));
	}


	public static boolean isPalindrome(String str){

		int strlen = str.length() -1;

		int midpoint = (str.length() - (str.length() %2)) / 2;


		int i = 0;

		while(i <= midpoint){
			if (str.charAt(i) != str.charAt(strlen - i)) {
				
				return false;
			}
			i++;
		}

		return true;
	}
}