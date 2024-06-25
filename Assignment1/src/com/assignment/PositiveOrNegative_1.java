package com.assignment;

import java.util.Scanner;

public class PositiveOrNegative_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number:");
		int n=sc.nextInt();
		if(n<0) {
			System.out.println("It is a Negative Number"); 
		}
		else {
			System.out.println("It is a positive Number");
		}

	}

}
