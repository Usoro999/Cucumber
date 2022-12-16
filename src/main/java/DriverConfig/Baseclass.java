package DriverConfig;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass {
    protected static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        driver = DriverConfig.createDriver(Browsers.CHROMEWEBMANAGER);
    }

    @AfterClass
    public static void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }
}
