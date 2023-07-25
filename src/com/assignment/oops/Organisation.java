package com.assignment.oops;

public class Organisation {

	public static void main(String[] args) {
           Employee e1=new Manager("Akshay",50000.70,4300);
           Employee e2= new Labour("priya",30000,1000);
           Employee e3=new Manager("joe",40000,2500);
           
           double Totalsalary= e1.Totalsalary()+e2.Totalsalary()+e3.Totalsalary();
           System.out.println("Employee 1 Salary "+e1.Totalsalary());
           System.out.println("Employee 2 Salary "+e2.Totalsalary());
           System.out.println("Employee 3 Salary "+e3.Totalsalary());
           
           System.out.println(Totalsalary);
	
	}

}
