Feature: Home page after loggin in
  I want to use this template for my feature file
 
 Background: The user is ds algo home page
 Given The user is on ds algo home page
 
 Scenario Outline: user checks drop down functionality after loggin in
   When the user click on "<options>" from drop down link
   Then the user is redirected to the respective "<options>"  page
   Examples: 
      | options         |
      | Arrays         |
      | Linked List     |
      | Stack          |
      | Queue          |
      | Tree           |
      | Graph          |
 
 Scenario Outline: User tests Get Started button after loggin in
 When the user clicks on "<Get_Started>" button in home page
  Then the user is redirected to the respective "<Get_Started>" pages
 Examples:
| Get_Started    |
|Data-Structures-Introduction|
| Array          |
| Linked-List    |
| Stack          |
| Queue          |
| Tree           |
| Graph          |