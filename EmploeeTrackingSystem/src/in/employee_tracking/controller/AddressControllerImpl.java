package in.employee_tracking.controller;

import in.employee_tracking.Model.address1;
import in.employee_tracking.factory.AddressServiceFactory;
import in.employee_tracking.service.IAddressService;


public class AddressControllerImpl implements IAddressController{

	IAddressService addressService;

	public String save1(address1 address1) {
		addressService = AddressServiceFactory.getAddressService();
		return addressService.save1(address1);
	}

	@Override
	public String findById(Integer Empid) {
		addressService = AddressServiceFactory.getAddressService();
		return addressService.findById(Empid);
	}

	@Override
	public String updateById(Integer Empid) {
		addressService = AddressServiceFactory.getAddressService();
		return addressService.updateById(Empid);
	}

	@Override
	public String deleteById(Integer Empid) {
		addressService = AddressServiceFactory.getAddressService();
		return addressService.deleteById(Empid);
	}
	
}
