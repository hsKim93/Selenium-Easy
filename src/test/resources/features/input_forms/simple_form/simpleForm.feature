Feature: Simple Form
  Scenario Outline: Single Input Field
    Given I am on simple form page
    When I enter "<string>" into Enter message box
    When I click Show Message button
    Then I should see "<string>" displayed next to Your Message
    Examples:
      | string |
      | Hello World |
      | dsfg 2354tg |
      | !^$#%# SDFG OEWR#@^)#$_^% |

  Scenario Outline: Two Input Fields
    Given I am on simple form page
    When I scroll down to the bottom
    When I enter "<a>" into Enter a box
    When I enter "<b>" into Enter b box
    When I click Get Total button
    Then I should see "<a+b>" displayed next to Total
    Examples:
      | a | b | a+b |
      | a | 5 | NaN |
      | 5 | b | NaN |
      | 3 | 5 | 8   |
      | -24 | -24 | -48 |
      | -2  | 2   | 0   |
