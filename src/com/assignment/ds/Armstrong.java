package com.assignment.ds;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the number to check :");
           int num = sc.nextInt();
           int temp=num;
           int r,sum = 0;
           
           while(num>0) {
        	   r=num%10;
        	   num=num/10;
        	   sum=sum + r*r*r; 
           }
           if(temp==sum) {
        	   System.out.println("given number is armstrong");
           }
           else
        	   System.out.println("given num is not armstorng number");
	}

}
