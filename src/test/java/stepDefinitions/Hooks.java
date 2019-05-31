package stepDefinitions;

import java.io.IOException;

import com.vimalselvam.cucumber.listener.Reporter;

import base.TestBase;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.TestUtil;

public class Hooks extends TestBase {

	@Before(order = 1)
	public void Init() {
		TestBase.initialization();
	}

	@Before(order = 0)
	public void beforeScenario(Scenario scenario) {
		if (scenario.getName().equals("Apco Demo TestProject")) {
			Reporter.assignAuthor("Spanos Anastasios");
		}
	}

	@After(order = 1)
	public static void tearDown(Scenario scenario) throws IOException {

		if (scenario.isFailed()) {
			String path = TestUtil.takeScreenshotAtEndOfTest(scenario);
			Reporter.addScreenCaptureFromPath(path);
		}
	}

	@After(order = 0)
	public void ClosingBrowser() {
		driver.quit();
		driver = null;
	}

}
