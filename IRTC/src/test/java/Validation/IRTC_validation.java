package Validation;

import Utility.Locators;
import Utility.Utils;

public class IRTC_validation extends Utils implements Locators {

	public void searchTrain(String fromcity, String tocity,String Date , String classType,String BookingType ) {
		 sendKeys(fromCity,fromcity);
		 click(selectfirstcity);
		 sendKeys(ToCity,tocity);
		 click(selectfirstDistinationcity);
         click(calender);
         
       
	}
	
	public void selectCalender(String Date) {
		String[] date = Date.split("/");
		int month  = Integer.parseInt(date[1]);
		int year  = Integer.parseInt(date[2]);
		
		switch(month){
			
		case 1 : "January",
		
		}
	}
	
}
