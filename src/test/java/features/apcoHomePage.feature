Feature: Apco home page

@HomePage
Scenario: Verifying the Home Page Title
Given User is landing on home page and accepting cookies window
Then The page title is "APCO Worldwide – An advisory and advocacy communications consultancy"

@HomePage
Scenario: Verifying all links at home page are working
Given User is landing on home page and accepting cookies window
Then Check all the links on the "home" page

@HomePage
Scenario: Verifying that apco logo is visible
Given User is landing on home page and accepting cookies window
Then The white logo is displayed "true"

@HomePage
Scenario: Verifying that orange apco logo when scrolling is visible
Given User is landing on home page and accepting cookies window
When Scrolling down
And Scrolling up
Then The orange logo is displayed "true"

@HomePage
 Scenario: Verifying that apco logo when scrolling is visible
Given User is landing on home page and accepting cookies window
When Scrolling down
Then The white logo is displayed "false"

@HomePage
Scenario: Verifying that orange apco logo at the top of the page is not visible
Given User is landing on home page and accepting cookies window
Then The orange logo is displayed "false"

@HomePage
Scenario: Verifying about link on top menu is working
Given User is landing on home page and accepting cookies window
When User clicking on "about" button on "top" menu
Then The page title is "About – APCO Worldwide"

@HomePage
Scenario: Verifying about link on lower menu is working
Given User is landing on home page and accepting cookies window
When User clicking on "about" button on "lower" menu
Then The page title is "About – APCO Worldwide"

@HomePage
Scenario: Verifying work link on top menu is working
Given User is landing on home page and accepting cookies window
When User clicking on "Work" button on "top" menu
Then The page title is "Work and Expertise – APCO Worldwide"

@HomePage
Scenario: Verifying work link on lower menu is working
Given User is landing on home page and accepting cookies window
When User clicking on "Work" button on "lower" menu
Then The page title is "Work and Expertise – APCO Worldwide"

@HomePage
Scenario: Verifying blog link on top menu is working
Given User is landing on home page and accepting cookies window
When User clicking on "blog" button on "top" menu
Then The page title is "APCO Forum - The latest insights from APCO Worldwide's global experts."

@HomePage
Scenario: Verifying blog link on lower menu is working
Given User is landing on home page and accepting cookies window
When User clicking on "blog" button on "lower" menu
Then The page title is "APCO Forum - The latest insights from APCO Worldwide's global experts."

@HomePage
Scenario: Verifying contact link on top menu is working
Given User is landing on home page and accepting cookies window
When User clicking on "contact" button on "top" menu
Then The page title is "Contact – APCO Worldwide"

@HomePage
Scenario: Verifying contact link on lower menu is working
Given User is landing on home page and accepting cookies window
When User clicking on "contact" button on "lower" menu
Then The page title is "Contact – APCO Worldwide"

@HomePage
Scenario: Verifying search on top menu is working
Given User is landing on home page and accepting cookies window
When User clicking on "search" button on "top" menu
Then The search field is displayed "true"

@HomePage
Scenario: Verifying that search field is working
Given User is landing on home page and accepting cookies window
When User clicking on "search" button on "top" menu
And clearing the search field
And typing "test"
And click on "magnify icon"
Then The search result should give as a result "test"

@HomePage
Scenario: Verifying that close button at search area is working
Given User is landing on home page and accepting cookies window
When User clicking on "search" button on "top" menu
And click on "close button"
Then The search field is displayed "false"

@HomePage
Scenario: Verifying that when I’m hovering on about at top menu a sub-menu appearing 
Given User is landing on home page and accepting cookies window
When User is hovering on "about"
Then The sub-menu should be displayed "true"

@HomePage
Scenario Outline: Verifying that links on about sub-menu at top-menu are working
Given User is landing on home page and accepting cookies window
When User is hovering on "about"
And clicking on topsubmenu<submenu>
Then The title is <titles>
Examples:
|submenu|titles|
|locations|Contact – APCO Worldwide|
|careers   |Careers – APCO Worldwide|
|leadership|Leadership – APCO Worldwide|
|news         |News – APCO Worldwide|
|awards      |Awards – APCO Worldwide|

@HomePage
Scenario Outline: Verifying that links on about sub-menu at lower-menu are working
Given User is landing on home page and accepting cookies window
When clicking on submenu<submenu>
Then The title is <titles>
Examples:
|submenu|titles|
|locationsDown|Contact – APCO Worldwide|
|careersDown   |Careers – APCO Worldwide|
|leadershipDown|Leadership – APCO Worldwide|
|newsDown         |News – APCO Worldwide|
|awardsDown      |Awards – APCO Worldwide|

@HomePage
Scenario: Verifying that IAC link of the sub-menu leadership on the about sub-menu on top menu is displayed
Given User is landing on home page and accepting cookies window
When User is hovering on "about"
And User is hovering on submenu "leadership"
Then The Iac button is displayed "true"

@HomePage
Scenario: Verifying that IAC link of the sub-menu leadership on the about sub-menu on top menu is working
Given User is landing on home page and accepting cookies window
When User is hovering on "about"
And User is hovering on submenu "leadership"
And click on "Iac"
Then The page title is "International Advisory Council – APCO Worldwide"

@HomePage
Scenario: Verifying that learn button is working
Given User is landing on home page and accepting cookies window
When clicking on "learn_more"
Then The page title is "About – APCO Worldwide"

@HomePage
Scenario: Verifying that privacy policy button on lower menu is working
Given User is landing on home page and accepting cookies window
When clicking on "privacy_policy"
Then The page title is "Privacy Policy – APCO Worldwide"

@HomePage
Scenario: Verifying that terms and conditions button on lower menu is working
Given User is landing on home page and accepting cookies window
When clicking on "termsAndCon"
Then The page title is "Terms & Conditions – APCO Worldwide"

@HomePage
Scenario: Verifying that all the boxes at Driven by our values expand slightly when you click on them
Given User is landing on home page and accepting cookies window
When User clicks on all boxes at Driven by our values
Then The boxes expand slightly "true"

@HomePage
Scenario: Verifying that the default expanded box at What People are saying is not the same after every refresh
Given User is landing on home page and accepting cookies window
When User checking which box is active before refresh
And refreshing the page
And User checking which box is active after refresh
Then Before refresh and after refresh results should be different

@HomePage
Scenario: Verifying that the boxes at What People are saying expand slightly when you click on them
Given User is landing on home page and accepting cookies window
When User clicks on boxes at what people are saying
Then The boxes expand slightly "true"

@HomePage2
Scenario: Verifying that Ai and the rise video will play
Given User is landing on home page and accepting cookies window
When clicking on "AiAndTheRiseVideo"
And with the help of sikuli clicking on play button
Then With the help of sikuli clicking on pause button
And The video working "true"

@HomePage
Scenario: Verifying that Clients Logos are visually correct
Given User is landing on home page and accepting cookies window
When Scrolling into view "ClientDanfoss"
And taking a screenshot
Then Screenshot and the expected image are "true"