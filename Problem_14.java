package Project_Euler;

public class Problem_14 {
/*
 * 
 * The following iterative sequence is defined for the set of positive integers:

n -> n/2 (n is even)
n -> 3n + 1 (n is odd)

Which starting number, under one million, produces the longest chain?
 * 
 */
	public static void main(String[] args) {
		long maxChain = 0, maxNumber = 0;
		for (long i = 1000000, num, count; i >= 2; i--){
			num = i;
			count = 0;
			while (num != 1){
				if (num % 2 == 0)	
					num /= 2;
				else 
					num = num*3 + 1;
				count++;
			}
			if (count > maxChain){
				maxChain = count;
				maxNumber = i;
			}
		}
		
		System.out.println(maxNumber);
	}

}
