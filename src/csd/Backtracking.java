package csd;

import java.util.Scanner;

public class Backtracking {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word to backtrack! ");
		String newInput = scan.next();
		scan.close();
		int i = newInput.length() - 1;

		System.out.println("Your word spelled backwards as: ");
		trackerFunct(newInput, i);
	}

	public static void trackerFunct(String x, int i) {
		System.out.print(x.charAt(i));
		i--;
		if (i >= 0) {
			trackerFunct(x, i);
		}
	}

}
