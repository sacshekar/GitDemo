@tag
Feature: Test Automation DS Algo register page
  
@tag1
 Scenario: The user navigates to ds algo home page
    Given The user opens DS Algo portal link
    When The user clicks the "Get Started" button
    Then The user should be redirected to homepage 
 @tag2
 Scenario: User navigates to register page
    Given  User is on homepage
    When  User clicks Register button on the home page
    Then User navigates  to register page

@tag3
Scenario: User should get error message for all fields empty below username textbox
    Given User is on register page
    And The title of the page is Registration  
    When  User clicks Register button with all fields empty
    Then It should display an error "Please fill out this field." below username textbox
  @tag4 
 Scenario: User should get error message below password textbox
    Given User is on register page 
    When User enters the username as "NumpyNinjasdet" in username textbox
    When User clicks register button with password and confirmpassword textbox empty
    Then It should display an error "Please fill out this field" below password textbox
  @tag5 
 Scenario: User should get error message below confirm password textbox
    Given User is on register page
    When User enters the username as"NumpyNinjasdet" in username textbox
    And the password as "WeNinjas1234@@" in password textbox
    When User clicks register button with confirm password textbox empty
    Then It should display an error "Please fill out this field" below confirm password textbox 
 @tag6   
 Scenario: User registers with invalid username and password
 Given User is on register page
 When User enters the username "Test" in username textbox
 And User enters the password as "003" in passwordd textbox
 And User enters the password as "003" in confirm password textbox
 When User clicks register button 
 Then It should display the error message
    
   
 @tag7
Scenario: User registers successfully
    Given User is on register page
    When User enters username as "Sakaleshapura" in username textbox and password as "Sriranga//"  in password textbox
    When User enters "Sriranga//" in confirmpassword textbox
    When User clicks register button with all fields entered
    Then It should dispaly the success message in homepage
    
 