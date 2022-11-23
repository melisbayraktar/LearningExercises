package csd;

import java.util.Scanner;

public class PalindromTest {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word to backtrack! ");
		String newInput = scan.next();
		scan.close();
		Character[] wordNormal = new Character[newInput.length()];
		Character[] wordReverse = new Character[newInput.length()];

		palindromChecker(newInput, wordReverse, wordNormal);

	}

	public static void palindromChecker(String x, Character[] a, Character[] b) {
		int n = 0;
		int c = 0;

		for (int i = x.length() - 1; i >= 0; i--) {

			a[n] = x.charAt(i);

			b[i] = x.charAt(i);
			n++;

		}

		System.out.print("Your word backwards is: ");

		for (int i = 0; i <= x.length() - 1; i++) {
			System.out.print(a[i]);
		}

		for (int i = 0; i <= x.length() - 1; i++) {

			if (b[i] != a[i]) {
				c++;

			}

		}
		System.out.println(" ");
		
		if (c == 0) {
			System.out.println("Your word is a palindrom! ");
		} else {
			System.out.println("Your word is not a palindrom");
		}
	}
}
