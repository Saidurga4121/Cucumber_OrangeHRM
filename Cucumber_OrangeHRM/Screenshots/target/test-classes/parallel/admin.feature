Feature: Admin Page Feature

Background:
Given user has already logged in to application
|username|password|
|Admin|admin123|


Scenario: Admin page title
Given user is on admin page
When user gets the title of the page
Then page title should be "OrangeHRM"


Scenario: Searching with role
Given user is on admin page
When click on add new user
Then new user is added
|User Role|
|Admin|