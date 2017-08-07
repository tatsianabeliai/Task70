package pages;

import static core.TestBasePhantomJS.driverForPhantomJS;
import static helpers.StaticConstants.USER_PICTURE;

public class PhantomJSHomePage {

    public static boolean isUserPictureDisplayed() {
        return driverForPhantomJS.findElement(USER_PICTURE).isDisplayed();
    }
}
