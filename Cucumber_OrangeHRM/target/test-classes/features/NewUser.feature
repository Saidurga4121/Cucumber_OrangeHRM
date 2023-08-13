Feature: Admin Page Feature

Background:
Given user has already logged in to application
Examples:
|username|password|
|Admin|admin123|

@skip_scenario
Scenario Outline: New User Creation
Given user is on admin page
When click Admin
Then click on add user
Then fill all the details from given sheetname "<sheetname>" and <rownumber>
Examples:
|sheetname|rownumber|
|newuser|0|

