package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ADMIN\\eclipse-workspace\\Cucumber_New\\src\\test\\resources\\First\\firstcucumber.feature", 
glue= "Runner", monochrome= true , strict=true , plugin= {"html:target/cucumber.html", "json:target/cucumber.json"})

public class TestRunner {

}
