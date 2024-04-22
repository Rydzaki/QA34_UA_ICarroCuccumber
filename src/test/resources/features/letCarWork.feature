Feature: FindCar

  @addCar

  Scenario: Make sure that the machine is located according to the specified parameters
    Given User launches Chrome browser
    When User open ilCarro HomePage
    And User clicks on Login link
    And User enters valid data
    And User clicks on Yalla button
    And User clicks on Ok button (type="button")
    When User clicks on Let tje car work
    And User enters the date
    And User uploads a photo
    And User clicks on Submit butoon
    Then User verifies Success Message is displayed Car added
    And User quites browser