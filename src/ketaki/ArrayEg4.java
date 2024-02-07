package ketaki;

import java.util.Scanner;

public class ArrayEg4 {

	public static void main(String[] args) {

		// Write a Java program to search specific number in an array.
		Scanner sc = new Scanner(System.in);
		int[] array = { 1, 2, 5, 9, 10, 11 };
		int search;

		System.out.println("Enter the number you want to search in array: ");
		search = sc.nextInt();
		boolean found = false;

		for (int i = 0; i < array.length; i++) {
			if (search == array[i])

			{
				found = true;
				break;

			}
			if (found) {
				System.out.println("Present");

			} else {
				System.out.println("Not Present");
			}

		}
	}
}