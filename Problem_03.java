package Project_Euler;

import cs1.Keyboard;

public class Problem_03 {
/*
 * The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		long number = Keyboard.readLong();
		for (int i = (int)Math.sqrt(number) + 1; i > 2; i--)
			if (number % i == 0 && isPrime(i)){
				System.out.println(i); break;
			}
	}
	
	public static boolean isPrime(int number){
		if (number < 2) return false;
		for (int i = 2; i < (int)Math.sqrt(number) + 1; i++){
			if (number % i == 0)
				return false;
		}
		return true;
	}
}
