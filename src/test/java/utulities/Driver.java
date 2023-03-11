package utulities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
    //Daha fazla kontrol imkani ve extends kullanmadan driver' ulasmak icin
    //webdriver objesini Driver class'indaki static bir method ile olusturacagiz

    public static WebDriver driver;

    public static WebDriver getDriver() {

        WebDriverManager.chromedriver().setup();

        if (driver == null) {
            driver = new ChromeDriver();

        }
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        return driver;

    }

    public static void closeDriver() {
        if (driver != null) {
            driver.close();
            driver = null;
        }


    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }

    }
}
