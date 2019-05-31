Feature: Apco leadership page

@LeadershipPage
Scenario: Verifying the leadership Page Title
Given User is landing on home page and accepting cookies window
When User is hovering on "about"
And click on "leadership"
Then The page title is "Leadership – APCO Worldwide"

@LeadershipPage
Scenario: Verifying all links at leadership page are working
Given User is landing on home page and accepting cookies window
When User is hovering on "about"
And click on "leadership"
Then Check all the links on the "leadership" page

@LeadershipPage
Scenario: Verifying that apco logo is visible
Given User is landing on home page and accepting cookies window
When User is hovering on "about"
And click on "leadership"
Then The orange logo is displayed "true"

@LeadershipPage
Scenario: Verifying that breadcrumbs are visible
Given User is landing on home page and accepting cookies window
When User is hovering on "about"
And click on "leadership"
Then The Breadcrumbs are visible "true"