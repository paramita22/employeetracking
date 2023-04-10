package in.employee_tracking.controller;

import in.employee_tracking.Model.Employee;

public interface IEmployeeController {

		String save(Employee employee);// Creating a record

		Employee findById(Integer Empid);// Reading a record

		String updateById(Employee employeeRecord);// Updating a record

		String deleteById(Integer Empid);// Deleting a record

	}


