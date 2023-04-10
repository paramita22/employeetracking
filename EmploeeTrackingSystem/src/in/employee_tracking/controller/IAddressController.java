package in.employee_tracking.controller;

import in.employee_tracking.Model.Address;


public interface IAddressController {

	String save1(Address address);// Creating a record

	String findById(Integer Empid);// Reading a record

	String updateById(Integer Empid);// Updating a record

	String deleteById(Integer Empid);// Deleting a record

	
}
