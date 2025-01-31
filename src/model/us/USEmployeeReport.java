package model.us;

import model.Employee;
import model.EmployeeReport;
import model.EmployeeType;

public class USEmployeeReport extends EmployeeReport {

	@Override
	protected Employee createEmployee(EmployeeType type) {
		if(type == EmployeeType.MANAGER) {
			return new ManagerUS();
		}
		
		return new ProgrammerUS();
	}
}
