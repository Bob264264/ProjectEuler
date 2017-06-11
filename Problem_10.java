package Project_Euler;

public class Problem_10 {
/*
 * 
 * Find the sum of all the primes below two million.
 * 
 */
	public static void main(String[] args) {
		long sum = 0;
		for (int i = 0; i < 2000000; i++)
			if (isPrime(i))
				sum += i;
		System.out.println(sum);

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
