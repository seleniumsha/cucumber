
@tag
Feature: Working on Orghrm

  
  Scenario Outline: Testing using Positive and Negavtive scenarios 
    Given Open Url
    When Enter "<Username>" and "<Password>" and click login button
    And Take screenshot
    Then Quit Browser

    Examples: 
      |Username|Password  |
      |Admin|admin|
      |dmin|admin123|
      |admin|admin|
			|Admin|admin123|