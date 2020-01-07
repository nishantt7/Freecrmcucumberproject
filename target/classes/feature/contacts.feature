Feature: Contact creation feature

Scenario: Create contact

Given user is on the login page
Then user enters username
| pranshoomalhotra@gmail.com |
And user enters password
| Freecrm@123 |
Then user clicks on login button
Then user navigates to contacts page
Then user clicks on new button
Then user enters first name and last name and company name and email and  position and department
| Pranshoo | Malhotra | Mercer | Pranshoomalhotra@mercer.com | consultant | Surveyops | 
Then user clicks on save button
Then user closes the browser


