package in.employee_tracking.factory;

import in.employee_tracking.service.EmployeeServiceImpl;
import in.employee_tracking.service.IEmployeeService;

public class EmployeeServiceFactory {

	private static IEmployeeService employeeServiceImpl ;

	private EmployeeServiceFactory() {
	}

	public static  IEmployeeService getEmployeeService() {
		if (employeeServiceImpl == null)
			employeeServiceImpl = new EmployeeServiceImpl();

		return employeeServiceImpl;
	}
}
