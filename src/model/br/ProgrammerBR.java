package model.br;

import model.Employee;

public class ProgrammerBR extends Employee {

	public ProgrammerBR() {
		super("Programador Brasil", "R%");
	}
	
	@Override
	public double calculateSalary() {
		return 15000.00;
	}
	
}
