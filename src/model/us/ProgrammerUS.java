package model.us;

import model.Employee;

public class ProgrammerUS extends Employee{

	
	public ProgrammerUS() {
		super("American Programmer", "US$");
	}
	@Override
	public double calculateSalary() {
		return 15000.0;
	}
	
}
