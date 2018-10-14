package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int min = 0;
		int max = 100;
		int x = 50;
		System.out.println("Is your number " + x);
		Scanner input = new Scanner(System.in);
		String ans = input.nextLine();
		while (!(ans =="correct")) {
			if (ans.equals("lower")) {
				max = x;
				x = (min + max) / 2;
				System.out.println("Is it " + x);
				ans = input.nextLine();
			}
			if (ans.equals("higher")) {
				min = x;
				x = (min + max) / 2;
				System.out.println("Is it " + x);
				ans = input.nextLine();

			}
		}
		System.out.println("Your number was " + x);
	}
}