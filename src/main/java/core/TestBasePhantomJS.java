package core;

import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBasePhantomJS {
    private static final String BASE_URL = "https://192.168.100.26/";
    private static final int DEFAULT_TIMEOUT = 10;
    private static final String PHANTOM_JS_PATH = "src/main/resources/phantomjs-2.1.1-windows/bin/phantomjs.exe";
    public static PhantomJSDriver driverForPhantomJS;

    @BeforeMethod
    public void openBrowser() {
        DesiredCapabilities caps = new DesiredCapabilities();
        driverForPhantomJS = createPhantomDriver(caps);
        driverForPhantomJS.get(BASE_URL);
        driverForPhantomJS.manage().timeouts().implicitlyWait(DEFAULT_TIMEOUT, TimeUnit.SECONDS);
        driverForPhantomJS.manage().window().maximize();
    }

    @AfterMethod
    public void quit() {
        driverForPhantomJS.quit();
    }


    public PhantomJSDriver createPhantomDriver(DesiredCapabilities dcaps) {
        dcaps.setCapability(
                PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
                PHANTOM_JS_PATH);
        dcaps.setCapability("takesScreenshot", true);
        String[] phantomJsArgs = {"--ignore-ssl-errors=true"};
        dcaps.setCapability(
                PhantomJSDriverService.PHANTOMJS_GHOSTDRIVER_CLI_ARGS,
                phantomJsArgs);
        return new PhantomJSDriver(dcaps);
    }
}
