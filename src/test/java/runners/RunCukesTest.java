package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//instructs junit to run this class as aCucumber test runner
@CucumberOptions(
        dryRun = false,//executes the features and suggests undefined stepdefs skeleton code without failing
        features = "classpath:features",//location of the features file folder
        glue = {"stepDefs"},
        tags = "@login or @doublequoteparams",
        plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json"}//gives us a report under target file

)
public class RunCukesTest {

}
