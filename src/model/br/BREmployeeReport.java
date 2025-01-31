package model.br;

import model.Employee;
import model.EmployeeReport;
import model.EmployeeType;

public class BREmployeeReport extends EmployeeReport{
	
	@Override
	protected Employee createEmployee(EmployeeType type) {
		if(type == EmployeeType.MANAGER) {
			return new ManagerBR();
		}
		
		return new ProgrammerBR();
	}
}
