//package parallel;
//
//import java.util.List;
//import java.util.Map;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import com.qa.factory.DriverFactory;
//import com.qa.pageObjects.AdminPage;
//import com.qa.pageObjects.LoginPage;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//
//public class AdminPageSteps 
//{
//		public LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
//		AdminPage adminpage;
//		
//		@Given("user has already logged in to application")
//		public void user_has_already_logged_in_to_application(DataTable dataTable) throws InterruptedException 
//		{
//			List<Map<String, String>> maps=dataTable.asMaps(String.class,String.class);
//			//
//			String username=maps.get(0).get("username");
//			String password=maps.get(0).get("password");
//			//
//			DriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//			Thread.sleep(10000);
//			//
//			adminpage=loginPage.doLogin(username, password);	
//		}
//	
//		@Given("user is on admin page")
//		public void user_is_on_admin_page() 
//		{
//		    String title=adminpage.getAdminPageTitle();
//		    System.out.println(title+ " is title");
//		}  
//	
//		@When("click on add new user")
//		public void click_on_add_new_user() throws InterruptedException {
//			Thread.sleep(10000);
//		    adminpage.clickAdmin();
//		    
//		}
//	
//		@Then("new user is added")
//		public void new_user_is_added(DataTable dataTable) throws InterruptedException 
//		{
//			List<Map<String, String>> maps=dataTable.asMaps(String.class,String.class);
//			
//			String userrole=maps.get(0).get("User Role");
//			Thread.sleep(10000);
//			adminpage.enterUsername(userrole);
//			adminpage.searchbtn();
//	    }
//
//
//}
