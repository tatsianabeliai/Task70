package helpers;

import org.openqa.selenium.By;

public class StaticConstants {
    public static final By USERNAME = By.cssSelector("input#Username");
    public static final By PASSWORD = By.cssSelector("#Password");
    public static final By LOGIN_BUTTON = By.xpath(".//button");
    public static final By USER_PICTURE = By.cssSelector("#photo>img");
}
