package com.assignment.ds;

import java.util.Scanner;

public class SimpleCompound {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of principle: ");
		int p=sc.nextInt();
		System.out.println("Enter the value of no.of years:");
		int y=sc.nextInt();
		System.out.println("Enter rate of interest:");
		float r=sc.nextFloat();
		
		double simple=(p*y*r)/100;
		System.out.println("Simple Interest:"+simple);
		
		
		double compound= p*(Math.pow((1+r/100),y))-p;
		System.out.println("Compoud Interest: " +compound);
	}

}
