Feature: Login into application


Scenario: Positive test validating login
Given Initialize the browser with chrome
And Navigate to "Gmail"
And Clicks on login page
When User enters "Username" and "password"
Then User logged in succesfully


