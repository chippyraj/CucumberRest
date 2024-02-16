package StepDefinition;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Features",
                  glue = "StepDefinition",
                  plugin= {"pretty", "html:target/cucumber-reports", "json:target/cucumber.json"},
                  monochrome= true )
                		  

public class TestRunner extends AbstractTestNGCucumberTests{
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios(){
		return super.scenarios();
	}

}
