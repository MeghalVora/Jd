package utils;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:/Users/Meghal/Documents/ST/src/test/resources/search.feature",glue = {"stepDefs"})

public class RunCukesTest {
}
