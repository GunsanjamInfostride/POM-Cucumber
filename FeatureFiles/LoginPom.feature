#@OrangeHRM
Feature: Checking Login functionality of the application.

#@Login
Scenario: This is Login scenario

Given user is on login page
Then user enters username in username textfield
Then user enters password in password textfield
Then user clicks on login button
Then user is on Home page

#@Logout
Scenario: This is Logout scenario
Given user is on login page
Then user enters username and enters password in textfield
Then user clicks on login button
Then user is on Home page
Then click on Welcome
Then click on logout button

#@AdminUser
Scenario: This is add user scenario
Given user is on login page
Then user enters username and enters password in textfield
Then user clicks on login button
Then user is on Home page
Then click on Welcome
Then click on logout button
Then click on Users
Then click on add button
Then enter user role
Then enter employee name
Then enter username
Then enter status
Then enter password
Then enter confirm password
Then click on save button


