package csd;

import java.util.Scanner;

public class EthiopianMultiplication {

	public static void main(String[] args) {

		System.out.println("Please enter two number for multiplication");
		Scanner scan = new Scanner(System.in);
		int inputOne = scan.nextInt();
		int inputTwo = scan.nextInt();
		scan.close();

		int result = ethiCal(inputOne, inputTwo);
		System.out.println("Result of the multiplication of your numbers are: " + result);

	}

	public static int ethiCal(int numOne, int numTwo) {
		int[] rigthList = new int[4444];
		int i = 0;
		int multi = 0;
		do {

			if (numOne % 2 != 0) {
				rigthList[i] = numTwo;
				i++;

			}
			numOne = numOne / 2;
			numTwo = numTwo * 2;

		} while (numOne / 2 >= 1);

		rigthList[i + 1] = numTwo;

		for (int j = 0; j <= rigthList.length - 1; j++) {
			multi = rigthList[j] + multi;
		}
		return multi;
	}
}
