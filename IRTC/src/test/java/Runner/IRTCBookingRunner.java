package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\divya\\eclipse-workspace\\IRTC\\src\\test\\java\\Features\\IRTCBooking.feature",
		glue ="StepDefinitions",
		tags= "@Regression",
		monochrome = true 
		//dryRun = true
		)
public class IRTCBookingRunner {

}
