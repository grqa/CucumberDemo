Feature: Apco terms and conditions page

@TermsAndConditionsPage
Scenario: Verifying the terms and conditions Page Title
Given User is landing on home page and accepting cookies window
When clicking on "termsAndCon"
Then The page title is "Terms & Conditions – APCO Worldwide"

@TermsAndConditionsPage
Scenario: Verifying that apco logo is visible
Given User is landing on home page and accepting cookies window
When clicking on "termsAndCon"
Then The orange logo is displayed "true"