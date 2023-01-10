Feature:

  Scenario: E2E spartan test
    When the user create a spartan
    Then verify that status code 201
    And  verify that the message is "A Spartan is Born!"
    When the user get the created spartan
    Then verify that the name is correct
    And  verify that the phone is correct
    When the user partial update the created spartan name
    Then verify that the name is updated
    When the user update the name gender phone
    Then verify that the user is updated




