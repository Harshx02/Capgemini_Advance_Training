package com.capg.hibernate;

import java.sql.Date;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.capg.util.HibernateUtil;


public class EmployeeCRUD {
	
	private SessionFactory factory;
	
	
	public void createEmployee(int empno , String ename , double sal , Date hiredate , int deptno) {
		
		factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
		try {
			Employee emp = new Employee();
			emp.setEmpno(empno);
			emp.setEname(ename);
			emp.setSal(sal);
			emp.setHiredate(hiredate);
			emp.setDeptno(deptno);
			
			session.save(emp);
			txn.commit();
			
			System.out.println("Employee Inserted");
		}
		catch(Exception e) {
			if(txn != null) {
				txn.rollback();
			}
			System.out.println(e);
		}
		finally {
			if(session != null) {
				session.close();
			}
		}
		
	}
	
	public Employee loadEmployee(int empno) {
		factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Employee emp = null;
		
		try {
			emp = (Employee) session.get(Employee.class , empno);;
			
			return emp;
		}
		catch(Exception e) {
			System.out.println("Employee not found");
			System.out.println(e);
			
			return emp;
		}
		finally {
			if(session != null) {
				session.close();
			}
		}
		
	}
	
	public void updateEmployee(int empno , double newSalary) {
		factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
		try {
			Employee emp = (Employee) session.get(Employee.class , empno);;
			
			if(emp != null) {
				emp.setSal(newSalary);
				session.update(emp);
				txn.commit();
				System.out.println("Employee Updated");
			}
			else {
				System.out.println("Employee not found");
			}
		}
		catch(Exception e) {
			if(txn != null) {
				txn.rollback();
			}
			System.out.println(e);
		}
		finally {
			if(session != null) {
				session.close();
			}
		}
		
	}
	
	public void deleteEmployee(int empno) {
		factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
		try {
			Employee emp = (Employee) session.get(Employee.class , empno);;
			
			if(emp != null) {
				session.delete(emp);
				txn.commit();
				System.out.println("Employee Deleted");
			}
			else {
				System.out.println("Employee not found");
			}
		}
		catch(Exception e) {
			if(txn != null) {
				txn.rollback();
			}
			System.out.println(e);
		}
		finally {
			if(session != null) {
				session.close();
			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeCRUD crud = new EmployeeCRUD();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		while(flag) {
			System.out.println("\n--- Employee CRUD Menu ---");
	        System.out.println("1. Insert Employee");
	        System.out.println("2. Load Employee");
	        System.out.println("3. Update Employee");
	        System.out.println("4. Delete Employee");
	        System.out.println("5. Exit");
	        
	        System.out.print("Enter your choice: ");
	        int choice = sc.nextInt();
	        
	        switch(choice) {
		        case 1 : 
		        	try {
		        		System.out.print("Enter empno : ");
		        		int empno = sc.nextInt();
		        		
		        		sc.nextLine();
		        		System.out.print("Enter empName : ");
		        		String empName = sc.nextLine();
		        		
		        		System.out.print("Enter empSalary : ");
		        		int empSal = sc.nextInt();
		        		
		        		sc.nextLine();
		        		System.out.print("Enter Hiredate (yyyy-MM-dd): ");
		        		String dateStr = sc.nextLine();
		        		java.sql.Date hiredate = java.sql.Date.valueOf(dateStr);
		        		
		        		System.out.print("Enter deptNo : ");
		        		int deptno = sc.nextInt();
		        		
		        		crud.createEmployee(empno, empName, empSal, hiredate, deptno);
		        		
		        	}
		        	catch(Exception e) {
		        		e.printStackTrace();
		        		System.out.println(e);
		        	}
		        	break;
		        
		        case 2 : 
		        	try {
		        		System.out.print("Enter empno to load/fetch the employee : ");
		        		int empno = sc.nextInt();
		        		
		        		Employee emp = crud.loadEmployee(empno);
		        		
		        		if(emp != null) {
		        			System.out.println("EmpNo: " + emp.getEmpno());
		                    System.out.println("Name: " + emp.getEname());
		                    System.out.println("Salary: " + emp.getSal());
		                    System.out.println("Hiredate: " + emp.getHiredate());
		                    System.out.println("DeptNo: " + emp.getDeptno());
		        		}
		        		else {
		        			System.out.println("EMployee not found");
		        		}
		        	}
		        	catch(Exception e) {
		        		e.printStackTrace();
		        		System.out.println(e);
		        	}
		        	break;
		        	
		        case 3 : 
		        	try {
		        		System.out.print("Enter EmpNo to Update: ");
		                int upId = sc.nextInt();

		                System.out.print("Enter New Salary: ");
		                double newSal = sc.nextDouble();
		                
		                crud.updateEmployee(upId, newSal);
		        	}
		        	catch(Exception e) {
		        		e.printStackTrace();
		        		System.out.println(e);
		        	}
		        	break;
		        	
		        case 4 : 
		        	try {
		        		System.out.print("Enter EmpNo to Delete: ");
		                int empno = sc.nextInt();
		                
		                crud.deleteEmployee(empno);
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
		
		sc.close();

	}

}