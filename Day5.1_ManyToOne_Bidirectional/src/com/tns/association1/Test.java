package com.tns.association1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	public static void main(String[] args) {
					EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
					EntityManager em=factory.createEntityManager();
					em.getTransaction().begin();
					
					//create an employee1
					Employee emp=new Employee();
					emp.setName("Umesh");
					em.persist(emp);
					
					Employee emp1=new Employee();
					emp1.setName("Hrishi");
					em.persist(emp1);
					
					//create an employee1
					Department dp=new Department();
					dp.setDeptId(11);
					dp.setDept_name("Information Technology");
					emp.setDept(dp);
					emp1.setDept(dp);
					em.persist(dp);
					
					em.getTransaction().commit();
					System.out.println("Added Employees and Department Successfully");
					em.close();
					factory.close();
					
				}

			


	

}