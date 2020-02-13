class StrReversal{

	public static void main(String args[]){
		System.out.println(reverse("man"));
	}


	public static String reverse(String str){

		String result = "";

		for(int i =0; i < str.length(); i++){

			result = str.charAt(i) + result;
		}

		return result;
	}

}