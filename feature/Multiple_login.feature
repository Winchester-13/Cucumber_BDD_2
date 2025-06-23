Feature: Data driven BDD

Scenario: User registration

Given the user navigates to the website and clicks on My Account and My Register buttons	 
When the user provides the following data
	|firstName| Hello			|
	|lastName |	Tutorial	|
	|Password	| tutorial 	|
When the user clicks on the privacy policy checkbox
When the user clicks the Continue button 
Then the user should see the registration successful message

  