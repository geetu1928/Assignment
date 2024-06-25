package com.assignment;

public class Armstrongnum_13 {
	public static void arm(int num) {
		int temp=0;
		if(num>0) {
			int rev=num%10;
			temp=rev*rev*rev;
			num/=10;
			
		}
		if(num<temp) {
			System.out.println("it is a armstrong");
		}
		else {
			System.out.println("it is not a armstrong");
		}
	}

	public static void main(String[] args) {
		
		arm(150);

	}

}