package ketaki;

import java.util.Arrays;

public class ArrayEg {

	public static void main(String[] args) {

		// 1) Write a program for array in ascending order

		int[] array = { 5, 28, 66, 99, 41, 55, 68, 93, 101, 76 };

		Arrays.sort(array); // Arrays.sort(array, Collections.reverseOrder()); Sort
		// is giving me any error // for descending order

		System.out.println(Arrays.toString(array)); // converts array to string

	}
}

//
