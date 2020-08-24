Feature: DemoBlaze Login feature

#Without Examples keyword
#Scenario: DemoBlaze login test

#Given User is available on login page
#When title of login page is Store
#Then user click on Log in menu
#Then user enters "gauravburhade" and "Lmessi@10"
#Then user clicks on login button
#Then user is on home page
#Then close the browser

#With Examples keyword
Scenario Outline: DemoBlaze login test

#Given User is available on login page
#When title of login page is Store
#Then user click on Log in menu
#Then user enters "<username>" and "<password>"
#Then user clicks on login button
#Then user is on home page
#Then close the browser

Examples:
        | username | password |
        | gauravburhade | Lmessi@10 |
        | tom     |  test456 |



