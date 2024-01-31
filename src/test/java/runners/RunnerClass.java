package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//We need run with options to run with junit
@RunWith(Cucumber.class)
//cucumber options decide what to execute, where to execute
@CucumberOptions(
        //features we use to provide the path of the feature file
        features = "src/test/resources/Features/Login.feature",
        //glue below will link the above to the below
        glue = "steps"


)

public class RunnerClass {

}
