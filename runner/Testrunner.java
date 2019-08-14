package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(feature="C:\\Users\\"
		+ "HP\\eclipse-workspace\\Framework\\cucumber\\pune\\batch2\\Bddframework\\featurefiles\\login.feature"
		,glue= {"stepdefinition"});
public class Testrunner {

}
