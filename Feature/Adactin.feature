
Feature: Hotel App Login
@SmokeTest @SanityTest
Scenario: Login Successful
Given I am on the Hotel App login page
When I enter  username as "himabindu1417"
And I enter password as "2002BINDU"
And I click Login
Then I am Logged in successfully
 
@E2ETest @SanityTest
Scenario: Select location
Given I am on Hotel App Login page
When I enter  username as "himabindu1417"
And I enter password as "2002BINDU"
And I click Login
Then I am Logged in successfully
And I Select location as "Sydney"
And Click on the search button
Then I can see the hotel