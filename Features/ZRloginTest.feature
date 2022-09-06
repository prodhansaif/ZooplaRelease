Feature: User able to Login the Zoopla application


@Sanity
Scenario: User able login the application with valid user credentials


Given User able to open any browser 
And User able to enter "https://www.zoopla.co.uk/" URL  
When User able to click on the Sign-in button
And User able to enter userName
And User able to enter the password
When User able to click on Login button
Then User able to verify information as "Welcome back to your account" on the grid


