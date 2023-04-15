package in.employee_tracking.service;

import in.employee_tracking.Model.address1;
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
		public String save1(address1 address1) {
			addressDao = AddressDaoFactory.getAddressDao();
			return addressDao.save1(address1);
		}

		@Override
		public String findById(Integer Empid) {
			// TODO Auto-generated method stub
			return null;
		}

}
