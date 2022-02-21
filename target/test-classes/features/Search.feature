Feature: Search functionality

  Background: User in Lalafo
    Given User is logged in to https://www.lalafo.kg/


  Scenario: Verify user can search by words
    When User enter word to searching field
    And User clicks the search button
    Then User successfully find item

    Scenario Outline: Multiple Tests
      When User enters "<item>" to searching field
      And User clicks the search button
      Then User successfully find "<item>"
      Examples:
        | item  | item  |
        | word  | word  |
        | photo | photo |
        | video | video |