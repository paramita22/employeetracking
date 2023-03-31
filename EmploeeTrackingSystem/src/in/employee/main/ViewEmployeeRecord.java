package in.employee.main;


import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.employee.Model.Employee;
public class ViewEmployeeRecord {

	public static void main(String[] args) {
		
				Configuration cfg = new Configuration();

				
				cfg.configure();

			
				SessionFactory sessionFactory = cfg.buildSessionFactory();

				Session session = sessionFactory.openSession();

				
				Transaction transaction = session.beginTransaction();

				Employee employee = new Employee();
				employee.setEmpId(10);
				employee.setEmpName("sachin");
				employee.setEmpSal(54556.7);

				
				Serializable object = session.save(employee);
				System.out.println(object);

				
				transaction.commit();

				
				session.close();


	}

}
