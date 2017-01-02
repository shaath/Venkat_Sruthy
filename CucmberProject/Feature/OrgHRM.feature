Feature: Login and Logout Functionality

	Scenario: Login Test
		Given The browser launched and navigated to url
		When The Tester enters valid username and valid password
		And also click on login button
		Then Should logout and display welcome Admin message
	Scenario: Logout Test
		When Tester Click on Welcome Admin link
		And also clicks on logout link
		Then Should logout and display the login page 	
		 