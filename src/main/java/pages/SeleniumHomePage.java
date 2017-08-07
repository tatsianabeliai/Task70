package pages;

import static helpers.DriverSingleton.getDriver;
import static helpers.StaticConstants.USER_PICTURE;

public class SeleniumHomePage {

    public static boolean isUserPictureDisplayed() {
        return getDriver().findElement(USER_PICTURE).isDisplayed();
    }
}


