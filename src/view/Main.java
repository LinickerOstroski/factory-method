package view;

import model.EmployeeReport;
import model.EmployeeReportFactory;
import model.EmployeeReportFactory.EmployeeReportCountry;
import model.EmployeeType;

public class Main {

	public static void main(String[] args) {
		EmployeeReport report;
		
		report = EmployeeReportFactory.createEmployeeReport(EmployeeReportCountry.BR);
		
		String managerData = report.reportData(EmployeeType.MANAGER);
		String progData = report.reportData(EmployeeType.PROGRAMMER);
		
		System.out.println(managerData);
		System.out.println(progData);
	}

}
