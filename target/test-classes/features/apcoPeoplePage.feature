Feature: Apco People page

@PeoplePage
Scenario: Verifying the People Page Title
Given User is landing on home page and accepting cookies window
When User is hovering on "about"
And User is hovering on submenu "leadership"
And click on "Iac"
And click on "Breadcrumb"
Then The page title is "People – APCO Worldwide"

@PeoplePage
Scenario: Verifying all links at People page are working
Given User is landing on home page and accepting cookies window
When User is hovering on "about"
And User is hovering on submenu "leadership"
And click on "Iac"
And click on "Breadcrumb"
Then Check all the links on the "News" page

@PeoplePage
Scenario: Verifying that apco orange logo is visible
Given User is landing on home page and accepting cookies window
When User is hovering on "about"
And User is hovering on submenu "leadership"
And click on "Iac"
And click on "Breadcrumb"
Then The orange logo is displayed "true"

@PeoplePage
Scenario: Verifying that senior leadership link landing you on leadership page
Given User is landing on home page and accepting cookies window
When User is hovering on "about"
And User is hovering on submenu "leadership"
And click on "Iac"
And click on "Breadcrumb"
And click on "SeniorLeadership"
Then The page title is "Leadership – APCO Worldwide"

