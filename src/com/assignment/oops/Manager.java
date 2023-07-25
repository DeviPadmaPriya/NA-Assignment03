package com.assignment.oops;

public class Manager extends Employee {
	
	private double incentive;
	
	
	
	public Manager(String name, double salary, double incentive) {
		super(name, salary);
		this.incentive = incentive;
	}



	@Override
	public double Totalsalary() {
		return salary+incentive;
    	
    }




	

}
