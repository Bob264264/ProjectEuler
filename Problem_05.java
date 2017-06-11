package Project_Euler;

public class Problem_05 {
/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
	public static void main(String[] args0){
		boolean reach = false;
		for (int i = 1; !reach; i++){
			for (int j = 1; j <= 20; j++){
				if (i % j == 0);
				else break;
				if (j == 20)
					reach = true;
			}
			if (reach)
				System.out.println(i);
		}
			
	}
}
