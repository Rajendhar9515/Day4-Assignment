package com.bridglab.java.EmployeeWage;

public class EmpWageUC2 {

	public static void main(String[] args) {
		int isFullTime = 1;
		int empRatePerHr = 20;
		int empWage = 0;
		int empHrs = 0;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if(empCheck == isFullTime) {
			empHrs = 8;
		}
		else {
			empHrs = 0;
		}
		empWage = (empHrs * empRatePerHr);
		System.out.println("EmpWage :" + empWage);
			

	}

}
