package Utility;

import org.openqa.selenium.By;

public interface Locators {
By fromCity = By.xpath("//Label[text()='From']/preceding-sibling::p-autocomplete/span/input");
By ToCity = By.xpath("//Label[text()='To']/preceding-sibling::p-autocomplete/span/input");
By selectfirstcity = By.xpath("//span[text()='----- Stations -----']/parent::li/following-sibling::li[1]/span");
By selectfirstDistinationcity = By .xpath("//p-autocomplete[@id='destination']/descendant::li[1]");
By calender = By.xpath("//span[@class='ng-tns-c58-10 ui-calendar']/input");
By monthfromCalender = By.xpath("//span[@class='ui-datepicker-month ng-tns-c58-10 ng-star-inserted']");
By yearfromCalender = By.xpath("//span[@class='ui-datepicker-year ng-tns-c58-10 ng-star-inserted']");
}
