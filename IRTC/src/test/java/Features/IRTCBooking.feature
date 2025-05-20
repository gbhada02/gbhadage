
@tag
Feature: Train Search Functionality
 
 Background:
Given I am on the trainsearch homePage

  @Regression2
  Scenario Outline: verify user is able to Search train from City A to City B
    Given Search the train '<fromcity>' to '<tocity>' select date  '<dsate>' calender and class "class", '<BookingTye>'
    Then I should see the list of available trains and verify the range and select the minimum price range
  
 Examples:
 |fromcity| tocity | date | class | BookingType | 
 |Mumbai central | Goa Madgaon | 07/07/2025 | 3A | General | 
  |Mumbai central | Goa Madgaon | 07/07/2025 | 3A | General | 
 
