package pages;

import static helpers.DriverSingleton.getDriver;
import static helpers.StaticConstants.*;

public class SeleniumLoginPage {

    public static void loginToRmsys(String username, String password) {
        getDriver().findElement(USERNAME).sendKeys(username);
        getDriver().findElement(PASSWORD).sendKeys(password);
        getDriver().findElement(LOGIN_BUTTON).click();
    }
}


