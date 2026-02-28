package com.capg.layer;

import java.io.Serializable;

public class StudentBean implements Serializable{
	private int studentId;
	private String name;
	private double marks;
	private String result;
	
	public StudentBean() {
//		default constructor
	}
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {''[]=
		this.marks = marks;
	}
	
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
		
}