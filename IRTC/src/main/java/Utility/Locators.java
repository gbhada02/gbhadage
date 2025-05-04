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
By nextbutton = By.xpath("//span[@class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10']");
By previousbutton = By.xpath("//span[@class='ui-datepicker-prev-icon pi pi-chevron-left ng-tns-c58-10']");
By selectDate= By.xpath("//a[@class='ui-state-default ng-tns-c58-10 ui-state-active ng-star-inserted']");
By selectclass=By.xpath("//li[@role='option']/span[contains(text(),'Sleeper')]");
By selectAllclass=By.xpath("//p-dropdown[@id='journeyClass']/div");
By clicksearchbutton = By.xpath("//button[text()='Search']");
By Refresh_Sleeper = By.xpath("//strong[text()='Sleeper (SL)']/parent::div/following-sibling::div[text()=' Refresh ']/span");
}
