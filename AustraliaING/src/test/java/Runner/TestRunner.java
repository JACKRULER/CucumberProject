 package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)

@CucumberOptions(
		 features = "C:\\Jack_Selenium\\JavaMavenFramework\\Features\\ChromeBrowser.feature",
	     glue={"StepDefinition"},
	     plugin = { "pretty", "html:target/cucumber-reports" },
				 monochrome = true
		 )

public class TestRunner {

}
