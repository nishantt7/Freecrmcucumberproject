Feature: Free crm login feature

Scenario: Free crm user login test

Given user is on the login page
#When title of login page is freecrm
Then user enters username "pranshoomalhotra@gmail.com"
And user enters password "Freecrm@123"
Then user clicks on login button 
