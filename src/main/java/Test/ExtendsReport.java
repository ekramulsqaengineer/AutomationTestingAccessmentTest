package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendsReport {
	static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;

	@BeforeSuite
	public static void reportSetup() {

		htmlReporter = new ExtentHtmlReporter("TestCase2.html");

		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		// htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");

		 //htmlReporter.config()).setChartVisibilityOnOpen(true);
		//htmlReporter.config().setDocumentTitle("Simple Automation Report");
		// htmlReporter.config().setReportName("Test Report");
		//htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		 //htmlReporter.config().setTheme(Theme.STANDARD);

	}

	@Test
	public void automationexercise() {

	}

	@AfterSuite
	public void reportTeardown() {

		// calling flush writes everything to the log file
		extent.flush();

	}

}
