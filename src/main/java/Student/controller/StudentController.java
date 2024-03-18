package Student.controller;

import Student.dao.StudentDao;
import Student.dto.Student;

public class StudentController {

	public static void main(String[] args) {

		//Svae insert value
		
//		Student student=new Student();
//		student.setId(5);
//		student.setName("Darshan Patil");
//		student.setAddress("Chopda");
		StudentDao studentDao= new StudentDao();
//		studentDao.saveStudent(student);
//		
		
//		 StudentDao  studentDao= new StudentDao();
		//find student 
//		 studentDao.findStudent(5);
		 
		 //deleted
		 studentDao.deleteStudent(5);
		
		//Update
//		
//		Student student= new Student();
//		student.setName("Darshan");
//		student.setAddress("Mumbai");
//		
//		StudentDao studentDao = new StudentDao();
//		studentDao.updateStudent(4, student);
//		
		
	}

}
