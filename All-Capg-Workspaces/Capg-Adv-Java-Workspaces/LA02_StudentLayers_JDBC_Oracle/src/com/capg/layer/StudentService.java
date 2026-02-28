package com.capg.layer;

public class StudentService {
	
//	INSERT
	public int addStudent(int id , String name , double marks) throws Exception {
		String result;

        if(marks < 35) {
            result = "FAIL";
        }
        else if(marks <= 60) {
            result = "PASS";
        }
        else if(marks <= 80) {
            result = "FIRST CLASS";
        }
        else {
            result = "DISTINCTION";
        }
        
        StudentBean sb = new StudentBean();
        sb.setStudentId(id);
        sb.setName(name);
        sb.setMarks(marks);
        sb.setResult(result);
        
        StudentDAO sdao = new StudentDAO();
        int res = sdao.addStudent(sb);
        
        return res;
	}
	
//	FETCH
	public StudentBean loadStudent(int id) {
		
		StudentDAO sdao = new StudentDAO();
		StudentBean sb = sdao.getStudent(id);
		
		return sb;
	}
	
//	UPDATE
	public int updateStudent(int id , String newName) {
		
		StudentDAO sdao = new StudentDAO();
		int result = sdao.updateStudent(id , newName);
		
		return result;
	}
	
//	DELETE
	public int deleteStudent(int id) {
		StudentDAO sdao = new StudentDAO();
		int result = sdao.deleteStudent(id);
		
		return result;
	}
	
}