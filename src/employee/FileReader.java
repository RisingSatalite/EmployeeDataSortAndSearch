package employee;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {

	public ArrayList<Employee> returnArrayFromFile() {
		File myObj = new File("employeeList/employeesWithoutRepeat.txt");  
		ArrayList<Employee> EmployeeList = new ArrayList<>();
	    
	    try (Scanner myReader = new Scanner(myObj)) {
	        while (myReader.hasNextLine()) {
	          String data = myReader.nextLine();
	          System.out.println(data);
	          String[] dataParts = data.split(",");
	          if(dataParts.length == 7) {
	        	  EmployeeList.add(new Employee(
	        			  Integer.parseInt(dataParts[0]),
	        			  dataParts[1],
	        			  Integer.parseInt(dataParts[2]),
	        			  Float.parseFloat(dataParts[3]),
	        			  Float.parseFloat(dataParts[4]),
	        			  Float.parseFloat(dataParts[5]),
	        			  Integer.parseInt(dataParts[6])
	        	  ));
	        	  System.out.println("Employee added to system");
	          }else {
	        	  System.out.println("This data does not have 7 data pieces");
	          }
	        }
	      } catch (FileNotFoundException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }

		return EmployeeList;
	}
	
	public ArrayList<Employee>returnArrayFromFile(String file) {
		File myObj = new File(file);
		ArrayList<Employee> EmployeeList = new ArrayList<>();
	    
		try (Scanner myReader = new Scanner(myObj)) {
	        while (myReader.hasNextLine()) {
	          String data = myReader.nextLine();
	          System.out.println(data);
	          String[] dataParts = data.split(",");
	          if(dataParts.length == 7) {
	        	  EmployeeList.add(new Employee(
	        			  Integer.parseInt(dataParts[0]),
	        			  dataParts[1],
	        			  Integer.parseInt(dataParts[2]),
	        			  Float.parseFloat(dataParts[3]),
	        			  Float.parseFloat(dataParts[4]),
	        			  Float.parseFloat(dataParts[5]),
	        			  Integer.parseInt(dataParts[6])
	        			));
	        	  System.out.println("Employee added to system");
	          }else {
	        	  System.out.println("This data does not have 7 data pieces");
	          }
	        }
	      } catch (FileNotFoundException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
		return EmployeeList;
	}
	public static void main(String[] args) {
		FileReader reader = new FileReader();
		@SuppressWarnings("unused")//This is an example way to get the data
		ArrayList<Employee> ArrayList= reader.returnArrayFromFile();
	    
	}

}
