@tag
Feature: Test ds_algo portal sign in page

  @tag1 
  Scenario: user tests sign in functionality with empty username textbox
    Given the user is on DS_Algo sign in page
    When the user enters password
    And user clicks on login button
    Then textbox should display an error message
 
  Scenario: user tests sign in functionality with empty password textbox
    Given the user is on DS_Algo sign in page
    When the user enters username
    And user clicks on login button
    Then textbox should display an error message
    
  Scenario: User tests registration link on sign in page
  Given the user is on DS_Algo sign in page
  When the user click on register link under textboxes
  Then user should navigate to Registration page
  
  Scenario: User tests sign in link on sign in page
  Given the user is on DS_Algo sign in page
  When the user click on sign in link in the same page
  Then user should be directed to signin page
 
  Scenario: User tests registration link on sign in page
  Given the user is on DS_Algo sign in page
  When the user click on register link
  Then user should navigate to Registration page

  Scenario Outline: User tests drop down list functionality on sign in page
  Given the user is on DS_Algo sign in page
  When the user click on drop down link and chooses any of the "<options>"
  Then user should be directed to Home page
  Examples: 
      | options         |
      | Arrays         |
      | Linked List     |
      | Stack          |
      | Queue          |
      | Tree           |
      | Graph          |
  
  
  Scenario Outline: user checks for invalid username and password
    Given the user is on DS_Algo sign in page
    When the user enters invalid "<username>" or "<password>" or both
    And user clicks on login button
    Then error message is displayed
  Examples:
  |		username		|  	password   |
  |  Gayathri			|   abcdef     |
  |  Tester1      |   43sadsad   |
  |  Tester_00    |   asdaWDAS   |
  |  ALGO_TESTER  |   SADSDAS    |
    
  Scenario: user checks for valid username and password
    Given the user is on DS_Algo sign in page
    When the user enters valid username and password
    And user clicks on login button
    Then used should be signed in and directed to homepage
    
 
  

  
  
      