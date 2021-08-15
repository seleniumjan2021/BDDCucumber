Feature: UI Cogmento Contact Test Features

Scenario Outline: UI Cogmento Create Contact
Given User is already on LoginPage
When Title of the Page is CogmentoCRM
Then user enters the "<username>" and "<password>"
And  clicks on Submit loginButton
Then verify user is on HomePage
Then navigate to the createContactPage
And  create a new contact providing "<firstname>" and "<lastname>" and "<companyName>"
And  close the browser

Examples: 
					|username							|password			|firstname|lastname|companyName			   |
					|aakash.er@gmail.com	|lucknow_1000	|Charlie	|	Brown	 | Unicode Pvt. Ltd  |
					|aakash.er@gmail.com	|lucknow_1000	|David		|	Brown	 | ABZ Pvt. Ltd		   |
					|aakash.er@gmail.com	|lucknow_1000	|Eleis		|	Brown	 | ABC Pvt. Ltd		   |
					|aakash.er@gmail.com	|lucknow_1000	|Gartner	|	Brown	 | Naukri Pvt. Ltd   |
					|aakash.er@gmail.com	|lucknow_1000	|Futureman|	Brown	 | Delloite Pvt. Ltd |
					|aakash.er@gmail.com	|lucknow_1000	|Gandhi		|	Brown	 | Accenture Pvt. Ltd|
					|aakash.er@gmail.com	|lucknow_1000	|Hiesnberg|	Brown	 | Infosys Pvt. Ltd  |
					|aakash.er@gmail.com	|lucknow_1000	|Jack			|	Brown	 | Wipro Pvt. Ltd		 |
					|aakash.er@gmail.com	|lucknow_1000	|Kane			|	Brown	 | HCL Pvt. Ltd      |