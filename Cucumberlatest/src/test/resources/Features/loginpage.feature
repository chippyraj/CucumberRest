Feature: Login functionality for OpenCart E-commerse Website
  
  As a user of the OpenCart website
  I want to be able to login my account
  so that I can accesss my account reated features

  Background: 
    Given I am the OpenCart login page

  Scenario: successfull username and password
    Given I have entered valid user name and password
    When I click the login button
    Then i can navigate to home page

  Scenario Outline: Unsuccessfull username and password
    Given I have entered invalid <username> and <password>
    When I entered the login button
    Then I should see an error message indicating <error_message>

    Examples: 
      | username          |  | password     |  | error_message                                    |
      | invalid@email.com |  | errorfactor  |  | Warning:No match with Email address and password |
      | anbdh             |  | errormessage |  | Warning:No match with Email address and password |
      | xyzs              |  | cvgt         |  | Warning:No match with Email address and password |

  Scenario: Navigate to the forgot password page
    When Click the forgot password link
    Then Redirect to the forgot password page
