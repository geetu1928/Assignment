package com.assignment;

import java.util.Scanner;

public class SumInInterval_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a first interval:");
		int a=sc.nextInt();
	    System.out.println("Enter a Last interval:");
		int b=sc.nextInt();
		if(a>b) {
			System.out.println("Invalid interval");
		}
		int sum=0;
		for(int i=a;i<=b;i++) {
			sum+=i;
		}
		System.out.println("The sum of number in given interval are " +sum);
	}

}
