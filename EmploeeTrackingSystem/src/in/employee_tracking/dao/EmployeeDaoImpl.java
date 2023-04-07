package in.employee_tracking.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.employee_tracking.Model.Employee;
import in.employee_tracking.util.HibernateUtil;

public class EmployeeDaoImpl implements IEmployeeDao {


	Session session = HibernateUtil.getSession();
	
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
	public Employee findById(Integer Empid) {
		Employee employee = session.get(Employee.class, Empid);
		return employee;
	}

	@Override
	public String updateById(Employee employee) {
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
	public String deleteById(Integer sid) {
		Transaction transaction = session.beginTransaction();
		Employee employee = findById(sid);
		
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
