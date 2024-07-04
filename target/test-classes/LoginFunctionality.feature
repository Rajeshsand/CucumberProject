Feature: To Validate the Login Functionality in Facebook Application

Background:
Given To Launch the Compatible Browser and to maximize the browser page




Scenario: To validate the invalid username and password functionality

When To pass the application url in the browser
And To validate the username by passing invalid values  
And To vaidate the password by passing invalid Values in the password field
And To click the login for validation
And To check wheather it will navigate to the home page or error page
Then To close the compatible Browser 



Scenario Outline:

When  To launch the url of the application
And  To pass the positive and negative values in "<usernames>"usename field for validation
And To pass the positive and negative values in  "<passwords>"password field for validation
And To execute the login button 
Then Close the application page and browser


Examples:

   |usernames|passwords|
   |Sandy@1234|san12345|
   |Rajsan@442|rajesh1997|
   |Sanu@6699|Pass@3197|