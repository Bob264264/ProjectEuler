package Project_Euler;

public class Problem_09 {
/*
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 * 
 */
	public static void main(String[] args) {
		int[] arrayA = new int[998];
		int[] arrayB = new int[998];
		int[] arrayC = new int[998];
		for (int i = 0; i < arrayA.length; i++){
			arrayA[i] = i + 1;
			arrayB[i] = i + 1;
			arrayC[i] = i + 1;
		}
		for (int i = 0; i < arrayA.length; i++)
			for (int j = 0; j < arrayB.length; j++)
				for (int k = 0; k < arrayC.length; k++)
					if (arrayA[i] + arrayB[j] + arrayC[k] == 1000)
						if (testTriplet(arrayA[i], arrayB[j], arrayC[k])){
							System.out.println("" + arrayA[i] + " " + arrayB[j] + " " + arrayC[k]);
							System.out.println(arrayA[i] * arrayB[j] * arrayC[k]);
							return;
						}
	}
	
	public static boolean testTriplet(int num1, int num2, int num3){
		if (num1*num1 + num2*num2 == num3*num3)
			return true;
		if (num1*num1 + num3*num3 == num2*num2)
			return true;
		if (num2*num2 + num3*num3 == num1*num1)
			return true;
		return false;
	}

}
