import core.TestBaseSelenium;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SeleniumHomePage;
import pages.SeleniumLoginPage;

import static helpers.Helpers.makeSeleniumScreenshot;


public class SeleniumRMSysLoginTest extends TestBaseSelenium {
    public static final String USER_NAME = "EugenBorisik";
    public static final String PASSWORD = "qwerty12345";


    @Test
    public void login() {
        makeSeleniumScreenshot("Selenium screenshot");
        SeleniumLoginPage.loginToRmsys(USER_NAME, PASSWORD);
        SeleniumHomePage seleniumHomePage = new SeleniumHomePage();
        Assert.assertTrue(seleniumHomePage.isUserPictureDisplayed(), "The Welcome message is not displayed");
    }
}
