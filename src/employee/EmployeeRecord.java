package employee;

public class EmployeeRecord {
	int ID;
	String name;
	int hoursWorked;
	float hourlyRate;
	float deductionProvince;
	float deductionFederal;
	int educationAllowance;
	
	EmployeeRecord(int ID, String name, int hoursWorked, float hourlyRate, float deductionProvince, float deductionFederal, int educationAllowance){
		this.ID = ID;
		this.name = name;
		this.hoursWorked = hoursWorked;
		this.hourlyRate= hourlyRate;
		this.deductionProvince = deductionProvince;
		this.deductionFederal = deductionFederal;
		this.educationAllowance = educationAllowance;
	}
	
	public int getID() {
		return this.ID;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getHoursWorked() {
		return this.hoursWorked;
	}
	
	public float getHourlyRate() {
		return this.hourlyRate;
	}
	
	public float getDeductionFederal() {
		return this.deductionFederal;
	}
	
	public float getDeductionProvince() {
		return this.deductionProvince;
	}
	
	public int getEducationAllowance() {
		return this.educationAllowance;
	}
	
	public void setID(int NewID) {
		this.ID = NewID;
	}
	
	public void setName(String NewName) {
		this.name= NewName;
	}
	
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	public void setHourlyRate(float hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	public void setDeductionFederal(float deductionFederal) {
		this.deductionFederal = deductionFederal;
	}
	
	public void setDeductionProvince(float deductionProvince) {
		this.deductionProvince = deductionProvince;
	}
	
	public void setEducationAllowance(int educationAllowance) {
		this.educationAllowance = educationAllowance;
	}
}
