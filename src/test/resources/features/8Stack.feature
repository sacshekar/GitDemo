@tagStack
Feature: Stack
  I want to use this template for my feature file

Background: The user is on stack page
	 Given The user is on stack home page
   
   @tagStack2 @tagStack
   Scenario: The user is able to navigate to Operations in Stack page
   When The user clicks Operations in Stack link on stack page
   Then The user should be redirected to stack operations-in-stack page
   
   @tagStack3 @tagStack
   Scenario: The user should be directed to editor page with run button to test python code
   When The user clicks Operations in Stack link on stack page
   Then The user should be redirected to stack operations-in-stack page
   When The user clicks on Tryhere link
   Then The user should be directed to Editor page with Run button
   
   @tagStack4 @tagStack
   Scenario: The user is able to run code in Editor for stack page
   When The user clicks Operations in Stack link on stack page
   Then The user should be redirected to stack operations-in-stack page
   When The user clicks on Tryhere link
   Then The user should be directed to Editor page with Run button
   Given The user is in a page having an Editor with a Run button to test
   When The user enters valid python code in Editor from stack page
   And Clicks run button after valid code
   Then The user is presented with the result after run button is clicked
   
   @tagStack5 @tagStack
   Scenario: The user is presented with error message for invalid code in Editor for stack page
   When The user clicks Operations in Stack link on stack page
   Then The user should be redirected to stack operations-in-stack page
   When The user clicks on Tryhere link
   Then The user should be directed to Editor page with Run button
   Given The user is in a page having an Editor with a Run button to test
   When The user enters invalid python code in Editor from stack page
   And Clicks run button after invalid code
   Then The user gets an error message
   
   @tagStack6 @tagStack
   Scenario: The user is able to navigate to stack page and click on Implementation link
   When The user clicks on Implementation link
   Then The user should be redirected to stack implementation page
   
   @tagStack7 @tagStack
   Scenario: The user should be directed to editor page with run button to test python code from Implementation page
   When The user clicks on Implementation link
   Then The user should be redirected to stack implementation page
   When The user clicks on Tryhere link
   Then The user should be directed to Editor page with Run button
   
   
   @tagStack8 @tagStack
   Scenario: The user is able to run code in Editor for Implementation page
   When The user clicks on Implementation link
   Then The user should be redirected to stack implementation page
   When The user clicks on Tryhere link
   Given The user is in a page having an Editor with a Run button to test
   When The user enters valid python code in Editor from stack page
   And Clicks run button after valid code
   Then The user is presented with the result after run button is clicked
   
   @tagStack9 @tagStack
   Scenario: The user is presented with error message for invalid code in Editor for Implementation page
   When The user clicks on Implementation link
   Then The user should be redirected to stack implementation page
   When The user clicks on Tryhere link
   Given The user is in a page having an Editor with a Run button to test
   When The user enters invalid python code in Editor from stack page
   And Clicks run button after invalid code
   Then The user gets an error message
   
  