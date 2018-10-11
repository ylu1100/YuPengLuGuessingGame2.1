package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Choose a number between 1-100 and I'll try to guess it.");
    Scanner input = new Scanner(System.in);
	int min = 1;
	int max = 100;
	int mid = 0;
	while (!(input.nextLine() == "correct")) {
	    mid = (min + max)/2;
	    System.out.println("Is your number " + mid + "?");
	    if (input.nextLine() == "too low"){
	        max = max/2;
        }
        if (input.nextLine()=="too high"){
            min = max/2;
        }// write your code here
    }
    System.out.println("Your number was "+ mid);
    }
}
