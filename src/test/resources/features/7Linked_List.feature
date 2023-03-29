Feature: Test Linked List page in ds_algo portal
  I want to use this template for my feature file

  Background: The user is on Linked List data structure page
  Given The user is on Linked List Home page
  
  Scenario: User is able to navigate to Introduction Page
  When The user click on Introduction link
  Then the user is redirected to Introduction Page
  When The user clicks on Try here button 
  Then The user is redirected to Code Editor page with Run button
  
  Scenario: The user is able to Run valid code in editor page from Introduction page
  When The user click on Introduction link
  Then the user is redirected to Introduction Page
  When The user clicks on Try here button 
  Then The user is redirected to Code Editor page with Run button
  When The user enters valid code in Linked List code editor 
  And user clicks the run button
  Then user is presented with result

Scenario: The user is able to Run invalid code in editor page from Introduction page
  When The user click on Introduction link
  Then the user is redirected to Introduction Page
  When The user clicks on Try here button 
  Then The user is redirected to Code Editor page with Run button
  When The user enters invalid code in Linked List code editor 
  And user clicks the run button
  Then user is presented with error message
  
  
  Scenario: User is able to navigate to Practice Questins Page from Introduction Page
  Given the user is on Introduction page
  When The user click on Practice Questins link
  Then the user is redirected to Linked list Practice Questins Page
 ###################
  
  Scenario: User is able to navigate to Creating Linked List Page
  When The user click on Creating Linked List link
  Then the user is redirected to Creating Linked List Page
  When The user clicks on Try here button 
  Then The user is redirected to Code Editor page with Run button
  
  Scenario: The user is able to Run valid code in editor page from Creating Linked List page
  When The user click on Creating Linked List link
  Then the user is redirected to Creating Linked List Page
  When The user clicks on Try here button 
  Then The user is redirected to Code Editor page with Run button
  When The user enters valid code in Linked List code editor 
  And user clicks the run button
  Then user is presented with result
  When The user enters invalid code in Linked List code editor 
  And user clicks the run button
  Then user is presented with error message

Scenario: The user is able to Run invalid code in editor page from Creating Linked List page
  When The user click on Creating Linked List link
  Then the user is redirected to Creating Linked List Page
  When The user clicks on Try here button 
  Then The user is redirected to Code Editor page with Run button
  When The user enters invalid code in Linked List code editor 
  And user clicks the run button
  Then user is presented with error message

  Scenario: User is able to navigate to Practice Questins Page from Creating Linked List Page
  Given the user is on Creating Linked List page
  When The user click on Practice Questins link
  Then the user is redirected to Linked list Practice Questins Page
 
 ####################
 
 Scenario: User is able to navigate to Types of Linked List Page
  When The user click on Types of Linked List link
  Then the user is redirected to Types of Linked List Page
  When The user clicks on Try here button 
  Then The user is redirected to Code Editor page with Run button
  
  Scenario: The user is able to Run valid and invalid code in editor page from Types of Linked List page
  When The user click on Types of Linked List link
  Then the user is redirected to Types of Linked List Page
  When The user clicks on Try here button 
  Then The user is redirected to Code Editor page with Run button
  When The user enters valid code in Linked List code editor 
  And user clicks the run button
  Then user is presented with result
  When The user enters invalid code in Linked List code editor 
  And user clicks the run button
  Then user is presented with error message

  Scenario: User is able to navigate to Practice Questins Page from Types of Linked List Page
  Given the user is on Types of Linked List page
  When The user click on Practice Questins link
  Then the user is redirected to Linked list Practice Questins Page
 
 ############################3
 
Scenario: User is able to navigate to Implement Linked List in Python Page
  When The user click on Implement Linked List in Python link
  Then the user is redirected to Implement Linked List in Python Page
  When The user clicks on Try here button 
  Then The user is redirected to Code Editor page with Run button
  
  Scenario: The user is able to Run valid and invalid code in editor page from Implement Linked List in Python page
  When The user click on Implement Linked List in Python link
  Then the user is redirected to Implement Linked List in Python Page
  When The user clicks on Try here button 
  Then The user is redirected to Code Editor page with Run button
  When The user enters valid code in Linked List code editor 
  And user clicks the run button
  Then user is presented with result
  When The user enters invalid code in Linked List code editor 
  And user clicks the run button
  Then user is presented with error message

  Scenario: User is able to navigate to Practice Questins Page from Implement Linked List in Python Page
  Given the user is on Implement Linked List in Python page
  When The user click on Practice Questins link
  Then the user is redirected to Linked list Practice Questins Page
  
 #######################
 
 Scenario: User is able to navigate to Traversal Page
  When The user click on Traversal link
  Then the user is redirected to Traversal Page
  When The user clicks on Try here button 
  Then The user is redirected to Code Editor page with Run button
  
  Scenario: The user is able to Run valid and invalid code in editor page from Traversal page
  When The user click on Traversal link
  Then the user is redirected to Traversal Page
  When The user clicks on Try here button 
  Then The user is redirected to Code Editor page with Run button
  When The user enters valid code in Linked List code editor 
  And user clicks the run button
  Then user is presented with result
  When The user enters invalid code in Linked List code editor 
  And user clicks the run button
  Then user is presented with error message

  Scenario: User is able to navigate to Practice Questins Page from Traversal Page
  Given the user is on Traversal page
  When The user click on Practice Questins link
  Then the user is redirected to Linked list Practice Questins Page
  
  ##########################
  
  Scenario: User is able to navigate to Insertion Page
  When The user click on Insertion link
  Then the user is redirected to Insertion Page
  When The user clicks on Try here button 
  Then The user is redirected to Code Editor page with Run button
  
  Scenario: The user is able to Run valid and invalid code in editor page from Insertion page
  When The user click on Insertion link
  Then the user is redirected to Insertion Page
  When The user clicks on Try here button 
  Then The user is redirected to Code Editor page with Run button
  When The user enters valid code in Linked List code editor 
  And user clicks the run button
  Then user is presented with result
  When The user enters invalid code in Linked List code editor 
  And user clicks the run button
  Then user is presented with error message

  Scenario: User is able to navigate to Practice Questins Page from Insertion Page
  Given the user is on Insertion page
  When The user click on Practice Questins link
  Then the user is redirected to Linked list Practice Questins Page
  
  ####################################
  
  Scenario: User is able to navigate to Deletion Page
  When The user click on Deletion link
  Then the user is redirected to Deletion Page
  When The user clicks on Try here button 
  Then The user is redirected to Code Editor page with Run button
  
  Scenario: The user is able to Run valid and invalid code in editor page from Deletion page
  When The user click on Deletion link
  Then the user is redirected to Deletion Page
  When The user clicks on Try here button 
  Then The user is redirected to Code Editor page with Run button
  When The user enters valid code in Linked List code editor 
  And user clicks the run button
  Then user is presented with result
  When The user enters invalid code in Linked List code editor 
  And user clicks the run button
  Then user is presented with error message

  Scenario: User is able to navigate to Practice Questins Page from Deletion Page
  Given the user is on Deletion page
  When The user click on Practice Questins link
  Then the user is redirected to Linked list Practice Questins Page
  