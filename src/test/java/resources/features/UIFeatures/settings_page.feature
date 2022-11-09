Feature: Users setting test

  @UserSettingsInfoEdit

    Scenario Outline: test setting info editable

    Given user will be login with "<userName>" and "<password>"
    And user clicks on account name
    And user clicks on settings
    And user edits firstname as "<firstName>"
    And user edits lastname as "<lastName>"
    And user edits email as "<email>"
    And user click on save
    Then user validates the toast message "Settings saved!"
    And user sign out

    Examples:
    |userName |password |firstName  |lastName |email  |
    |medunna_admin|admin12345|Admin|Admin|admin_mt@email.com|
    |medunna_user|user12345|User|User|user_mt@email.com|
    |medunna_patient|patient12345|Patient|Patient|patient_mt@email.com|
    |medunna_staff|staff12345|Staff|Staff|staff_mt@email.com|
    |medunna_physician|physician12345|Physician|Physician|physician_mt@email.com|

