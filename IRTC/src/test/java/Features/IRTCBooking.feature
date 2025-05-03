
@tag
Feature: Train Search Functionality
 
 Background:
Given I am on the trainsearch homePage

  @Regression2
  Scenario Outline: Search train from City A to City B
    Given Search the train '<fromcity>' to '<tocity>' select date  '<date>' calender and class "class", '<BookingTye>'
    Then I should see the list of available trains and verify the range and select the minimum price range
  
 Examples:
 |fromcity| tocity | date | class | BookingType | 
 |Mumbai central | Goa Madgaon | 06/05/2025 | 3A | General | 
 
