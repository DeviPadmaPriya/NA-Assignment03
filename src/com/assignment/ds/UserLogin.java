package com.assignment.ds;

import java.util.Scanner;

public class UserLogin {

	public static void main(String[] args) {
         
		String username="priya";
		String password="dpp333";
		
		int count=0;
		int maxCount=3;
		int remcount;
		
		Scanner sc = new Scanner (System.in);
		
		while(count< maxCount) {
			System.out.println("Enter UserName:");
			String uname=sc.nextLine();
			System.out.println("Enter Password:");
			String pwd =sc.nextLine();
			
		if(uname.equals(username) && (pwd.equals(password))) {
			System.out.println("Welcome " + username);
			break;
		}
		else {
			count++;
			remcount=maxCount-count;
			System.out.println("u have "+remcount +" chance try to login with correct credentials..." );
		}
		
		}
		if (count == maxCount) {
			System.out.println("Contact admin");
		}
	}

}
