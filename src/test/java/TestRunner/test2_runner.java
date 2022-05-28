package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\guest101\\eclipse-workspace\\CucumberJ\\Features\\tag.feature",
    glue = {"Cucutest" },  
    tags = "@Smoketest ",
    plugin = { "pretty", "html:target/report.html" })
//we can use And and or functions in the tags combination
// {"pretty","json:target/report/cucumber.json"},{"pretty","junit:target/report.junit"})

public class test2_runner {

}
