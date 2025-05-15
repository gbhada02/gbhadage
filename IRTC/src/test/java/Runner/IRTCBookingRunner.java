package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\divya\\eclipse-workspace\\gitprojects\\gbhadage\\IRTC\\src\\test\\java\\Features\\IRTCSearchFunctionality.feature",
		glue ="StepDefinitions",
		tags= "@Regression",
		monochrome = true 
		//dryRun = true
		)
public class IRTCBookingRunner {

}
