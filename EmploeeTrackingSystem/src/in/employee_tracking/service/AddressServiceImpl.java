package in.employee_tracking.service;

import in.employee_tracking.Model.Address;
import in.employee_tracking.dao.IAddressDao;
import in.employee_tracking.factory.AddressDaoFactory;

	public class AddressServiceImpl implements IAddressService {
		
		IAddressDao addressDao;

		@Override
		public String deleteById(Integer Empid) {
			addressDao = AddressDaoFactory.getAddressDao();
			return addressDao.deleteById(Empid);	}

		@Override
		public String updateById(Integer Empid) {
			addressDao = AddressDaoFactory.getAddressDao();
			return addressDao.updateById(Empid);
		}

		@Override
		public String save1(Address address) {
			addressDao = AddressDaoFactory.getAddressDao();
			return addressDao.save1(address);
		}

		@Override
		public String findById(Integer Empid) {
			// TODO Auto-generated method stub
			return null;
		}

}
