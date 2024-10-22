package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src\\main\\java\\features"}, //feature path
glue="stepsdefinition", //package name
publish=true,
monochrome=true)

//glue - we have stepdefinitation package name
//publish = basic cucumber report
//monochrome= to remove junk data from console

public class TestRunLogin extends AbstractTestNGCucumberTests {

	
	
}
//UndefinedStepException - code its in feature file but it is not implement
//DuplicateStepDefinitionException - already code implemented in another class

