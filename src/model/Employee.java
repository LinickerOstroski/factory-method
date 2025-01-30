package model;

public abstract class Employee {
	private String role;
	private String currency;

	public Employee(String role, String currency) {
		this.role = role;
		this.currency = currency;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public String getRole() {
		return role;
	}
	
	public abstract double calculateSalary();
}
