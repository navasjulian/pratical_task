package refactor.webdriver;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

/*
 * Factory to instantiate a WebDriver object. It returns an instance of the driver
 * 
 */
public class WebDriverFactory {

    /* Browsers constants */
    private static final String CHROME = "chrome";
    private static final String FIREFOX = "firefox";
    private static final String OPERA = "opera";
    private static final String INTERNET_EXPLORER = "ie";
    private static final String SAFARI = "safari";
    private static final String EDGE = "edge";
    private static final String HTML_UNIT = "htmlunit";
    private static final String IPHONE = "iphone";

    /* Platform constants */
    private static final String WINDOWS = "windows";
    private static final String WIN10 = "win10";
    private static final String WIN7 = "win7";
    private static final String ANDROID = "android";
    private static final String XP = "xp";
    private static final String VISTA = "vista";
    private static final String MAC = "mac";
    private static final String LINUX = "linux";

    private WebDriverFactory() {
    }

    private static DesiredCapabilities setVersionAndPlatform(DesiredCapabilities capability, String version, String platform) {
        if (MAC.equalsIgnoreCase(platform)) {
            capability.setPlatform(Platform.MAC);
        } else if (LINUX.equalsIgnoreCase(platform)) {
            capability.setPlatform(Platform.LINUX);
        } else if (XP.equalsIgnoreCase(platform)) {
            capability.setPlatform(Platform.XP);
        } else if (VISTA.equalsIgnoreCase(platform)) {
            capability.setPlatform(Platform.VISTA);
        } else if (WINDOWS.equalsIgnoreCase(platform)) {
            capability.setPlatform(Platform.WINDOWS);
        } else if (WIN10.equalsIgnoreCase(platform)) {
            capability.setPlatform(Platform.WIN10);
        } else if (WIN7.equalsIgnoreCase(platform)) {
            capability.setPlatform(Platform.VISTA);
        } else if (ANDROID.equalsIgnoreCase(platform)) {
            capability.setPlatform(Platform.ANDROID);
        } else {
            capability.setPlatform(Platform.ANY);
        }

        if (version != null) {
            capability.setVersion(version);
        }
        return capability;
    }
}
