package ketaki;

import java.util.Scanner;

public class ArrayEg5 {

	public static void main(String[] args) {
		String[] array = { "Dog", "cat", "animal" };
		String searchValue;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:- ");
		searchValue = sc.next();
		boolean value = false;
		for (int i = 0; i < array.length; i++) {
			if (searchValue == array[i]) {
				value = true;
				break;

			}
			}
			if (value) {
				System.out.println("Present");
			} else {
				System.out.println("Not Present");
			}
	

		}

	}

