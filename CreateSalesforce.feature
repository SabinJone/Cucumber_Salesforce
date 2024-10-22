Feature: Create Login in Salesforce Application

Scenario Outline: Login with valid credentials
Given Launch the browser and Load the URL
When Enter the Username as 'dilip@testleaf.com'
And Enter the Password as 'leaf@2024'
Then Click on the Login button
And Click on the Toggle menu
And Click on View All
Then Click on Sales
Then Click on Oppurtunities tab
And Click on New button
And Enter the Opportunity name as <OppurtunityName>
And Enter the Amount as <Amount>
Then Choose the Close date as Today
And Select stage as Need Analysis
Then Click on the Save button
Then Verify the Opportunity Name

Examples:
|OppurtunityName|Amount|
|'Sales Automation by Jone'|'60000'|
|'Sales Automation by Franky'|'80000'|