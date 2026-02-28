package com.springcore;

public class EmployeeServiceImpl implements EmployeeService{
	int empNo;
	String empName;
	double empSal;
	
	public EmployeeServiceImpl() {}
	
	public EmployeeServiceImpl(int empNo,String empName,double empSal) {
		this.empNo = empNo;
		this.empName = empName;
		this.empSal = empSal;
	}


	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	
	public void EmployeeDetails() {
		System.out.println("Employee Details: ");
		System.out.println("Employee Number: "+empNo);
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee Salary: "+empSal);
		System.out.println("==============================");
	}

}
