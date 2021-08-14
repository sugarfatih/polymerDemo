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
      | Todo3 |
    And user edit "Todo3" as "Todo3New"
    Then Todo item updated successfully