package StepDefinitions;


import java.io.IOException;
import java.time.Duration;



import Utility.PageActions;
import Utility.Utils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;

public class CommonSteps extends Utils {
static String localscenario ;
		@Before
public static void  getScenario(Scenario sc) throws IOException {
		localscenario=sc.getName();
		extentReport(localscenario);
		}
		
		@After
		public static void disconnet() {
			extent.flush();
		}

	@Given("I am on the trainsearch homePage")
	public void i_am_on_the_trainsearch_home_page() throws IOException {
		PageActions.Login(readConfig("browser"));
		driver.get(readConfig("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
}
