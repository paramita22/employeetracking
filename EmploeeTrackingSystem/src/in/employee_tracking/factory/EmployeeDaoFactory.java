package in.employee_tracking.factory;

import in.employee_tracking.dao.EmployeeDaoImpl;
import in.employee_tracking.dao.IEmployeeDao;

public class EmployeeDaoFactory {
	
	private static IEmployeeDao employeeDao = null;

	public static IEmployeeDao getEmployeeDao() {
			if (employeeDao == null)
				employeeDao = new EmployeeDaoImpl();

			return employeeDao;
	}

}
