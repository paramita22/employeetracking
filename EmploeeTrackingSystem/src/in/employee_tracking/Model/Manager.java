package in.employee_tracking.Model;

import javax.persistence.Entity;


@Entity
public class Manager extends Employee{
		
		
	
	
		public Manager(int Empid, String employee_name, String project_name, Address employee_address) {
		super(Empid, employee_name, project_name, employee_address);
		// TODO Auto-generated constructor stub
	}





		private String Project_name;
		private String Department_name;
		private String NoIndReport;
		private String Timesheet_begin;
		private String Timesheet_end;
		
		

		public Manager() {
			super(Empid,employee_name,project_name,employee_address);
			// TODO Auto-generated constructor stub
		}



		public String getProject_name() {
			return Project_name;
		}





		public void setProject_name(String Project_name) {
			this.Project_name = Project_name;
		}





		public String getDepartment_name() {
			return Department_name;
		}





		public void setDepartment_name(String Department_name) {
			this.Department_name = Department_name;
		}





		public String getNoIndReport() {
			return NoIndReport;
		}





		public void setNoIndReport(String NoIndReport) {
			this.NoIndReport = NoIndReport;
		}





		public String getTimesheet_begin() {
			return Timesheet_begin;
		}





		public void setTimesheet_begin(String Timesheet_begin) {
			this.Timesheet_begin = Timesheet_begin;
		}





		public String getTimesheet_end() {
			return Timesheet_end;
		}





		public void setTimesheet_end(String timesheet_end) {
			this.Timesheet_end = timesheet_end;
		}





		@Override
		public String toString() {
			return "Manager [Project_name=" + Project_name + ", Department_name=" + Department_name + ", NoIndReport=" +NoIndReport + ", Timesheet_begin=" + Timesheet_begin + ", Timesheet_end=" +Timesheet_end+"]";
		}

	}

