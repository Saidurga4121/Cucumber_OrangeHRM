package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.qa.factory.DriverFactory;
import com.qa.pageObjects.NewUser;
import com.qa.utility.ExcelReader;

import io.cucumber.java.en.Then;

public class NewUserPageSteps 
{
	NewUser newUser = new NewUser(DriverFactory.getDriver());
	
	@Then("click on add user")
	public void click_on_add_user() throws InterruptedException 
	{
		newUser.clickAdd();
	}

	@Then("fill all the details from given sheetname {string} and {int}")
	public void fill_all_the_details_from_given_sheetname_and(String sheetname, Integer rownum) throws InvalidFormatException, IOException 
	{
		
		ExcelReader obj= new ExcelReader();
		
		List<Map<String, String>> data=obj.getData("C:\\Users\\003KT8744\\Desktop\\cucumber.xlsx","newuser");
	    
		String empname=data.get(rownum).get("empname");
		String username=data.get(rownum).get("username");
		newUser.enterUserName(username);
		newUser.enterEmpName(empname);
		System.out.println(empname+ " is empname");
		System.out.println(username + " is username");
		
	    
	}


}
