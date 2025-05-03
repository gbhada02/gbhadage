package StepDefinitions;

import java.io.IOException;
import java.time.Duration;

import Utility.PageActions;
import Utility.Utils;
import io.cucumber.java.en.Given;

public class CommonSteps extends Utils {

		

	@Given("I am on the trainsearch homePage")
	public void i_am_on_the_trainsearch_home_page() throws IOException {
		PageActions.Login(readConfig("browser"));
		driver.get(readConfig("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
}
