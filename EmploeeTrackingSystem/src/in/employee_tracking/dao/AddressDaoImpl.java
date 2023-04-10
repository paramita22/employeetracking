package in.employee_tracking.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.employee_tracking.Model.Address;
import in.employee_tracking.Model.Employee;
import in.employee_tracking.util.HibernateUtil;

public class AddressDaoImpl implements IAddressDao{

Session session = HibernateUtil.getSession();
Serializable Empid;
Serializable zip_code;
Employee address;
Employee employee;


	@Override
	public String save(Employee employee) {
	Transaction transaction = session.beginTransaction();
	session.save(employee);
	boolean flag = true;
	String status = null;
	if (flag) {
		transaction.commit();
		status = "success";
	} else {
		transaction.rollback();
		status = "failure";
	}
	return status;
}

	
	@Override
	public String save1(Address address) {
		Transaction transaction = session.beginTransaction();
		session.save(address);
		boolean flag = true;
		String status = null;
		if (flag) {
			transaction.commit();
			status = "success";
		} else {
			transaction.rollback();
			status = "failure";
		}
		return status;
	}

	@Override
	public Employee findById(Integer Empid) {
		address = session.get(Employee.class, zip_code);
		return address;
	}

	@Override
	public String updateById(Integer Empid) {
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(employee);
		
		boolean flag = true;
		String status = null;
		if (flag) {
			transaction.commit();
			status = "success";
		} else {
			transaction.rollback();
			status = "failure";
		}
		return status;
	}

	@Override
	public String deleteById(Integer Empid) {
		Transaction transaction = session.beginTransaction();
		Employee employee = findById(Empid);
		
		if (employee != null) {
			session.delete(employee);
			boolean flag = true;
			String status = null;
			if (flag) {
				transaction.commit();
				status = "success";
			} else {
				transaction.rollback();
				status = "failure";
			}
			return status;

		} else {
			return "notfound";
		}

	}


}
