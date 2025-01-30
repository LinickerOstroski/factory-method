package model;

public abstract class EmployeeReport {
	public String reportData(EmployeeType type) {
		
		// createEmployee é um template method
		Employee employee =  createEmployee(type);
		
		String result = String.format("%s - %s%.2f", 
				employee.getRole(),
				employee.getCurrency(),
				employee.calculateSalary());
		return "";
	}
	
	protected abstract Employee createEmployee(EmployeeType type);
}
