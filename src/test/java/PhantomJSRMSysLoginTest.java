import core.TestBasePhantomJS;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PhantomJSHomePage;
import pages.PhantomJSLoginPage;

import static helpers.Helpers.makeScreenshotPhantomJS;

public class PhantomJSRMSysLoginTest extends TestBasePhantomJS {

    public static final String USER_NAME = "EugenBorisik";
    public static final String PASSWORD = "qwerty12345";
    private static final String BASE_URL = "https://192.168.100.26/";


    @Test
    public void login() {
        driverForPhantomJS.get(BASE_URL);
        makeScreenshotPhantomJS("PhantomJS screenshot");
        PhantomJSLoginPage.loginToRmsys(USER_NAME, PASSWORD);
        PhantomJSHomePage phantomJSHomePage = new PhantomJSHomePage();
        Assert.assertTrue(phantomJSHomePage.isUserPictureDisplayed(), "The user picture is not displayed");
    }
}
