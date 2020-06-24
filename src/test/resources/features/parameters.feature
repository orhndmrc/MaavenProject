Feature:  Practuce for parameterization

  @doublequoteparams
  Scenario: string parameter with double quotes
    When I read parameter "value1"
    Then I read parameter "value2"
    And I read parameter "value3"
    But I read parameter "value4 abc 123"

@login
    Scenario: multiple string params
      Given I login with "user1" id and "password1" password
      Given I login with "user2" id and "password2" password
      Given I login with "user3" id and "password3" password
