@tag
Feature: Test DS Algo portal home page

  @tag1
  Scenario: user navigates to ds_algo portal home page 
    Given the user opens DS_Algo portal link
    When The user clicks the Get Started button
    Then The user navigate to home page 
    
   Scenario: user checks login functionality
   Given the user is on DS_Algo home page
    When The user clicks on Get Started button
    Then error message should be displayed
    
   Scenario: user checks drop down entries
   Given the user is on DS_Algo home page
   When The user clicks data Structures drop down
   Then user should see six different data structure entries in that drop down
 
   Scenario Outline: user checks drop down functionality witout sign in
   Given the user is on DS_Algo home page
   When the user click on "<options>" from drop down link
   Then error message should be displayed
   Examples: 
      | options         |
      | Arrays         |
      | Linked List     |
      | Stack          |
      | Queue          |
      | Tree           |
      | Graph          |
   

   
   Scenario: user navigates to sign in page 
   Given the user is on DS_Algo home page
   When the user click on sign in link
   Then user should be directed to signin page
   
   Scenario: user navigates to registration page 
   Given the user is on DS_Algo home page
   When the user click on Registration link
   Then user should be directed to Registration page
  

 

 