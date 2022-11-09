Feature: Appointment api test

  @ApiRegistrant
  @ApiAppointmentCreationPost
  Scenario Outline: appointment test
    Given user sets the necessary path params for appointment creation
    And user sets the expected data "<firstname>", "<lastname>" "<SSN>" "<email>" "<phone>"  and "<date>"
    And user sends the POST request and gets the response for appointment creation
    When user saves the appointment records to correspondent files
    Then user validates appointment records
    Examples: test data
      | firstname    | lastname | SSN         | email                   | phone        | date       |
      | nur_patient  | ug       | 456-65-4565 | lucky.mom1121@gmail.com | 789-898-4561 | 2022-03-18 |
      | musa_patient | ug       | 654-56-5654 | lucky.dad@gmail.com     | 987-898-1654 | 2022-03-18          |


  @ApiRegistrant
  @ApiAppointmentCreationGet
  Scenario: api get request for appointment
    Given user sends the get request for appointments data
    And user deserializes data to Java for appointments
    And user saves the users data to correspondent files for appointments


