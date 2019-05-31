Feature: Apco Iac page

@IacPage
Scenario: Verifying the Iac Page Title
Given User is landing on home page and accepting cookies window
When User is hovering on "about"
And User is hovering on submenu "leadership"
And click on "Iac"
Then The page title is "International Advisory Council – APCO Worldwide"

@IacPage
Scenario: Verifying all links at Iac page are working
Given User is landing on home page and accepting cookies window
When User is hovering on "about"
And User is hovering on submenu "leadership"
And click on "Iac"
Then Check all the links on the "blog" page

@IacPage
Scenario: Verifying that apco logo is visible
Given User is landing on home page and accepting cookies window
When User is hovering on "about"
And User is hovering on submenu "leadership"
And click on "Iac"
Then The orange logo is displayed "true"

@IacPage
Scenario: Verifying that Breadcrumb is working
Given User is landing on home page and accepting cookies window
When User is hovering on "about"
And User is hovering on submenu "leadership"
And click on "Iac"
And click on "Breadcrumb"
Then The page title is "People – APCO Worldwide"

@IacPage
Scenario: Verifying that Full IAC button is preselected
Given User is landing on home page and accepting cookies window
When User is hovering on "about"
And User is hovering on submenu "leadership"
And click on "Iac"
Then The Full IAC button is preselected "true"

@IacPage
Scenario: Verifying that Full IAC button is preselected
Given User is landing on home page and accepting cookies window
When User is hovering on "about"
And User is hovering on submenu "leadership"
And click on "Iac"
And scroll into view "EduardoAguirre"
Then Take a screenshot
And Move the mouse over "EduardoAguirre"
And Take a new screenshot
And Compare screenshots if they changed after hovering on
