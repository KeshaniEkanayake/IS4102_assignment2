
Feature: As a user I need to add a new user to the system


  @TC_001
  Scenario Outline: Successful new user creation
    Given User loginto app entering "<username>" and "<password>" goto Users Page
    When User clicked in New User button
    Then User Entered the First Name as "<name>"
    Then User Entered the Last Name as "<lastName>"
    Then User Entered the Email as "<email>"
    Then User clicked in Save button
    Then User should be able to successfully add a new user with email as "<confirmEmail>"
    Examples:
      | name  | lastName | email | confirmEmail | username | password |
      | Brie | Stuart | briestuart@gmail.com | briestuart@gmail.com | keshanieekanayake@gmail.com |5QdNfSQe |
