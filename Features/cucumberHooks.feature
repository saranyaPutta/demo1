Feature: Using cucumberHooks in the facebook login test

  Scenario Outline: checking the hooks with facebook login test
    Given user on the facebook homepage
    When  user gave the emailId and Password
    And user clicked on the login
    Then user got navigated to facebook home page
