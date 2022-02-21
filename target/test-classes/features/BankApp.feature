Feature: BankApp

  Scenario: Account for Bank user
    Given User should register to Bank with following data
      | Account number | Routing number |
      | 123456789009   | 123456789      |
    Then user should successfully logged in with following credentials
      | Account number | Routing number |
      | 123456789009   | 123456789      |

