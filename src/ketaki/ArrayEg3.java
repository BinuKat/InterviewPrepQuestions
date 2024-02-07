package ketaki;

public class ArrayEg3 {

	public static void main(String[] args) {
		// Write a Java program to calculate sum values of an array.

		int[] arr = { 2, 3, 4, 5, 6 };
		int multiply = 1;

		for (int i : arr) {
			multiply = multiply * i;
		}
		System.out.println(multiply);
	}

}
