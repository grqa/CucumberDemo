package cucumberOptions;

import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.ExtentProperties;
import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", // the path of the feature files
		glue = "stepDefinitions", 
		tags = "", 
		dryRun = false, monochrome = true, plugin = { "pretty",
				"html:target/cucumber", "junit:junit_xml/cucumber.xml", "json:target/cucumber.json",
				"io.qameta.allure.cucumber3jvm.AllureCucumber3Jvm",
				//"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:" 
				})

public class TestRunner {
	@BeforeClass
	public static void setup() {
		ExtentProperties extentProperties = ExtentProperties.INSTANCE;
//        extentProperties.setExtentXServerUrl("http://localhost");
//        extentProperties.setProjectName("MyProject");
		extentProperties.setReportPath("output/myreport.html");
	}

	@AfterClass
	public static void teardown() throws IOException {
		Reporter.loadXMLConfig(new File("/src/main/resources/extent-config.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Linux");
		Reporter.setTestRunnerOutput("Apco Demo QA Project");
	}

}
