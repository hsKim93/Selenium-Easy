Feature: Checkbox
  Scenario: Single CheckBox check
    Given I am on checkbox page
    When I click on click on this check box
    Then I should see Success - Check box is checked

  Scenario: Single CheckBox uncheck
    Given I am on checkbox page
    When I click on click on this check box
    When I click on click on this check box
    Then I should no longer see Success - Check box is checked

  Scenario Outline: Multiple Checkbox with single check
    Given I am on checkbox page
    When I click on "<option>"
    Then "<option>" will be checked
    Examples:
    | option |
    | 1 |
    | 2 |
    | 3 |
    | 4 |

  Scenario Outline: Multiple Checkbox with uncheck
    Given I am on checkbox page
    When I click on "<option>"
    When I click on "<option>"
    Then "<option>" will be not be checked
    Examples:
      | option |
      | 1 |
      | 2 |
      | 3 |
      | 4 |

  Scenario Outline: Multiple Checkbox with multiple checks
    Given I am on checkbox page
    When I click on "<option1>"
    When I click on "<option2>"
    Then "<option1>" and "<option2>" will be checked
    Examples:
      | option1 | option2 |
      | 1       | 2       |
      | 2       | 3       |
      | 3       | 4       |
      | 4       | 1       |

  Scenario: Multiple Checkbox with check all
    Given I am on checkbox page
    When I click on Check All button
    Then I should see all options checked

  Scenario: Multiple Checkbox with uncheck all
    Given I am on checkbox page
    When I click on Check All button
    When I click on Uncheck All button
    Then I should see all options unchecked

  Scenario Outline: Multiple Checkbox with check all and single uncheck
    Given I am on checkbox page
    When I click on Check All button
    When I click on "<option>"
    Then I should see Check All instead of Uncheck All
    Examples:
      | option |
      | 1 |
      | 2 |
