package in.employee_tracking.dao;

import in.employee_tracking.Model.employee1;

public interface IEmployeeDao {

	String deleteById(Integer Empid);

	String updateById(employee1 employee);

	employee1 findById(Integer Empiod);

	String save(employee1 employee);

	

}
