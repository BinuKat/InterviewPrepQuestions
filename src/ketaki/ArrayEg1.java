package ketaki;

public class ArrayEg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2) Write a program to find the smallest number from an array of size 10

		int[] array1 = { 99, 25, 990, 54, 87, 63, 52, 14, 96, 31 };

		int highest = array1[0];

		for(
		int i = 0;i<array1.length;i++)
		{
			if (array1[i] > highest)
				highest = array1[i];

		}System.out.println(highest);

		}
	}

