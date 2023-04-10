package in.employee_tracking.factory;

import in.employee_tracking.controller.AddressControllerImpl;

import in.employee_tracking.controller.IAddressController;

public class AddressControllerfactory {

	
	private static IAddressController addressController = null;

	public static IAddressController getAddressController() {

		if (addressController == null)
			addressController = new AddressControllerImpl();

		return addressController;

	}
}
