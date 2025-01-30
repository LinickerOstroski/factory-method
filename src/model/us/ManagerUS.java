package model.us;

import model.Employee;

public class ManagerUS extends Employee{

	public ManagerUS() {
		super("American Manager", "US$");
	}

	@Override
	public double calculateSalary() {
		return 25000.00;
	}
}
