package in.employee_tracking.dao;

import in.employee_tracking.Model.Employee;

public interface IEmployeeDao {

	String deleteById(Integer Empid);

	String updateById(Employee employee);

	Employee findById(Integer Empiod);

	String save(Employee employee);

	

}
