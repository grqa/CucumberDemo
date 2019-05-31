Feature: Apco News page

@NewsPage
Scenario: Verifying the News Page Title
Given User is landing on home page and accepting cookies window
When User is hovering on "about"
And click on "news"
Then The page title is "News – APCO Worldwide"

@NewsPage
Scenario: Verifying all links at News page are working
Given User is landing on home page and accepting cookies window
When User is hovering on "about"
And click on "news"
Then Check all the links on the "News" page