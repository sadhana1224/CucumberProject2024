# Data driven testing--Using Data table
#Feature: MyAccountLogin Feature
  # Given Open browser
   # When Enter the url "https://practice.automationtesting.in/"
   # And Click on the myaccount menu
   # When Enter registered username and password
    #  | sadhu.lokii1924@gmail.com | Sadhu@123 |
    #And click on the login button
   # Then user should be able to login successfully



#Simple login with Data table params with header
Feature: MyAccountLogin Feature
  Scenario: Log-in with valid username and password
    Given Open the browser
    When Enter the URL "http://practice.automationtesting.in/"
    And Click on My Account Menu
    And Enter name and pwd
      |	user	|	password	|
      | sadhu.lokii1924@gmail.com | Sadhu@123 |
    And Click on login button
    Then User must successfully login to the web page