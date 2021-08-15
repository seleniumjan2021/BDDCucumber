Feature: Deal Creation Feature

Scenario: UI Cogmento Create Deal Test Scenario

#Given User is already on LoginPage
#When Title of the Page is CogmentoCRM
#Then user enters the username and password
#		|aakash.er@gmail.com| lucknow_1000|
#And  clicks on Submit loginButton
#Then verify user is on HomePage
#Then navigate to the createDealsPage
#And  user enters deal details
#		|Deal 01| 1000|50|20|
#And  close the browser

Given User is already on LoginPage
When Title of the Page is CogmentoCRM
Then user will enter username and password
		|username						|	password		|
		|aakash.er@gmail.com| lucknow_1000|
And  clicks on Submit loginButton
Then verify user is on HomePage
Then navigate to the createDealsPage
And  user will enter the deal details
		|title	|	amount|probability|commission|
		|Deal02 | 1000	|50					|20				 |
		|Deal03 | 1000	|50					|20				 |
		|Deal04 | 1000	|50					|20				 |
		|Deal05 | 1000	|50					|20				 |
And  close the browser