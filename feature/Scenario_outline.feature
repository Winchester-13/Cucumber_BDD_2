Feature: Trying Scenario outline

  Scenario Outline: Login
    Given the user navigates to website
    When the user clicks on My Account menu
    And the user clicks on Login submenu
    And the user enters "<email>" and "<password>"
    Then the user should successfully login
    
    Examples:
    	
    	|email 						  |		password   |
    	|first1@name1.com		| qwertyuiop |
    	|first@name.com			|	qwertyuiop |
    	|first@name.com			|	qwertyuiop |
		
		
		