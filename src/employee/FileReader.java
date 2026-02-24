package employee;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 

public class FileReader {
	public static void main(String[] args) {
	    File myObj = new File("employeeList/employeesWithoutRepeat.txt");
	    
	    
	    try (Scanner myReader = new Scanner(myObj)) {
	        while (myReader.hasNextLine()) {
	          String data = myReader.nextLine();
	          System.out.println(data);
	        }
	      } catch (FileNotFoundException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	}

}
