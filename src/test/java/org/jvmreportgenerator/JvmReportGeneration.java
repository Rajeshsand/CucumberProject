package org.jvmreportgenerator;
import java.io.File;
import java.util.ArrayList;

import net.masterthought.cucumber.ReportBuilder;
public class JvmReportGeneration {
	
	
	public static void generateReport(String jsonReport) {
		
		File f = new File("C:\\Users\\A\\eclipse-workspace\\CucumberSample\\target\\JvmReportFolder");
		
		net.masterthought.cucumber.Configuration  c = new net.masterthought.cucumber.Configuration(f, "Facebook");
	    
	    c.addClassifications("Platform", "Windows");
		c.addClassifications("Platform Version", "Windows 11");
		c.addClassifications("Browser", "Chrome");
		
		java.util.List<String> l = new ArrayList<String>();
		l.add(jsonReport);
		
		ReportBuilder r = new ReportBuilder(l, c);
		r.generateReports();
		}
	

}
