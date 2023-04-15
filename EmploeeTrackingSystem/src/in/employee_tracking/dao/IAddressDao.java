package in.employee_tracking.dao;

import in.employee_tracking.Model.address1;



public interface IAddressDao {

	public String deleteById(Integer Empid);

	public address1 findById(Integer Empid);

	public String updateById(Integer Empid);

	public String save1(address1 address1);

	String save(address1 address);

}
