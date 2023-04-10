package in.employee_tracking.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import in.employee_tracking.Model.Employee;
import in.employee_tracking.Model.Manager;
import in.employee_tracking.Model.Address;
import in.employee_tracking.controller.IEmployeeController;
import in.employee_tracking.factory.EmployeeControllerFactory;

public class TestApp {

	public static void main(String[] args) {
		IEmployeeController employeeController = null;
		String status = null, emp_name = null, project_name = null, street=null, city=null, state=null, country=null, Department_name=null, TimeSheet_begin=null, TimeSheet_end=null;
		int Empid = 0, zip_code=0, NoIndReport=0;
		Address address=new Address();
		Employee employeeRecord = null;

		try {
			while (true) {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

				System.out.println("1. CREATE");
				System.out.println("2. READ");
				System.out.println("3. UPDATE");
				System.out.println("4. DELETE");
				System.out.println("5. EXIT");
				System.out.print("Your Option :: [1,2,3,4,5]:: ");
				Integer option = Integer.parseInt(br.readLine());

				employeeController = EmployeeControllerFactory.getEmployeeController();

				switch (option) {
				case 1:
					System.out.print("Enter the id of Employee:: ");
					Empid = Integer.parseInt(br.readLine());
					
					System.out.print("Enter the name of Employee:: ");
					emp_name = br.readLine();

					System.out.print("Enter the name of project in which the employee is involved:: ");
					project_name = br.readLine();
					
					System.out.print("Enter the zip_code of Employee:: ");
					zip_code = Integer.parseInt(br.readLine());
					
					System.out.print("Enter the street of Employee:: ");
					street = br.readLine();
					
					System.out.print("Enter the city of Employee:: ");
					city = br.readLine();
					
					System.out.print("Enter the state of Employee:: ");
					state = br.readLine();
					
					System.out.print("Enter the country of Employee:: ");
					country = br.readLine();
					
					System.out.println("Enter the department name of employee:");
					Department_name=br.readLine();
					
					System.out.println("Enter the number of employees involved in the project of the Employee mentioned:");
					NoIndReport=Integer.parseInt(br.readLine());
					
					System.out.println("Enter the date-time the project begins");
					TimeSheet_begin=br.readLine();
					
					System.out.println("Enter the date of completion scheduled:");
					TimeSheet_end=br.readLine();
				
					
					Employee employee = new Employee(Empid, emp_name, project_name, address);
					employee.setEmpid(Empid);
					employee.setEmployeeName(emp_name);
					employee.setProjectName(project_name);
					
					address.setEmpid(Empid);
					address.setZip_code(zip_code);
					address.setStreet(street);
					address.setCity(city);
					address.setState(state);
					address.setCountry(country);
					
					employee.setEmployeeAddress(address);
					
					Manager manager=new Manager();
					manager.setEmpid(Empid);
					manager.setProjectName(project_name);
					manager.setDepartment_name(Department_name);
					manager.setNoIndReport(NoIndReport);
					manager.setTimesheet_begin(TimeSheet_begin);
					manager.setTimesheet_end(TimeSheet_end);

					status =employeeController.save(employee);
					if (status.equalsIgnoreCase("success")) {
						System.out.println("Record inserted succesfully...");
					} else if (status.equalsIgnoreCase("failure")) {
						System.out.println("Record insertion failed...");
					} else {
						System.out.println("Some problem occured...");
					}
					break;
				case 2:
					System.out.print("Enter the id:: ");
					Empid = Integer.parseInt(br.readLine());
					employeeRecord = employeeController.findById(Empid);
					if (employeeRecord != null)
						System.out.println(employeeRecord);
					else
						System.out.println("Record not available for the given id ::" + Empid);
					break;

				case 3:
					System.out.print("Enter the id of the record to be updated:: ");
					Empid = Integer.parseInt(br.readLine());

					employeeRecord = employeeController.findById(Empid);

					if (employeeRecord != null) {
						employeeRecord.setEmpid(Empid);

						System.out.print("EmployeetName ::[Old Name is :: " + employeeRecord.getEmployeeName() + "]:  ");
						String newName = br.readLine();
						if (newName == null || newName.equals("")) {
							employeeRecord.setEmployeeName(employeeRecord.getEmployeeName());
						} else {
							employeeRecord.setEmployeeName(newName);
						}

						System.out.println(employeeRecord);

						status = employeeController.updateById(employeeRecord);
						if (status.equalsIgnoreCase("success")) {
							System.out.println("Record updated succesfully...");
						} else if (status.equalsIgnoreCase("failure")) {
							System.out.println("Record updation failed...");
						} else {
							System.out.println("Some problem occured...");
						}
					} else {
						System.out.println("Record not available for the given id ::" + Empid);
					}
					break;

				case 4:
					System.out.print("Enter the id:: ");
					Empid = Integer.parseInt(br.readLine());
					status = employeeController.deleteById(Empid);
					if (status.equalsIgnoreCase("success")) {
						System.out.println("Record deleted succesfully...");
					} else if (status.equalsIgnoreCase("failure")) {
						System.out.println("Record deletion failed...");
					} else {
						System.out.println("Record not available for the given id to delete...");
					}
					break;

				case 5:
					System.out.println("Thanks for using the application");
					System.exit(0);

				default:
					System.out.println("Plz enter the option like 1,2,3,4,5 for operation");
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
