import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class LearnExtentReport {

	@Test
	public static void startTest()
	{
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark= new ExtentSparkReporter("C:/Users/Admin/eclipse-workspace/Spark.html");
		//report.startTest("ExtentDemo");
		spark.config().setReportName("Project Report");
		spark.config().setDocumentTitle("Report Meenu");
		spark.config().setTheme(Theme.DARK);
		spark.config().setEncoding("utf-8");
		
		extent.attachReporter(spark);
		
		ExtentTest test=extent.createTest("Login Test");
		test.log(Status.INFO, "Starting Login Test Case");
		test.log(Status.PASS, "Login test pass");
		
		
		
		extent.flush();
		
	}
}
