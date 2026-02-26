package employee;

import java.util.ArrayList;
import util.saveFile;

public class exportToCSV {
	//Save the data to CSV format, for use somewhere else
	public String returnDataFromArray(ArrayList<EmployeeRecord> employeeList) {
		String data = "";
		for (int i = 0; i < employeeList.size(); i++) {
			data += employeeList.get(i).exportCSVdata();
		}
		return data;
	}
	
	//Save the data directly to a file
	public void dataToCSV(ArrayList<EmployeeRecord> employeeList, String path) {
		String data = "";
		for (int i = 0; i < employeeList.size(); i++) {
			data += employeeList.get(i).exportCSVdata();
		}
		saveFile saveFile = new saveFile();
		saveFile.saveToNewFile(path, data);
	}
}
