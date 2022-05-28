Feature: Test log in function
@smoketest
  Scenario: check login is working.
    Given user is on the login page
    When user given the Username and password
    And clicked on login button
    Then navigated to the home page
    
    
