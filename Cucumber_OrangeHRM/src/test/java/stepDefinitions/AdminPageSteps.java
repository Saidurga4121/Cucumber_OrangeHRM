package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.factory.DriverFactory;
import com.qa.pageObjects.AdminPage;
import com.qa.pageObjects.BasePage;
import com.qa.pageObjects.LoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AdminPageSteps extends BasePage
{
	    // LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
			
		@Given("user has already logged in to application")
		public void user_has_already_logged_in_to_application(DataTable dataTable) throws InterruptedException 
		{
			loginpage = new LoginPage(DriverFactory.getDriver());
			List<Map<String, String>> maps=dataTable.asMaps(String.class,String.class);
			//
			String username=maps.get(0).get("username");
			String password=maps.get(0).get("password");
			//
			getUrl();
			Thread.sleep(10000);
			//
			adminpage=loginpage.doLogin(username, password);	
		}
	
		@Given("user is on admin page")
		public void user_is_on_admin_page() 
		{
		    String title=adminpage.getAdminPageTitle();
		    System.out.println(title+ " is title");
		}  
	
		@When("click Admin")
		public void click_Admin() throws InterruptedException {
			Thread.sleep(10000);
		    adminpage.clickAdmin();
		    
		}
	
		@Then("search with userrole")
		public void search_with_userrole(DataTable dataTable) throws InterruptedException 
		{
			List<Map<String, String>> maps=dataTable.asMaps(String.class,String.class);
			
			String userrole=maps.get(0).get("User Role");
			Thread.sleep(10000);
			adminpage.enterUsername(userrole);
			adminpage.searchbtn();
	    }


}
