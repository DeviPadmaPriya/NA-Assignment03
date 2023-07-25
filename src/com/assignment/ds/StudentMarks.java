package com.assignment.ds;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Subject1:");
          int s1= sc.nextInt();
      System.out.println("Subject 2:");
         int s2= sc.nextInt();
      System.out.println("Subject 3:");
         int s3= sc.nextInt();
      
       if(s1>60 &&s2>60 && s3>60 ) {
    	   System.out.println("Result : Pass!!");
       }
       else if(s1>60 && s2>60 || s2>60 && s3>60 || s2>60 && s3>60 || s1>60 && s3>60){
    	   System.out.println("Result :Promoted");
    	   
       }
       else if(s1<60 || s2<60|| s3<60){
    	   System.out.println("Fail");
    	   
       }
       
       }

	
       
	}


