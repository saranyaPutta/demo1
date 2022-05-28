package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\guest101\\eclipse-workspace\\CucumberJ\\Features", 
glue= {"Cucutest"},
plugin= {"pretty","html:target/report.html"})
 //{"pretty","json:target/report/cucumber.json"},{"pretty","junit:target/report.junit"})

public class test1_runner {
	
	
	

}
