Feature: Login page feature



#we cannot run scenarios parallelly but we can run features parallelly in cucumber with junit.-->drawback

Scenario: Login page title
		Given user is on login page
		When user gets the title of the page
		Then page title should be "OrangeHRM1"
		
Scenario: Forgot Password link
		Given user is on login page
		Then forgot your password link should be displayed
		
Scenario: Login with correct credentials
		Given user is on login page
		When user enters username "Admin"
		And user enters password "admin"
		And user clicks on Login button
		Then user gets the title of the page
		And page title should be "OrangeHRM"

