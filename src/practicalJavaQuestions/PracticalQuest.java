package practicalJavaQuestions;

import java.util.Iterator;

public class PracticalQuest {

	public static void main(String[] args) {
//		String str = "Reverse";
//		StringBuffer st = new StringBuffer(str);
//		System.out.println(st.reverse());
//	}

		// Second approach

//		String str ="Madam";
//		String rev = " ";
//		int strL = str.length();
//
//		for (int i=strL-1; i >= 0; i--) {
//			rev = rev + str.charAt(i);
//
//		}
//		System.out.println(rev);
//	}
//===============================================
		/*
		 * int num = 20; int count = 0; if (num>1) { for (int i = 0; i <= num; i++) { if
		 * (num%1== 0) count++;
		 * 
		 * } if(count ==2) {
		 * 
		 * System.out.println("prime"); }
		 * 
		 * else { System.out.println("Not a prime"); } } else {
		 * 
		 * System.out.println("Not a prime"); }
		 * 
		 */

		// ===================================Calculate the sum of a given number

		/*
		 * int num = 42568; int sum = 0;
		 * 
		 * while(num>0) { sum =sum+ num%10; // 0+4 , 4+8 num= num/10; //
		 * 
		 * } System.out.println(sum);
		 * 
		 */

		// ============Find the largest number out of three

		/*
		 * int a = 10; int b = 20; int c = 500; int d =3580;
		 * 
		 * if (a>b) { System.out.println("a is largest"); } else if (b>c) {
		 * System.out.println("b is argest");
		 * 
		 * } else if (c>d) { System.out.println("c is larg"); }
		 * 
		 * else if (d>a) { System.out.println("d is larg"); } else {
		 * System.out.println("inore"); }
		 * 
		 */

		// public void findSubStringOfString() {
		String animal = "Elephant is naive";
		// 01234567891011121
		String subString = animal.substring(0);
		System.out.println(animal);

		if (animal.contains(subString)) {
			System.out.println("Valid");
		} else {
			System.out.println("No");
		}
	}

	// ==========================

//		if (a>1) 
//		{
//			for (int i = 1; i <= a; i++) {
//			
//				if(a%i==0)
//					count++;
//			}
//			if (count ==2)
//			{
//				System.out.println("Prime Number");
//			}
//			else {
//				System.out.println("Not a prime number");
//			}
//			
//		}
//		else {
//			System.out.println("not a prime number");
//		}
}


























