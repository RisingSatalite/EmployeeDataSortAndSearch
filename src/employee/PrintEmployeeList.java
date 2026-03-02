package employee;

import java.util.ArrayList;

public class PrintEmployeeList {
	public void PrintListOfEmployees (ArrayList<EmployeeRecord> employeeArray) {
		for (EmployeeRecord em : employeeArray) {
		    System.out.println(em.toString());
		}
	}
	
	public void PrintListOfEmployeesAndSalaries (ArrayList<EmployeeRecord> employeeArray) {
		for (EmployeeRecord em : employeeArray) {
            System.out.println(em.toString() + " | Calculated Salary: " + em.calcHourlySalary());
        }
	}
}
