//package parallel;
//
//import org.openqa.selenium.WebDriver;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//
//import com.qa.factory.DriverFactory;
//
//import io.cucumber.java.*;
//
//
//public class ApplicationHooks 
//{
//	public WebDriver driver;
//	public DriverFactory obj;
//	
//	@Before(order=0)
//	public void launchBrowser()
//	{
//	    obj= new DriverFactory();
//		driver=obj.setUp();
//	}
//	
//	@After(order=0)
//	public void closeBrowser() {
//		obj.quitBrowser();
//	}
//	//@AfterStep(it will take screenshot to each and every step
//	//After(order=1) it will take take screenshot to the each scenarios when failed is not specified
//	
//	@AfterStep
//	public void tearDown(Scenario result) {
//		// if (result.isFailed()) {
//			// take screenshot:
//			String screenshotName = result.getName().replaceAll(" ", "_");
//			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//			System.out.println(sourcePath + " is sourcePath");
//			result.attach(sourcePath, "image/png", screenshotName);
//		}	
//	}
//
