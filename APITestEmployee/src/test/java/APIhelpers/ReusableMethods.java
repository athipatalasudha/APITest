package APIhelpers;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public class ReusableMethods 
{
	public static GenerateReports report=null;
	
	@BeforeTest
	public static void setupBeforeTest()
	{
		report=GenerateReports.getInstance();
		report.startExtentReport();
	}
	@AfterTest
	public static void teardownAfterTest()
	{
		report.endReport();
	}
}
