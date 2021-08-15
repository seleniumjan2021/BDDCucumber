Feature: UI Cogmento Login Feature


Scenario: Login Test Scenario

Given User is already on LoginPage
When Title of the Page is CogmentoCRM
Then user enters username and password
And clicks on Submit loginButton
Then verify user is on HomePage
And close the browser

@RegressionTest
Scenario: Forgot Password Scenario

Given User is already on LoginPage
When Title of the Page is CogmentoCRM
Then clicks on forgetPassword link
And verify the forgetPassword page
And close the browser

@Sanity @SmokeTest
Scenario: User Logout Scenario
Given User is already on LoginPage
When Title of the Page is CogmentoCRM
Then user enters the "aakash.er@gmail.com" and "lucknow_1000"
And clicks on Submit loginButton
Then verify user is on HomePage
And logout from the application
And close the browser
