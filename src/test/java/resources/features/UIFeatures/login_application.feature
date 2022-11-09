@loginApplication
Feature: admin login feature

  Scenario Outline: user should be able to login with admin credentials

    Given user is on the login page
    And user clicks on login dropdown
    And user clicks on sign in button
    And  user enters "<userName>" and "<password>"
    And user clicks on the login button
    Then verify the login is successful

    Examples:
      |userName |password |
      |medunna_admin|admin12345|
      |medunna_user|user12345|
      |medunna_patient|patient12345|
      |medunna_staff|staff12345|
      |medunna_physician|physician12345|