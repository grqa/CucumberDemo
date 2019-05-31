Feature: Apco Blog page

@BlogPage
Scenario: Verifying the Blog Page Title
Given User is landing on home page and accepting cookies window
When User clicking on "blog" button on "top" menu
Then The page title is "APCO Forum - The latest insights from APCO Worldwide's global experts."

@BlogPage
Scenario: Verifying all links at blog page are working
Given User is landing on home page and accepting cookies window
When User clicking on "blog" button on "top" menu
Then Check all the links on the "blog" page

@BlogPage
Scenario: Verifying that apco logo is visible
Given User is landing on home page and accepting cookies window
When User clicking on "blog" button on "top" menu
Then The white logo is displayed "true"