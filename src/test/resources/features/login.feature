Feature: Login

  @validData

  Scenario: Login with valid data
    Given User launches Chrome browser
    When User open ilCarro HomePage
    And User clicks on Login link
    And User enters valid data
    And User clicks in Yalla button
    Then User verifies Success Message is displayed
    And User quites browser