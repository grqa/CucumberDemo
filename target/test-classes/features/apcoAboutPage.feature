Feature: Apco about page

@AboutPage
Scenario: Verifying the About Page Title
Given User is landing on home page and accepting cookies window
When User clicking on "about" button on "top" menu
Then The page title is "About – APCO Worldwide"

@AboutPage
Scenario: Verifying all links at about page are working
Given User is landing on home page and accepting cookies window
When User clicking on "about" button on "top" menu
Then Check all the links on the "about" page

@AboutPage
Scenario: Verifying that apco logo is visible
Given User is landing on home page and accepting cookies window
When User clicking on "about" button on "top" menu
Then The white logo is displayed "true"