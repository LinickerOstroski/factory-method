package model;

import model.br.BREmployeeReport;
import model.us.USEmployeeReport;

public class EmployeeReportFactory {
	
	public enum EmployeeReportCountry{
		BR,
		US
	}
	
	public static EmployeeReport createEmployeeReport(
			EmployeeReportCountry EmployeeReportType) {
		
		if(EmployeeReportType == EmployeeReportCountry.BR) {
			return new BREmployeeReport();
		}
		return new USEmployeeReport();
	}
}
