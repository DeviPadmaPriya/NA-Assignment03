package com.assignment.ds;

import java.util.Scanner;

public class SearchNum {

	public static void main(String[] args) {
                int[] num = {5,12,14,6,78,19,1,23,8,35,37,7,52,86,47};
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the number to check present or not:");
                int check =sc.nextInt();
                
                for(int i=0;i<num.length;i++) {
                	if(check == num[i]) {
                		System.out.println(check +" is present in the array"); 
                	}
                	else {
                		System.out.println(check +" is not present in the array"); 
                	break;
                	}
                	
                }
                
                
	}

}
