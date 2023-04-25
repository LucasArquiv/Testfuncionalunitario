package Support;

import Runner.RunnerTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Calendar;
import java.util.Date;



public class Utils extends RunnerTest {

    public static Date obterDataDiferencaDias(int dias) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, dias);
        return cal.getTime();
    }

}
