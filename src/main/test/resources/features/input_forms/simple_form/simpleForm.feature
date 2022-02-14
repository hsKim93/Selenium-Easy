Feature: Simple Form
  Scenario Outline Single Input Field
    Given I am on simple form page
    When I enter "<string>" into Enter message box
    When I click Show Message Button
    Then I should see "<string>" displayed next to Your Message
    Examples:
      | string |
      | Hello World |
      | dsfg 2354tg |
      | !^$#%# SDFG OEWR#@^)#$_^% |