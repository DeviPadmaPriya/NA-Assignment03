package com.assignment.ds;

public class ArmstrongRange {

	public static void main(String[] args) {
		System.out.print("ArmstrongNumbers between 100 and 999: ");
		
		for(int num=100;num<=999;num++) {
			int temp=num;
			int r=0,sum=0;
			
			while(temp>0) {
				 r=temp%10;
				 sum=sum+(r*r*r);
				 temp=temp/10;
				 
			}
			if(num==sum) {	
				System.out.println(num);
			}
		}
          
	}

}
