#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Testing the Juice shop Application 
  I want to use this template for my feature file

  @tag1
  Scenario: Lauch the Application for the Juice Shop and add to cart the item and final checkout 
    Given User registrater to Juice shop Application
    And Dismiss the popup application
    When User navigate to Account information
    And User clicks on Login button information
    And yet another action button
    Then User Registartion form should be displayed
    When Enter the user information
    And Clik on the submit button
    And User is login to Juice shop Application
    And Enter Login Credinetials Information
    Then Click on the Login button
    When User add the items to the cart
    And Click on the checkout the items
    Then Add the New address details for the Shipment
    And User submit the new address details for the shipment
    And Select the added address details 
    Then User Click on the continue button
    And User Choose the delivery options
    And Add the Card details
    And Proceed to the Reviw Button
    When User clicks on the Place your Order and Pay to Reiview
    Then User is able to view the Order COnfrimation