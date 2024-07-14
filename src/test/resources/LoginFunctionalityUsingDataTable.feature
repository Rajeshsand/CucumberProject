Feature: To Validate the Login Functionality in  Application
Scenario: To validate the  username and password functionality
Given To Launch the  Browser and to maximize the Web page
When To pass the FB application url in the browser
And To validate the username by passing values 
#1D Map data
   |Username 1|san12345|
   |Username 2|Sandyraj|
And To vaidate the password by passing Values in the password field
#2D Map data
   |Password 1|Password 2|
   |Sanu@6699|Pass@3197|
   |Rajesh@6699|SandhyaRaj@3679|
And To click the login button for validation
And To check wheather it will navigate to the home page or not
Then To close the web page

