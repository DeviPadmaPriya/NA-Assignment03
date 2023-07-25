package com.assignment.oops;

public class Labour extends Employee {

	private double overtime;

	
	public Labour(String name, double salary, double overtime) {
		super(name, salary);
		this.salary = salary;
		this.overtime = overtime;
	}



	@Override
	public double Totalsalary() {
		return salary+overtime;
    	
    }
	

}
