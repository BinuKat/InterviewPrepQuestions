package ketaki;

public class ArrayEg2 {

	public static void main(String[] args) {
		// Write a Java program to calculate sum values of an array.

		int[] array = { 1, 5, 10, 15, 20 };
		int sum = 0;

		for (int i : array) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
