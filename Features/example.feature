Feature: Testing if facebook login working correctly?

   Scenario Outline: facebook login
    Given user at the facebook homepage
    When the user given the <name> and <pass>
    And clicked on the login button
    Then user navigated to the facebook home page
    
Examples:
|name|pass|
|jeeviak|sara|
|jeevikasaranya.putta|roopa@1997|