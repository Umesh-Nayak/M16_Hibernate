package com.tns.client;

import com.tns.entities.Student;
import com.tns.service.StudentService;
import com.tns.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		//CRUD Operation calling activity
		Student student=new Student();
		StudentService service=new StudentServiceImpl();
		
		
		//create operation
		student.setID(24);
		student.setName("Akash");
		service.addStudent(student);
		
		/*//Retrieve data-find();
		student=service.findStudentById(21);
		System.out.println("ID: "+student.getID());
		System.out.println("ID: "+student.getName());*/
		
		
		/*//update
		student=service.findStudentById(21);
		student.setName("Nikitha");
		service.updateStudent(student);*/
		
		//delete
		student=service.findStudentById(21);
		service.removeStudent(student);
		
		

	}

}
