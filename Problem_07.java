package Project_Euler;

public class Problem_07 {
/*
  What is the 10,001st prime number?
 */
	
	
	public static void main(String[] args) {
		int count = 0, i;
		for (i = 1; count != 10001; i++)
			if (isPrime(i))
				count++;
		System.out.println(i-1);
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
