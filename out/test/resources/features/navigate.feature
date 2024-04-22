Feature: Home Page

  @navigate
  Scenario: Verify HomePage title is displayed
    Given User launches Chrome browser
    When User open ilCarro HomePage
    Then User verify HomePage title is displayed
    And User quites browser