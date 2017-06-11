package Project_Euler;

public class Problem_04 {
	/*
	 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
	 */

	public static void main(String[] args) {
		int[] arrOne = new int[900];
		int[] arrTwo = new int[900];
		for (int i = 0; i < arrOne.length; i++){ 	//populate arrays
			arrOne[i] = i + 100;
			arrTwo[i] = i + 100;
		}
		int product = 0, max = 0;
		for (int i = 0; i < arrOne.length; i++)
			for (int j = 0; j < arrTwo.length; j++){
				product = arrOne[i] * arrTwo[j];
				if (isPalindrome(product) && product > max)
					max = product;
			}
		System.out.println(max);
	}
	
	public static boolean isPalindrome(int number){
		String test = String.valueOf(number);
		for (int i = 0; i < test.length()/2; i++)
			if (test.charAt(i) != test.charAt(test.length() - 1 - i))
				return false;
		return true;
	}
}
