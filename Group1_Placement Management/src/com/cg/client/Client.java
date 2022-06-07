package com.cg.client;

import java.time.LocalDate;

import com.cg.entities.Admin;
import com.cg.entities.Certificate;
import com.cg.entities.College;
import com.cg.entities.Placement;
import com.cg.entities.Student;
import com.cg.entities.User;
import com.cg.service.AdminServiceImpl;
import com.cg.service.IAdminService;
import com.cg.service.IPlacementService;
import com.cg.service.IStudentService;
import com.cg.service.IUserService;
import com.cg.service.PlacementServiceImpl;
import com.cg.service.StudentServiceImpl;
import com.cg.service.UserServiceImpl;
import com.cg.service.ICertificateService;
import com.cg.service.ICollegeService;
import com.cg.service.CertificateServiceImpl;
import com.cg.service.CollegeServiceImpl;


@SuppressWarnings("unused")
public class Client {

	public static void main(String[] args) 
	{
		//Creating an object of all entity files
		
		// Create	
		
		//Student Instances
		/*
		Student student=new Student();
		student.setName("Rohit Moholkar");
		student.setCollege("Pune University");
		student.setRoll(52);
		student.setQualification("BE");
		student.setCourse("E&TC");
		student.setYear(2019);
		student.setHallTicketNo(254); 
		
		Certificate certificate = new Certificate();
		certificate.setYear(2019);
		certificate.setCollege("Pune");
		
		student.setCertificate(certificate);
		certificate.setStudent(student);
		
		IStudentService service=new StudentServiceImpl();
		service.addStudent(student);
		System.out.println("One Student and One Certificate added successfully to database");
		/*
		//Certificate Instances
		
		Certificate certificate = new Certificate();
		ICertificateService s1 = new CertificateServiceImpl();
		certificate.setYear(2021);
		certificate.setCollege("Mumbai University");
		
		s1.addCertificate(certificate);
		System.out.println("New Certificate added successfully to database");
		*/
		
		/*
		//College Instances
		
		College col = new College();
		ICollegeService c1 = new CollegeServiceImpl();
		
		
		col.setCollegeAdmin("Principal");
		col.setCollegeName("Nagpur University");
		col.setLocation("Nagpur");
		
		c1.addCollege(col);
		System.out.println("New College added successfully to database");
		*/
		
		
		
		//Placement Instances
		 /*
	    Placement placement=new Placement();
	    IPlacementService service1 =new PlacementServiceImpl();
	    
	    
		placement.setName("Capegemini Off Campus Placement");
		placement.setCollege("Pune College");
		placement.setDate(LocalDate.now());
		placement.setQualification("BE/BTech");
		placement.setYear(2020);
		
		service1.addPlacement(placement);
		System.out.println("New Placement added successfully to database");
		*/
		
		
		User u=new User();
		
		u.setName("Rohit@gmail.com");
		u.setType("Student");
		u.setPassword("Rohit#123");
		
		IUserService user=new UserServiceImpl();
		User u2 = user.addNewUser(u);
		user.login(u2);
		
		
		/*
		Admin a=new Admin();
		IAdminService ad=new AdminServiceImpl();
		a.setName("Hritik Jain");
		a.setPassword("Hritik@123");
	    
	    ad.addNewAdmin(a);
	    
		System.out.println("Data is inserted");
		*/
		
		
		//Retrieve
		/*
		Student student=new Student();
		IStudentService service=new StudentServiceImpl();
		
		System.out.println("Student Information");
		
		student = service.searchStudentById(101);
		System.out.println("ID is :"+student.getId());
		System.out.println("Roll No. is :"+student.getRoll());
		System.out.println("College Name is :"+student.getCollege());
	
		System.out.println("Certificate Information");
		
		Certificate certificate = new Certificate();
		ICertificateService s1 = new CertificateServiceImpl();
		certificate = s1.searchCertificate(3);
		System.out.println("Certificate ID is :"+certificate.getId());
		System.out.println("Year is :"+certificate.getYear());
		System.out.println("College Name is :"+certificate.getCollege());
	
		System.out.println("College Information");
		
		College col = new College();
		ICollegeService c1 = new CollegeServiceImpl();
		col = c1.searchCollegeById(1);
		System.out.println("College ID is :"+col.getId());
		System.out.println("College Admin is :"+col.getCollegeAdmin());
		System.out.println("College Name is :"+col.getCollegeName());
		System.out.println("College location is :"+col.getLocation());
		
		System.out.println("Placement Information");
		
		Placement placement=new Placement();
	    IPlacementService service1 =new PlacementServiceImpl();
	    placement = service1.searchPlacementById(301);
	    System.out.println("Placement ID is :"+placement.getId());
		System.out.println("Placement Name is :"+placement.getName());
		System.out.println("Placement College name is :"+placement.getCollege());
		System.out.println("Placement Date is :"+placement.getDate());
		System.out.println("Placement for the batch year:"+placement.getYear());
		System.out.println("For Placement Qualification required :"+placement.getQualification());
		*/
		
		
		
		//Update
		/*
		Student student=new Student();
		IStudentService service=new StudentServiceImpl();
		student = service.searchStudentById(106);
		student.setName("Amey Banarase");
		service.updateStudent(student);
		System.out.println("Update is Successfully");
		*/
		
		/*placement = service.searchPlacementById(105);
		placement.setName("Prateyncha Rathod");
		service.updatePlacement(placement);
		System.out.println("Update is Successfully");*/
		
		
		
		//Delete
		/*
		Student student=new Student();
		IStudentService service=new StudentServiceImpl();
		student = service.searchStudentById(104);
		service.deleteStudent(104);
	
		System.out.println("Delete Successfully");
		*/
		
		
	
		
	}

}
