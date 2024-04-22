Feature: FindCar

  @findCar

  Scenario: Make sure that the machine is located according to the specified parameters
    Given User launches Chrome browser
    When User open ilCarro HomePage
    And User enters the city and date
    And User clicks in Yalla button on Home
    Then A page with pictures of available cars will load
    And User quites browser