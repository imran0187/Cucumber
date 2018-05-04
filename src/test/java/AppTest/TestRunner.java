package AppTest;

/**
 * Created by imranhossan on 4/1/18.
 */


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Cucumber test bootstrap class
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features= "src/test/java/Features",
        glue="Steps",
        plugin= {"pretty","json:target/cucumber.json","html:target/Reports"},
        tags= {"@Sanity"}
)
public class TestRunner
{
}
