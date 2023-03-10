package DriverConfig;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverConfig {
    public static WebDriver driver;


    public static WebDriver createDriver(Browsers browsers){
        switch (browsers){
            case –°HROMELOCAL: createChromeLocal();
            case CHROMEWEBMANAGER: createChromeWebManager();
        }
        return driver;
    }



    public static void createChromeLocal() {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
        if (driver == null){
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            driver = new ChromeDriver(chromeOptions);
        }
        driver.manage().window().maximize();
    }

    public static void createChromeWebManager() {
        if(driver == null){
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(chromeOptions);
        }
       driver.manage().window().maximize();
    }

}
