Feature: checkboxradio test
  @checkbox
  Scenario: checkboxradio page testing
    Given I navigate to jquery homepage
    When I click on checkboxradio button
    And I switch the frame
    Then I click on 4 hotel rating
    Then I validate if the button is selected



