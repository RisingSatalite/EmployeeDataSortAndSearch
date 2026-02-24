package employee;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import employee.Employee;

public class FileReader {
	public ArrayList EmployeeList = new ArrayList<>();
	
	public ArrayList returnArray() {
		File myObj = new File("employeeList/employeesWithoutRepeat.txt");    
	    
	    try (Scanner myReader = new Scanner(myObj)) {
	        while (myReader.hasNextLine()) {
	          String data = myReader.nextLine();
	          System.out.println(data);
	          EmployeeList.add();
	        }
	      } catch (FileNotFoundException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	}
	
	public ArrayList returnArray(String file) {
		File myObj = new File(file);    
	    
	    try (Scanner myReader = new Scanner(myObj)) {
	        while (myReader.hasNextLine()) {
	          String data = myReader.nextLine();
	          System.out.println(data);
	          EmployeeList.add();
	        }
	      } catch (FileNotFoundException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	}
	
	public static void main(String[] args) {
		FileReader reader = new FileReader();
		reader.returnArray();
	    
	}

}
