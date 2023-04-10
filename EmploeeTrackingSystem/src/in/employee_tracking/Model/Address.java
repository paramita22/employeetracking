package in.employee_tracking.Model;

import javax.persistence.Access;

import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="address")
@Access(value=AccessType.PROPERTY)
public class Address {
		
		@Column(name = "Empid",nullable=false)
		public static int Empid;

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "zip_code")
		protected static int zip_code;
		
		@Column(name="street")
		protected static String street;
		
		@Column(name = "city")
		protected static String city;
		
		@Column(name="state")
		protected static String state;
		
		@Column(name="country")
		protected static String country;
		
		static {
			System.out.println("Employee View Begins...");
		}

		public Address() {
			System.out.println("CRUD operation on employee");
		}

		
		
		@OneToOne
		@PrimaryKeyJoinColumn
		public Employee employee;

		
		public int getEmpid() {
			return Empid;
		}



		public void setEmpid(int Empid) {
			Employee.Empid = Empid;
		}

		
		public int getZip_code() {
			return zip_code;
		}



		public void setZip_code(int zip_code) {
			Address.zip_code = zip_code;
		}



		public String getStreet() {
			return street;
		}



		public void setStreet(String street) {
			Address.street = street;
		}



		public String getCity() {
			return city;
		}



		public void setCity(String city) {
			Address.city = city;
		}



		public String getState() {
			return state;
		}



		public void setState(String state) {
			Address.state = state;
		}



		public String getCountry() {
			return country;
		}



		public void setCountry(String country) {
			Address.country = country;
		}



		@Override
		public String toString() {
			return "Address [zip_code=" + zip_code + ", street=" + street + ", city=" +city + ", state=" + state + ", country=" +country+"]";
		}



		

	}

