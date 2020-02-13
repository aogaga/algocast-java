class IntegerReversal{

	public static void main(String args[]){

		System.out.println(reverseInt(-15));
		System.out.println(reverseInt(-51));
		System.out.println(reverseInt(15));
		System.out.println(reverseInt(981));
		System.out.println(reverseInt(-5));
		System.out.println(reverseInt(-9));
		System.out.println(-1 * 5);
	}


	public static int reverseInt(int num){

		String result = "";
		String numStr = Integer.toString(num);

		for(int i  =0; i < numStr.length(); i++){

			char x = numStr.charAt(i);
			if(Character.isDigit(x)){
				result = x + result;
			}

		}


		if(num < 0){
			int ans = Integer.parseInt(numStr);
		
			return Math.abs(ans) * -1;
		}else{
			return Integer.parseInt(numStr);
		}
	}
}