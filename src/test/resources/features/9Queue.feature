@tagQueue
Feature: Queue
  I want to use this template for my feature file

Background: The user is on queue page
	 Given The user is on queue home page
   
   @tagQueue2 @tagQueue
   Scenario: The user is able to navigate to Queue page
   When The user clicks Implementation of Queue in Python link on queue page
   Then The user should be redirected to queue implementation-lists page
   
   @tagQueue3 @tagQueue
   Scenario: The user should be directed to editor page with run button to test python code
   When The user clicks Implementation of Queue in Python link on queue page
   Then The user should be redirected to queue implementation-lists page
   When The user clicks on Tryhere link
   Then The user should be directed to Editor page with Run button
   
   @tagQueue4 @tagQueue
   Scenario: The user is able to run code in Editor for queue page
   When The user clicks Implementation of Queue in Python link on queue page
   Then The user should be redirected to queue implementation-lists page
   When The user clicks on Tryhere link
   Then The user should be directed to Editor page with Run button
   Given The user is in a page having an Editor with a Run button to test
   When The user enters valid python code in Editor from queue page
   And Clicks run button after valid code
   Then The user is presented with the result after run button is clicked
   
   @tagQueue5 @tagQueue
   Scenario: The user is presented with error message for invalid code in Editor for queue page
   When The user clicks Implementation of Queue in Python link on queue page
   Then The user should be redirected to queue implementation-lists page
   When The user clicks on Tryhere link
   Then The user should be directed to Editor page with Run button
   Given The user is in a page having an Editor with a Run button to test
   When The user enters invalid python code in Editor from queue page
   And Clicks run button after invalid code
   Then The user gets an error message
   
   @tagQueue6 @tagQueue
   Scenario: The user is able to navigate to queue page and click on  link Implementation using collections.deque
   When The user clicks on Implementation using collections.deque link
   Then The user should be redirected to queue implementation-collectoins  page
   
   @tagQueue7 @tagQueue
   Scenario: The user should be directed to editor page with run button to test python code from Implementation using collections.deque  page
   When The user clicks on Implementation using collections.deque link
   Then The user should be redirected to queue implementation-collectoins  page	
   When The user clicks on Tryhere link
   Then The user should be directed to Editor page with Run button
   
   
   @tagQueue8 @tagQueue
   Scenario: The user is able to run code in Editor for Implementation using collections.deque page
   When The user clicks on Implementation using collections.deque link
   Then The user should be redirected to queue implementation-collectoins  page	
   When The user clicks on Tryhere link
   Given The user is in a page having an Editor with a Run button to test
   When The user enters valid python code in Editor from queue page
   And Clicks run button after valid code
   Then The user is presented with the result after run button is clicked
   
   @tagQueue9 @tagQueue
   Scenario: The user is presented with error message for invalid code in Editor for Implementation using collections.deque  page
   When The user clicks on Implementation using collections.deque link
   Then The user should be redirected to queue implementation-collectoins  page	
   When The user clicks on Tryhere link
   Given The user is in a page having an Editor with a Run button to test
   When The user enters invalid python code in Editor from queue page
   And Clicks run button after invalid code
   Then The user gets an error message
   
   