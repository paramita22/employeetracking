package in.employee_tracking.controller;

import in.employee_tracking.Model.address1;


public interface IAddressController {

	String save1(address1 address1);// Creating a record

	String findById(Integer Empid);// Reading a record

	String updateById(Integer Empid);// Updating a record

	String deleteById(Integer Empid);// Deleting a record

	
}
