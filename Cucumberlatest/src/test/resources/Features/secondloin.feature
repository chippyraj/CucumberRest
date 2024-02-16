Feature: Application Login

  Scenario: Home page default login
    Given User is on networking landing page
    When User login into application with username and password
    Then Home page is popilated
    And Cards are displayed
