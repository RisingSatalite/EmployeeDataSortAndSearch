package employee;

public class EmployeeRecord {
	int ID;
	String name;
	float hoursWorked;
	float hourlyRate;
	float deductionProvince;
	float deductionFederal;
	float educationAllowance;
	
	EmployeeRecord(int ID, String name, float hoursWorked, float hourlyRate, float deductionProvince, float deductionFederal, float educationAllowance){
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
	
	public float getHoursWorked() {
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
	
	public float getEducationAllowance() {
		return this.educationAllowance;
	}
	
	public void setID(int NewID) {
		this.ID = NewID;
	}
	
	public void setName(String NewName) {
		this.name= NewName;
	}
	
	public void setHoursWorked(float hoursWorked) {
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
	
	public void setEducationAllowance(float educationAllowance) {
		this.educationAllowance = educationAllowance;
	}
	
	@Override
    public String toString() {
        return ID + " " + name + " " + hoursWorked + " " + hourlyRate + " " + deductionProvince + " " + deductionFederal + " " + educationAllowance;
    }
}
