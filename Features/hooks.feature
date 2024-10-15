Feature: hooks in cucumber

  Scenario: Add new member in Account
    Given user is on add page
    When user fills all the details
    Then user is added in the account

    Scenario: Edit the user details
      Given User i son edit page
      When user edit all the necessary details
      Then user details updated

      Scenario: Delete the user
        Given user is on Delete page
        When user enter the confirmation
        Then user gets deleted
