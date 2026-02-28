package com.capg.layer;

import java.util.Scanner;


public class StudentController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		try {
			boolean flag = true;
			
			while(flag) {
				System.out.println("\n--- Student CRUD Menu ---");
		        System.out.println("1. Insert Student");
		        System.out.println("2. Load Student");
		        System.out.println("3. Update Student");
		        System.out.println("4. Delete Student");
		        System.out.println("5. Exit");
		        
		        System.out.print("Enter your choice: ");
		        int choice = sc.nextInt();
		        
		        switch(choice) {
			        case 1 : 
			        	try {
			        		System.out.print("Enter Student ID: ");
			    	        int id = sc.nextInt();

			    	        sc.nextLine();
			    	        System.out.print("Enter Name: ");
			    	        String name = sc.nextLine();

			    	        System.out.print("Enter Marks: ");
			    	        double marks = sc.nextDouble();
			    	        
			    	        StudentService service = new StudentService();
			    	        int result = service.addStudent(id , name , marks);
			    	        
			    	        System.out.println("Record inserted: " + result);
			        		
			        	}
			        	catch(Exception e) {
			        		e.printStackTrace();
			        		System.out.println(e);
			        	}
			        	break;
			        
			        case 2 : 
			        	try {
			        		System.out.print("Enter Student ID to load/fetch the student : ");
			    	        int student_id = sc.nextInt();
			        		
			    	        StudentService service = new StudentService();
			    	        StudentBean sb = service.loadStudent(student_id);
			        		
			        		if(sb != null) {
			        			System.out.println("Student Id: " + sb.getStudentId());
			                    System.out.println("Student Name: " + sb.getName());
			                    System.out.println("Student Marks: " + sb.getMarks());
			                    System.out.println("Student Result: " + sb.getResult());
			        		}
			        		else {
			        			System.out.println("Student not found");
			        		}
			        	}
			        	catch(Exception e) {
			        		e.printStackTrace();
			        		System.out.println(e);
			        	}
			        	break;
			        	
			        case 3 : 
			        	try {
			        		System.out.print("Enter Student Id to Update: ");
			                int student_id = sc.nextInt();

			                sc.nextLine();
			                System.out.print("Enter New Student Name : ");
			                String newName = sc.nextLine();
			                
			                StudentService service = new StudentService();
			                int result = service.updateStudent(student_id , newName);
			                
			                System.out.println("Record updated: " + result);
			        	}
			        	catch(Exception e) {
			        		e.printStackTrace();
			        		System.out.println(e);
			        	}
			        	break;
			        	
			        case 4 : 
			        	try {
			        		System.out.print("Enter Student Id to Delete: ");
			                int student_id = sc.nextInt();
			                
			                StudentService service = new StudentService();
			                int result = service.deleteStudent(student_id);
			                
			                System.out.println("Record deleted: " + result);
			        	}
			        	catch(Exception e) {
			        		e.printStackTrace();
			        		System.out.println(e);
			        	}
			        	break;
			        	
			        case 5 :
			        	flag = false;
		                System.out.println("Exiting...");
		                break;
		                
		            default : 
		            	System.out.println("Invalid Choice");
			    }
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			if(sc != null) {
				sc.close();
			}
		}

	}

}