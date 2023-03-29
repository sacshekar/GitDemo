Feature: Test Arrays page in ds_algo portal
  I want to use this template for my feature file

  Background: The user is on Arrays data structure page
  Given The user is on Arrays Home page
  
  Scenario: User is able to navigate to Arrays in Python Page
  When The user click on Arrays in Python link
  Then the user is redirected to Arrays in Python Page
  When The user clicks on Try here button 
  Then The user is redirected to Code Editor page with Run button
  
  Scenario: The user is able to Run valid code in editor page from Arrays in Python page
  When The user click on Arrays in Python link
  Then the user is redirected to Arrays in Python Page
  When The user clicks on Try here button 
  Then The user is redirected to Code Editor page with Run button
  When The user enters valid code in code editor 
  And user clicks the run button
  Then user is presented with result

 Scenario: The user is able to Run invalid code in editor page from Arrays in Python page
  When The user click on Arrays in Python link
  Then the user is redirected to Arrays in Python Page
  When The user clicks on Try here button 
  Then The user is redirected to Code Editor page with Run button
  When The user enters invalid code in code editor 
  And user clicks the run button
  Then user is presented with error message

  Scenario: User is able to navigate to Practice Questins Page from Arrays in Python
  Given the user is on Arrays in Python page
  When The user click on Practice Questins link
  Then the user is redirected to Practice Questins Page
 ###################
      
  Scenario: User is able to navigate to Arrays Using List Page
  When The user click on Arrays Using List link
  Then the user is redirected to Arrays Using List Page
  When The user clicks on Try here button 
  Then The user is redirected to Code Editor page with Run button
  
  Scenario: The user is able to Run valid code in editor page from Arrays Using List page
  When The user click on Arrays Using List link
  Then the user is redirected to Arrays Using List Page
  When The user clicks on Try here button 
  Then The user is redirected to Code Editor page with Run button
  When The user enters valid code in code editor 
  And user clicks the run button
  Then user is presented with result
  
  Scenario: The user is able to Run invalid code in editor page from Arrays Using List page
  When The user click on Arrays Using List link
  Then the user is redirected to Arrays Using List Page
  When The user clicks on Try here button 
  Then The user is redirected to Code Editor page with Run button
  When The user enters invalid code in code editor 
  And user clicks the run button
  Then user is presented with error message
 
 Scenario: User is able to navigate to Practice Questins Page from Arrays Using List
  Given the user is on Arrays Using List page
  When The user click on Practice Questins link
  Then the user is redirected to Practice Questins Page
  #################
  Scenario: User is able to navigate to Basic Operations in List Page
  When The user click on Basic Operations in List link
  Then the user is redirected to Basic Operations in List Page
  When The user clicks on Try here button 
  Then The user is redirected to Code Editor page with Run button
  
  Scenario: The user is able to Run valid code in editor page from Basic Operations in List page
  When The user click on Basic Operations in List link
  Then the user is redirected to Basic Operations in List Page
  When The user clicks on Try here button 
  Then The user is redirected to Code Editor page with Run button
  When The user enters valid code in code editor 
  And user clicks the run button
  Then user is presented with result
  
  Scenario: The user is able to Run invalid code in editor page from Basic Operations in List page
  When The user click on Basic Operations in List link
  Then the user is redirected to Basic Operations in List Page
  When The user clicks on Try here button 
  Then The user is redirected to Code Editor page with Run button
  When The user enters invalid code in code editor 
  And user clicks the run button
  Then user is presented with error message
  
  Scenario: User is able to navigate to Practice Questins Page from Basic Operations In List Page
  Given the user is on Basic Operations in List page
  When The user click on Practice Questins link
  Then the user is redirected to Practice Questins Page
###############
  Scenario: User is able to navigate to Applications of Array Page
  When The user click on Applications of Array link
  Then the user is redirected to Applications of Array Page
  When The user clicks on Try here button 
  Then The user is redirected to Code Editor page with Run button
  
  Scenario: The user is able to Run valid code in editor page from Applications of Array page
  When The user click on Applications of Array link
  Then the user is redirected to Applications of Array Page
  When The user clicks on Try here button 
  Then The user is redirected to Code Editor page with Run button
  When The user enters valid code in code editor 
  And user clicks the run button
  Then user is presented with result
  
  Scenario: The user is able to Run invalid code in editor page from Applications of Array page
  When The user click on Applications of Array link
  Then the user is redirected to Applications of Array Page
  When The user clicks on Try here button 
  Then The user is redirected to Code Editor page with Run button
  When The user enters invalid code in code editor 
  And user clicks the run button
  Then user is presented with error message
 
  Scenario: User is able to navigate to Practice Questins Page from Applications of Array Page
  Given the user is on Applications of Array page
  When The user click on Practice Questins link
  Then the user is redirected to Practice Questins Page 
  
  ##############
  
  Scenario: Test Practice questions Search the Array page and run code 
  Given The user is on Practice Questions page
  When the user clicks on Search the Array page
  Then The user is redirected to the respective Practice Question Code Editor page "1" with Run button
  When The user enters valid code in code editor 
  And user clicks the run button
  Then user is presented with result
  When The user enters invalid code in code editor 
  And user clicks the run button
  Then user is presented with error message
   
  Scenario: Test Practice questions Max Consecutive Ones page and run code 
  Given The user is on Practice Questions page
  When the user clicks on Max Consecutive Ones page
  Then The user is redirected to the respective Practice Question Code Editor page "2" with Run button
  When The user enters valid code in code editor 
  And user clicks the run button
  Then user is presented with result
  When The user enters invalid code in code editor 
  And user clicks the run button
  Then user is presented with error message
   
  Scenario: Test Practice questions Find Numbers With Even Number of Digits page and run code 
  Given The user is on Practice Questions page
  When the user clicks on Find Numbers With Even Number of Digits page
  Then The user is redirected to the respective Practice Question Code Editor page "3" with Run button
  When The user enters valid code in code editor 
  And user clicks the run button
  Then user is presented with result
  When The user enters invalid code in code editor 
  And user clicks the run button
  Then user is presented with error message
  
  Scenario: Test Practice questions Squares of a Sorted Array page and run code 
  Given The user is on Practice Questions page
  When the user clicks on Squares of a Sorted Array page
  Then The user is redirected to the respective Practice Question Code Editor page "4" with Run button
  When The user enters valid code in code editor 
  And user clicks the run button
  Then user is presented with result
  When The user enters invalid code in code editor 
  And user clicks the run button
  Then user is presented with error message
  