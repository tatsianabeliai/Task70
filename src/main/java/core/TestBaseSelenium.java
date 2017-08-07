package core;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import static helpers.DriverSingleton.getDriver;
import static helpers.DriverSingleton.initDriver;

public class TestBaseSelenium {
    private static final String BASE_URL = "https://192.168.100.26/";
    private static final int DEFAULT_TIMEOUT = 10;

    @BeforeMethod
    public static void setUp() {
        getDriver().get(BASE_URL);
    }

    @BeforeSuite
    public void init() {
        initDriver("chrome");
        getDriver().manage().timeouts().pageLoadTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS);
        getDriver().manage().timeouts().implicitlyWait(DEFAULT_TIMEOUT, TimeUnit.SECONDS);
        getDriver().get(BASE_URL);
        getDriver().manage().window().maximize();
    }

    @AfterSuite
    public void quit() {
        getDriver().quit();
    }
}
