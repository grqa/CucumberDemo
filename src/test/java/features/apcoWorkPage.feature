Feature: Apco Work page

@WorkPage
Scenario: Verifying the Work Page Title
Given User is landing on home page and accepting cookies window
When User clicking on "Work" button on "top" menu
Then The page title is "Work and Expertise – APCO Worldwide"

@WorkPage
Scenario: Verifying all links at Work page are working
Given User is landing on home page and accepting cookies window
When User clicking on "Work" button on "top" menu
Then Check all the links on the "Work" page

@WorkPage
Scenario: Verifying that apco logo is visible
Given User is landing on home page and accepting cookies window
When User clicking on "Work" button on "top" menu
Then The white logo is displayed "true"

@WorkPage
Scenario: Verifying that selected services changing at every refresh
Given User is landing on home page and accepting cookies window
When User clicking on "Work" button on "top" menu
And scroll into view "WorkServices"
And Checks which service is selected "first"
And refreshing the page
And Checks which service is selected "second"
Then The services should be the same "false"

@WorkPage
Scenario: Verifying that when you click on digital at services a description appears
Given User is landing on home page and accepting cookies window
When User clicking on "Work" button on "top" menu
And click on "digital"
Then The learn more button of the digital description should appear