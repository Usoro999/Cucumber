// feature file must be in the Resource directory!!!

Feature: Complete registration on the https://demoqa.com/automation-practice-form
  @smoketest
Scenario Outline: The User registers on the site
  Given The user on the site
  When He fills First Name "<first name>" field
  When He fills Last Name "<last name>" field
  When He fills "<email>" email
  When He fills phoneNumber "<number>"
  Then End the test
  Examples:
    |first name  | last name|  email            | number
    |Anton       | Filiyk   |  filiyk@gmail.com | 0974324477
    |Jenia       | Valiasa  | valiasa@gmail.com | 0964831100