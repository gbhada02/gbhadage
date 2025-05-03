package StepDefinitions;

import Utility.Utils;
import Validation.IRTC_validation;
import io.cucumber.java.en.*;


public class IRTCBookingStep extends Utils {
	
	IRTC_validation IrtcValidation ;
	
	@Given("Search the train {string} to {string} select date  {string} calender and class {string}, {string}")
	public void search_the_train_to_select_date_calender_and_class(String fromcity, String tocity, String Date, String classtype, String BookingTye) {
		IrtcValidation= new IRTC_validation();
		IrtcValidation.searchTrain(fromcity,tocity,Date,classtype,BookingTye);
	}
	@Then("I should see the list of available trains and verify the range and select the minimum price range")
	public void i_should_see_the_list_of_available_trains_and_verify_the_range_and_select_the_minimum_price_range() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}






}
