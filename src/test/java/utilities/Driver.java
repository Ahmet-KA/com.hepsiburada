package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepdefinitions.HepsiburadaStepDefinitions;


import java.time.Duration;

public class Driver {

    static WebDriver driver;
   // static String browser;

    public static WebDriver getDriver() {


        if (driver == null) {

            switch (HepsiburadaStepDefinitions.browser) {

                case "chrome":
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--disable-blink-features");
                    chromeOptions.addArguments("--disable-blink-features=AutomationControlled");
                    chromeOptions.addArguments("--disable-extensions");
                    driver = new ChromeDriver(chromeOptions=chromeOptions);
                    break;

                case "firefox":
                    /*System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    firefoxOptions.addPreference("gfx.direct2d.disabled", false);*/
                    driver = new FirefoxDriver();
                    break;
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
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
