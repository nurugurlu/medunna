Feature:Appointment DB test

  @AppointmentDBValidation
  Scenario Outline: Data Base appointment validation  with id
    Given user connects to the database
    And user selects all "id" column data
    And user verify "<id>" with the database
    Then close the database connection
    Examples:
      |id|
      | 26450 |
      | 26448 |