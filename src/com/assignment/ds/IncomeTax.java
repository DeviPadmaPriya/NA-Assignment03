package com.assignment.ds;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      System.out.println("Enter the salary:");
      double sal=sc.nextDouble();
      
      double tax=0;
      
      if(sal<=180000) {
    	  tax=0;
      }
      else if(sal>=180000 && sal<=300000){
    	  tax=0.1*(sal-180000);
      }
      else if(sal>=300001 && sal<=500000) {
    	  tax=0.2*(sal-300000);
      }
      else if(sal<=500001 && sal<=1000000){
    	  tax=0.3*(sal-500000);
      }
      
      System.out.println(tax);
	}

}
