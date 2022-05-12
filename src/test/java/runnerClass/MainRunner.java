package runnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\KARTHIK OOPRAPPAN\\eclipse-workspace\\CucumberTest\\Features\\Login.feature"},
glue ={"stepDefinition"}, dryRun = false, monochrome = true, plugin= {"pretty", "html:target", "json:target/1.json"})

public class MainRunner {
	

	
}
