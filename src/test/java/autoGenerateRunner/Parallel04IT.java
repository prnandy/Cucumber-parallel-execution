import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"D:/git/Cucumber-parallel-execution/src/test/resources/features/NegativeNumber.feature"},
        plugin = {"json:D:/git/Cucumber-parallel-execution/target/cucumber-parallel/json/4.json"},
        monochrome = true,
        tags = {"@MultiplyNumbers,@AddNumbers,@negativeNumbers,@PositiveNumbers,@subtractNumbers,@divideNumbers"},
        glue = {"stepDefinition"})
public class Parallel04IT {
}
