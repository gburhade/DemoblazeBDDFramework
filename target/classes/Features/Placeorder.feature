Feature: Demoblaze Place order feature

Scenario: Demoblaze Place order test

Given User is available on login page
When title of login page is Store
Then user click on Log in menu
#Data tables
Then user enters username and password
| username      | password  |
| gauravburhade | Lmessi@10 |

Then user clicks on login button
Then user is on home page
Then user click on Samsung galaxy s6
Then user click on Add to cart button
Then Verify product is added
Then click on Cart menu
Then click on Place order
#Data tables	 
And fill the user details and click on Purchase button
| Name | Country | City | CreditCard | Month | Year | 	
| tom | India | Nashik | HDFC | July | 2020 |
| peter | Holland | Amsterdams | BON | August | 2020 |
|  Leo  | Argentina | BuenoAires | BOA | August | 2020 |

Then verify confirmation message
Then close the browser