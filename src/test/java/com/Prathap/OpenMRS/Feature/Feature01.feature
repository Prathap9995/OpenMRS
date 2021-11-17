
Feature: OpenMRS application functionalties
  
  Background: Login functionalities
  Given Navigate to "https://demo.openmrs.org/openmrs/login.htm"
  
@Login
  Scenario Outline: Login Feature
    Given Try to Login using <Email> and <Password> 
    And Select the proper Location
    When Click on Login button
    Then If it a valid then get PageTitle else error message
   
   Examples:
   		| Email	| password|
   		| Admin			| Admin123|
   		| Prathap		| P123		|
@Customer
	Scenario: To Fetch customer details
	Given Login using "Admin" and "Admin123" 
	When Click on find a patient 
	And Search using Keyword "Adam"
	And select a Patient with name "Donna Adams"
	Then Get the contact information and take a screenshot
	And Click on logout and close the browser

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
