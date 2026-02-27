package employee;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDataFileReader {

	public ArrayList<EmployeeRecord> returnArrayFromFile() {
		return this.returnArrayFromFile("employeeList/employeesWithRepeat.txt");
	}
	
	public ArrayList<EmployeeRecord>returnArrayFromFile(String file) {
		File myObj = new File(file);
		ArrayList<EmployeeRecord> EmployeeList = new ArrayList<>();
	    
		try (Scanner myReader = new Scanner(myObj)) {
	        while (myReader.hasNextLine()) {
	          String data = myReader.nextLine();
	          System.out.println(data);
	          String[] dataParts = data.split(",");
	          if(dataParts.length == 7) {
	        	  EmployeeList.add(new EmployeeRecord(
	        			  Integer.parseInt(dataParts[0]),
	        			  dataParts[1],
	        			  Float.parseFloat(dataParts[2]),
	        			  Float.parseFloat(dataParts[3]),
	        			  Float.parseFloat(dataParts[4]),
	        			  Float.parseFloat(dataParts[5]),
	        			  Float.parseFloat(dataParts[6])
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
		String currentDir = System.getProperty("user.dir");
        System.out.println("Current working directory: " + currentDir);
		
		EmployeeDataFileReader  reader = new EmployeeDataFileReader ();
	
		ArrayList<EmployeeRecord> ArrayList= reader.returnArrayFromFile();
		
		//Export functionality example
		exportToCSV exportToCSV = new exportToCSV();
		exportToCSV.dataToCSV(ArrayList, "employeeData.csv");
    
		EmployeeRecord[] employeeArray = ArrayList.toArray(new EmployeeRecord[0]);

		System.out.println("\n--- Sorting Employees by Calculated Salary ---");

		// Log time
        long startTime = System.currentTimeMillis();
        SelectionSort.sort(employeeArray);
        long endTime = System.currentTimeMillis();
        
        
        for (EmployeeRecord em : employeeArray) {
            System.out.println(em.toString() + " | Calculated Salary: " + em.calcHourlySalary());
        }
		System.out.println("Selection Sort Running Time: " + (endTime - startTime) + "ms");
	}

}
