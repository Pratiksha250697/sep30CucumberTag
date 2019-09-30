package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="Features\\demoTags.feature",
		glue= {"stepDefinition"},
		//tags = {"@RegressionTest"}
		//tags = {"@RegressionTest","@SmokeTest"} //And
		//tags = {"@RegressionTest, @SmokeTest"} //or
		tags = {"@FunctionalTest","~@SmokeTest"}, //not
		plugin= {"html:target/cucumber-reports/",
				"json:target/cucumber-reports/GFT26Aug.json"
		}
		)

public class DemoTagsRunner 
{

}
