package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//We need run with options to run with junit
@RunWith(Cucumber.class)
//cucumber options decide what to execute, where to execute
@CucumberOptions(
        //features we use to provide the path of the feature file
        features = "src/test/resources/Features",
        //glue below will link the above to the below
        glue = "steps",
        // dry run stops the actual execution when its TRUE - you have to change to FALSE then run the execution
        dryRun = false,
        //will only execute if both of the sprints exist or nothing!!
        //tags="@sprint1 and @sprint4"
        // will execute corresponding tests of which exist!!
        //tags="@sprint1 or @sprint4"
        tags ="@sprint1 or @sprint2",
        //shows the results in better format and easier to understand the passed or failed tests!

        plugin = {"pretty"}


)

public class RunnerClass {

}
