package in.employee_tracking.service;

import in.employee_tracking.Model.employee1;

public interface IEmployeeService {

	employee1 findById(Integer empid);

	String deleteById(Integer empid);

	String updateById(employee1 employee);

	String save(employee1 employee);

}
