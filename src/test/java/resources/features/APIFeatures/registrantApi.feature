Feature: Registrant api test


  @ApiRegistrant
  Scenario: registrant test
    Given user sets the necessary path params
    And user sets the expected data "<firstname>", "<lastname>" "<SSN>" "<email>" "<username>" "<password>"
    And user sends the POST request and gets the response
    When user saves the api records to correspondent files
    Then user validates api records

