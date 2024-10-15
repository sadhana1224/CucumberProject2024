Feature: Tags in Cucumber

  @sanitytest
  Scenario: Verify login
    When This is a valid login test

    @Regression @sanitytest
    Scenario: Verify search
      When This is a search test

      @smoke
      Scenario: Verify image search
        When This is an Image search

        @smoke
        Scenario: Verify mic search
          When This is a Mic test

     @sanitytest @Regression
      Scenario: Verify Logout
            When This is a Logout test