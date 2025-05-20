package Validation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

import Utility.Locators;
import Utility.Utils;

public class IRTC_validation extends Utils implements Locators {

	public void searchTrain(String fromcity, String tocity,String Date , String classType,String BookingType ) throws InterruptedException {
		 sendKeys(fromCity,fromcity);
		 click(selectfirstcity);
		 sendKeys(ToCity,tocity);
         click(selectfirstDistinationcity);
         click(calender);

         try {
			selectCalender(Date);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         click(selectAllclass);
       click(selectclass);
       click(clicksearchbutton);
	}
	
	public void findMinimumAmount() throws InterruptedException {
		List<WebElement> list = getListofWebElement(Refresh_Sleeper);
		
		for(WebElement ele : list) {
			scrolltoElement(ele);
			waitforWebElement(ele);
			Thread.sleep(2000);
			clickByJavaScript(ele);
			
		}
		List<Integer> set = new ArrayList<Integer>();
		List<WebElement> listprice = getListofWebElement(getallsleeperprice);
		for(WebElement ele : listprice) {
		scrolltoElement(ele);
		set.add(Integer.parseInt(getText(ele).split(" ")[1]));
		}
	    Collections.sort(set);
		System.out.println(set.get(set.size()-1));
		test.log(Status.PASS, "validates");
	}
	
	public void selectCalender(String Date ) throws InterruptedException, IOException {
		System.out.println(Date);
		String[] date = Date.split("/");
		String day  = date[0];
		String day1="";
		if(day.length()!=1) {
			day1=day1+day.charAt(day.length()-1);
		}
		
		int month  = Integer.parseInt(date[1]);
		int year  = Integer.parseInt(date[2]);
		System.out.println(year);
		System.out.println(getText(yearfromCalender));
		 
		while(true) {
			if(year==Integer.parseInt(getText(yearfromCalender))) {
				break;
			}
			if(year<Integer.parseInt(getText(yearfromCalender))) {
				click(previousbutton);
			}else {
				click(nextbutton);
			}
		}
		while(true) {
			System.out.println(getMonth());
			System.out.println(month);
			int monthfromcalnder=getMonth();
			if(monthfromcalnder==month) {
				getdynamicxpath(day1).click();
				Pass("testcase is passed");
				Fail("testcase fail");
				break;
				}
			if(monthfromcalnder<month) {
				click(nextbutton);
			}else {
				click(previousbutton);
			}
		}
		
		
		
		
	}
	
	public void seqarchresult() {
		
	}
		
	public WebElement getdynamicxpath(String day) {
		String s = "//a[@class='ui-state-default ng-tns-c58-10 ng-star-inserted'and text()='"+day+"']";
		return driver.findElement(By.xpath(s));
	}
		
public static int getMonth() throws InterruptedException {
	int  monthfromcalnder=0;
	Thread.sleep(2000);
	System.out.println(getText(monthfromCalender));
	switch(getText(monthfromCalender)){
	
	case "January" :
		monthfromcalnder=1;
	break;
	
	case "February" : 
		monthfromcalnder=2;
	break;
	
	case "March" : 
		
		monthfromcalnder=3;
		break;
	case "April" : 
		
		monthfromcalnder=4;
		break;
	case "May" : 
		
		monthfromcalnder=5;
		break;
	case "June" : 
		
		monthfromcalnder=6;
		break;
	case "July" : 
		
		monthfromcalnder=7;
		break;
	case "August" : 
		
		monthfromcalnder=8;
		break;
	case "Septeber" : 
		
		monthfromcalnder=9;

	case "October" : 
		
		monthfromcalnder=10;
		break;
	case "November" : 
		
		monthfromcalnder=11;
		break;
	case "December" : 
		
		monthfromcalnder=12;
		break;
	}

  return monthfromcalnder;
}

	}


