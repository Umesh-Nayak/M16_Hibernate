package com.tns.inheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Employee emp=new Employee();
		emp.setName("Hrishi");
		emp.setSalary(35000);
		em.persist(emp);
	
		Employee emp1=new Employee();
		emp1.setName("Swapnil");
		emp1.setSalary(40000);
		em.persist(emp1);
		
		
		Manager mg=new Manager();
		mg.setName("Saket");
		mg.setSalary(55000);
		mg.setDeptName("Information Technology");
		em.persist(mg);
		
		em.getTransaction().commit();
		System.out.println("Added Employees and Manager Successfully");
		em.close();
		factory.close();
		
	}

}