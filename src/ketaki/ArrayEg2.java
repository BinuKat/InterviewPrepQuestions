package ketaki;

import java.util.Arrays;

public class ArrayEg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1, 2, 3, 4, 5 };

		// Replace numbers with corresponding alphabets
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] >= 1 && numbers[i] <= 26) {
				char alphabet = (char) ('A' + numbers[i] - 1);
				System.out.println("Replacing " + numbers[i] + " with " + alphabet);
				numbers[i] = alphabet;
			} else {
				System.out.println("Cannot replace " + numbers[i] + " with an alphabet.");
			}
		}

// Print the modified array
		System.out.println("Modified Array: " + Arrays.toString(numbers));
	}
}
