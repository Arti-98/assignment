Feature: Simple Form Submission

  Scenario: User fills out and submits the simple form
    Given the user is on the simple form page
    When the user enters "John" as first name
    And the user enters "Doe" as last name
    And the user enters "john@example.com" as email
    And the user enters "1234567890" as contact number
    And the user clicks the submit button
    Then the form should be submitted successfully