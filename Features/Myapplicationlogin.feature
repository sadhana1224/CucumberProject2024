  #first method
#Given Open browser
#When Enter the url "https://practice.automationtesting.in/"
#And Click on the myaccount menu
#And enter the username  and password
#And click on the login button
#Then user should be able to login successfully

    #2nd method using parameter using regular expression
  # Feature: MyAccountLogin Feature
  # Scenario Outline: Login with valid username and password
  #  Given Open browser
    # When Enter the url <url>
   #   And enter the username "sadhu.lokii1924@gmail.com" and password "Sadhu@123"
   # And click on the login button
   # Then user should be able to login successfully
    #Examples:
    #|url|
    #|"https://practice.automationtesting.in/"|

#scenario outline and example-3 method  --data driven
  Feature: MyAccountLogin Feature
    Scenario Outline: Login with valid username and password
      Given Open browser
      When Enter the url "https://practice.automationtesting.in/"
      And Click on the myaccount menu
      And enter the username "<username>" and password "<password>"
      And click on the login button
      Then user should be able to login successfully
      Examples:
        |username                    |    password  |
      |sadhu.lokii1924@gmail.com|           Sadhu@123|




