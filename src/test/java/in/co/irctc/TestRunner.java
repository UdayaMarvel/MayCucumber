package in.co.irctc;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features=".\\src\\test\\resources\\IRCTC.feature",
				glue="in.co.irctc",
				tags= {"@smoke","@sanity"},
				plugin = {"html:target","json:target/report.json"},
				dryRun = false,
				monochrome = true
				)
public class TestRunner {

	//utility file
	//1. project jar file
	//2. .bat file
}
