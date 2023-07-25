package com.assignment.oops;

public class SingletonMain {

	public static void main(String[] args) {
            Singleton s1= Singleton.getInstance();
            Singleton s2=Singleton.getInstance();
            
            
            if(s1==s2) {
            	System.out.println("Both instance are same");
            }
            else {
            	System.out.println("Singleton is not working properly");
            }
	}

}
