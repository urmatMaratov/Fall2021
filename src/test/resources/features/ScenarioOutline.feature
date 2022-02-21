Feature: Scenario Outline demo

  Scenario Outline: Multiple tests

    Given user is on FaceBook
    When user enters "<email>"
    And user enters "<Password>"
    And user clicks on login button
    Then user should see "<message>"
    Examples:
      | email            | Password      | message           |
      | nurs@gmail.com   | Qwery123      | Successful        |
      | adik@mail.ru     | Hello312      | Successful        |
      | marsel@yahoo.com | 123Sdsad      | Account not found |
      | rus@bk.ru        | dasdasdasd123 | Account not found |

