package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int min = 0;
		int max = 100;
		int x = 50;
		int guesses = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = input.nextLine();
		System.out.println("I will try to guess " + name + "'s number and " + name + " will type higher if I should go higher and lower if I should go lower. Once I guess your number, "+name+" will type correct" );
		System.out.println("Is " + name + "'s number "+ x);
		String ans = input.nextLine();
		while (!(ans.equals("correct"))) {
			if (ans.equals("lower")) {
				max = x;
				x = (min + max) / 2;
				System.out.println("Is " + name + "'s number "+ x);
				ans = input.nextLine();
				guesses++;
			}
			if (ans.equals("higher")) {
				min = x;
				x = (min + max) / 2;
				System.out.println("Is " + name + "'s number "+ x);
				ans = input.nextLine();
				guesses++;

			}

		}
		System.out.println(name + "'s number was "+ x);
		System.out.println("I guessed your number in " +guesses+ " tries");
	}
}
