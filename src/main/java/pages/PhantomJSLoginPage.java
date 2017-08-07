package pages;

import static core.TestBasePhantomJS.driverForPhantomJS;
import static helpers.StaticConstants.*;

public class PhantomJSLoginPage {

    public static void loginToRmsys(String username, String password) {
        driverForPhantomJS.findElement(USERNAME).sendKeys(username);
        driverForPhantomJS.findElement(PASSWORD).sendKeys(password);
        driverForPhantomJS.findElement(LOGIN_BUTTON).click();
    }
}
