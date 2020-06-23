#Recognized step keywords: Given, When, Then, And, But, *

Feature: JQuery homepage
Test the homepage of https://jqueryui.com/ website

  Background: Initial
    Given I am on the jquery homepage
@controlgroup @rwgrwssion
  Scenario: Testing controlgroup button
    This scenerio is to test the controlgroup button
    Given I am on the jquery homepage
    When I click on controlgroup
    Then I land on controlgroup page
@datepicker @smoke
  Scenario: Testing datepicker button
  This scenerio is to test the datepicker button
    Given I am on the jquery homepage
    When I click on datepicker
    Then I land on datepicker page
@checkboxradio @jquery
  Scenario: Testing checkboxradio button
  This scenerio is to test the checkboxradio button
    Given I am on the jquery homepage
    When I click on checkboxradio
    Then I land on checkboxradio page