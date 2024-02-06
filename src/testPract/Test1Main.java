package testPract;

import java.util.Scanner;

public class Test1Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;

		Test1 cd = new Test1("Tata", "Ratan_Tata", false);
		Test1 cd1 = new Test1("Tata1", "Ratan_Tata1", false);
		Test1 cd2 = new Test1("Tata2", "Ratan_Tata2", false);
		Test1 cd3 = new Test1("Tata3", "Ratan_Tata3", false);

		Test1[] nameOfTheCd = { cd, cd1, cd2, cd3 };

		// should not get more than two cds
		// should not be able to get the same book
		// should be able to get same book
		do {
			System.out.println("Enter the CD name:");
			String cdName = sc.next();
			for (int i = 0; i < nameOfTheCd.length; i++) {

				if (nameOfTheCd[i].cdName.equals(cdName) && nameOfTheCd[i].isCdIssued == false) {
					nameOfTheCd[i].isCdIssued = true;
					break;
				}
			}
		} while (cnt <= 2);

	}

}