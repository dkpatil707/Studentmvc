package Student.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Student.dto.Student;

public class StudentDao {

	public void saveStudent(Student student) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
	}

	//find student 
	
	public void findStudent(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Student dbStudent=entityManager.find(Student.class,id);
		
		
		if(dbStudent != null) {
			System.out.println(dbStudent);
		}
		else {
			System.out.println("Sorry id is not Present");

		}
	}
	
	//deleted student
	
	public void deleteStudent(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Student dbStudent=entityManager.find(Student.class,id);
		
		if(dbStudent !=null) {
			//id is present and that 
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(dbStudent);
			entityTransaction.commit();
			
		}
		else {
			//
			System.out.println("Sorry it is not Present");
		}
	}
	
	//update 
	public void updateStudent(int id , Student student) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Student dbStudent=entityManager.find (Student.class,id);
		
		if(dbStudent != null) {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			student.setId(id);
			entityManager.merge(student);
			entityTransaction.commit();
			
		}
		else {
			System.out.println("Sorry id is not present to update the data");
		}
		
		
		
		
	}
	
}
