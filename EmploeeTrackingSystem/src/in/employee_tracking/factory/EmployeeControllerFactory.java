package in.employee_tracking.factory;

import in.employee_tracking.controller.EmployeeControllerImpl;
import in.employee_tracking.controller.IEmployeeController;

public class EmployeeControllerFactory {

	
	private static IEmployeeController employeeController = null;

	public static IEmployeeController getEmployeeController() {

		if (employeeController == null)
			employeeController = new EmployeeControllerImpl();

		return employeeController;

	}

}
