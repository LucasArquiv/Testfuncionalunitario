package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/report-html", "json:target/report-json"},
        glue = {"Steps"},
        tags = {"@unitários"},
        monochrome = false,
        features = {"src/test/resources/features/"},
        dryRun = false, // o padrão desse método é false
        strict = false, // o padrão dele é false
        snippets = SnippetType.CAMELCASE
)
public class RunnerTest {

}
