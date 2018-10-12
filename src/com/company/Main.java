package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int min = 1;
	int max = 100;
	int x = 50;
	String str = "";
		Scanner input = new Scanner(System.in);
		while (!(str == "correct")){
			x = (min + max)/2;			System.out.println("Is your number " + x);
			str = input.nextLine();
		if (str == ">") {
			min = min+x;
		}
		if (str == "<") {
			max = max - x;
		}

	}
    System.out.println(" i knew it " + x);
    }
}
