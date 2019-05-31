Feature: Apco privacy policy page

@PrivacyPolicyPage
Scenario: Verifying the privacy policy Page Title
Given User is landing on home page and accepting cookies window
When clicking on "privacy_policy"
Then The page title is "Privacy Policy – APCO Worldwide"

@PrivacyPolicyPage
Scenario: Verifying that apco logo is visible
Given User is landing on home page and accepting cookies window
When clicking on "privacy_policy"
Then The orange logo is displayed "true"