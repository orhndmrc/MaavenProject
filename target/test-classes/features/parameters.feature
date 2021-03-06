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

  @outlineexample
  Scenario Outline: string parameter with double quote
    When I read parameter "<values>"
    Given I login with "<username>" id and "<password>" password
    Examples:
    |values               |username|password |
    |    value1           |user1   |password1|
    |    value2           |user2   |password2|
    |    value3           |user3   |password3|
    |    value 4 abc 123  |user4   |password4|


    @mapparams
Scenario: multiple params
  #Given I enter first name"some fn" and last name "some last"
  Given I fill signup form
    | first name    | some fn         |
    | last name     | some ln         |
    | address line1 | 200 some street |
    | address line2 | Suite A4        |
    | zip code      | 10001           |
    | City          | Ney York        |
    | State         | NY              |

      Then I fill bankapplication form
        | first name    | some fn         |
        | last name     | some ln         |
        | address line1 | 200 some street |
        | address line2 | Suite A4        |
        | zip code      | 10001           |
        | City          | Ney York        |
        | State         | NY              |


      And I fill registration form
        | first name    | some fn         |
        | last name     | some ln         |
        | address line1 | 200 some street |
        | address line2 | Suite A4        |
        | zip code      | 10001           |
        | City          | Ney York        |
        | State         | NY              |