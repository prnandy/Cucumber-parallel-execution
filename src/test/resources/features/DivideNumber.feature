@subtractNumbers
Feature: Subtracting numbers

  @subtractTwo
  Scenario: Subtracting Two Numbers
    When User enter the first number
     And User enter the second number
    Then User subtract this two number
     And Print the value

  @subtractThree
  Scenario: Subtracting Three Numbers
    When User enter the first number
     And User enter the second number
     And User enter the third number
    Then User subtract this three number
     And Print the value
