Feature: Admin Page Feature

Background:
Given user has already logged in to application
|username|password|
|Admin1|admin123|


Scenario: Admin page title
Given user is on admin page
When user gets the title of the page
Then page title should be "OrangeHRM"

Scenario: Searching with role
Given user is on admin page
When click Admin
Then search with userrole
|User Role|
|Admin|