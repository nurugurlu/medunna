Feature: appointment test



Feature: Appointment api test
    @smoke
    @Appointment_UI
  Scenario Outline: test appointments
    Given user clicks on make an appointment
    And user provides the appoinment name "<firstname>"
    And user provides the appointment lastname "<lastname>"
    And user provides ssn and email "<SSN>" and "<email>"
    When user provides the phone number "<phoneNumber>"
    And user provides the date "<date>"
    Then user requests appointment and verifies the success message
    Examples: test data
      | firstname    | lastname | SSN         | email                   | phoneNumber  | date       |
      | nur_patient  | ug       | 456-65-4565 | lucky.mom1121@gmail.com | 789-898-4561 | 03/18/2022 |
      | musa_patient | ug       | 654-56-5654 | lucky.dad@gmail.com     | 987-898-1654 | 03/18/2022 |