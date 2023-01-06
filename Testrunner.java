package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
				plugin = {"testng", "html:target/juiceshop.html"}, //reporting purpose
				monochrome=true,  //console output color
				tags = "@tag or @tag1", //tags from feature file
				features = "C://MonikaTest//Selenium Learning//Assignments//src//test//resources//features//juiceshop.feature",
				glue="Stepdefination")

public class Testrunner {

}
