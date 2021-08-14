Feature: Create Todo Items

  @T1
  Scenario: User creates two Todo Items
    Given the user is in the main page
    When user clicks "JavaScript" tab
    And user clicks "Polymer"
    And user creates to do items as below
      | Todo1 |
      | Todo2 |
    Then Todo items created successfully

  @T2
  Scenario: User creates Todo Items and Edits second item
    Given the user is in the main page
    When user clicks "JavaScript" tab
    And user clicks "Polymer"
    And user creates to do items as below
      | Todo1 |
      | Todo2 |
    And user edit "Todo2" as "Todo2New"
    Then Todo item updated successfully