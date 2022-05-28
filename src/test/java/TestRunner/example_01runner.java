package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\guest101\\eclipse-workspace\\CucumberJ\\Features\\example.feature", 
glue= {"Cucutest"},
plugin= {"pretty","html:target/report.html"})
public class example_01runner {

}
