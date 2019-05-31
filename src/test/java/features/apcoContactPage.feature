Feature: Apco Contact page

@ContactPage
Scenario: Verifying the Contact Page Title
Given User is landing on home page and accepting cookies window
When User clicking on "contact" button on "top" menu
Then The page title is "Contact – APCO Worldwide"

@ContactPage
Scenario: Verifying all links at contact page are working
Given User is landing on home page and accepting cookies window
When User clicking on "contact" button on "top" menu
Then Check all the links on the "contact" page

@ContactPage
Scenario: Verifying that apco logo is visible
Given User is landing on home page and accepting cookies window
When User clicking on "contact" button on "top" menu
Then The white logo is displayed "true"