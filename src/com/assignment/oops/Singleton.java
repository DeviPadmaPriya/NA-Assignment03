package com.assignment.oops;


class Singleton {
    private static Singleton instance;
    
    
    private Singleton() {
    	
    }
	
    public static Singleton getInstance() {
    	if(instance == null) {
    		instance = new Singleton();
    	}
		return instance;
    	
    }
    
    public void sendMessage() {
    	System.out.println("Singelton Pattern ");
    }

}

//class InheritedSingleton extends Singleton{
//	
//}