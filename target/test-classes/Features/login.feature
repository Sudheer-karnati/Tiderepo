Feature: checking text functionalityin

  Scenario: check Antibacterial is present in resultant products
    Given user is on browser
    And user on Home page
    When user search "Antibacterial"
    Then user validate the text
