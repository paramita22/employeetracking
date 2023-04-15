package in.employee_tracking.controller;

import in.employee_tracking.Model.employee1;

public interface IEmployeeController {

		String save(employee1 employee);// Creating a record

		employee1 findById(Integer Empid);// Reading a record

		String updateById(employee1 employeeRecord);// Updating a record

		String deleteById(Integer Empid);// Deleting a record

	}


