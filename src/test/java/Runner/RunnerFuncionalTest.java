package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/report-html", "json:target/report-json"},
        glue = {"Steps"},
        tags = {"@Funcionais"},
        monochrome = false,
        features = {"src/test/resources/features/"},
        dryRun = false, // o padrão desse método é false
        strict = false, // o padrão dele é false
        snippets = SnippetType.CAMELCASE
)
public class RunnerFuncionalTest {

    @BeforeClass
    public static void reset(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://seubarriga.wcaquino.me/login");
        driver.findElement(By.id("email")).sendKeys("Contateste@gmail.com");
        driver.findElement(By.name("senha")).sendKeys("senha");
        driver.findElement(By.tagName("button")).click();
        driver.findElement(By.linkText("reset")).click();
        driver.quit();
    }
}
