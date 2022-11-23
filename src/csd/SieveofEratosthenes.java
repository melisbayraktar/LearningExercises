package csd;

import java.util.Scanner;

public class SieveofEratosthenes {

	public static void main(String[] Args) {

		System.out.println("What is the upper bound? ");
		Scanner scan = new Scanner(System.in);
		int upperBound = scan.nextInt();
		scan.close();

		int[] numbersArray = new int[upperBound];

		for (int i = 0; i < upperBound; i++) {
			numbersArray[i] = i + 1;

		}

		int[] primeNumbers = new int[upperBound];
		primeNumbers = calculation(upperBound, numbersArray);

		System.out.println("Prime numbers from one to the number you entered are: ");

		displayer(primeNumbers);

	}

	public static int[] calculation(int n, int[] serieA) {

		for (int a = 2; a <= n; a++) {
			for (int i = 1; i <= n; i++) {
				for (int j = a; j <= n;) {
					j = j + a;
					if (serieA[i - 1] == j) {
						serieA[i - 1] = 0;
					}
				}
			}
		}
		int c = 0;
		for (int i = 0; i <= serieA.length - 1; i++) {
			if (serieA[i] != 0) {
				c++;
			}
		}
		int b = 0;
		int[] serieB = new int[c];
		for (int i = 1; i <= n - 1; i++) {
			if (serieA[i] != 0) {
				serieB[b] = serieA[i];
				b++;
			}
		}
		return serieB;
	}

	public static void displayer(int[] prime) {
		for (int i = 0; i <= prime.length - 2; i++) {
			System.out.print("  " + prime[i] + "  ");
		}
	}
}
