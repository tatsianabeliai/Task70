package helpers;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static core.TestBasePhantomJS.driverForPhantomJS;
import static helpers.DriverSingleton.getDriver;

public class Helpers {
    public static void makeSeleniumScreenshot(String name) {

        File screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("target\\screens\\" + name + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void makeScreenshotPhantomJS(String name) {

        File scrFile = ((TakesScreenshot) driverForPhantomJS).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File("target\\screens\\" + name + ".jpg"), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

