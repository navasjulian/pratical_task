package example.pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;

import example.util.PropertyLoader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.WebDriverRunner.*;

/**
 * Base class for all the test classes
 *
 */
public class TestBase {

    private static final String FOLDER = "target/reports/";
    protected String username;
    protected String websiteUrl;
    protected String password;
    private static final long TIMEOUT = 15000;

    private String browser = System.getProperty("browser", CHROME);

    @BeforeClass
    public void init() {
        websiteUrl = System.getProperty("site.url");
        username = PropertyLoader.loadProperty("user.username");
        password = PropertyLoader.loadProperty("user.password");


        /*System.setProperty("webdriver.chrome.driver", this.getClass().getResource("/drivers/chrome/chromedriver").getPath());
        System.setProperty("selenide.browser", "Chrome");*/

        switch (browser) {
            case WebDriverRunner.CHROME:
                WebDriverManager.chromedriver().setup();
                //ChromeDriverManager.getInstance().version("2.40").setup();
                break;
            case WebDriverRunner.FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                //FirefoxDriverManager.getInstance().setup();
                break;
            case WebDriverRunner.OPERA:
                WebDriverManager.operadriver().setup();
                //OperaDriverManager.getInstance().setup();
                break;
            case WebDriverRunner.EDGE:
                WebDriverManager.edgedriver().setup();
                //EdgeDriverManager.getInstance().setup();
                break;
            case WebDriverRunner.INTERNET_EXPLORER:
                WebDriverManager.iedriver().setup();
                //InternetExplorerDriverManager.getInstance().setup();
                break;
            case WebDriverRunner.PHANTOMJS:
                WebDriverManager.phantomjs().setup();
                //PhantomJsDriverManager.getInstance().setup();
                break;
        }

        Configuration.browser = browser;
        Configuration.reportsFolder = FOLDER;
        Configuration.timeout = TIMEOUT;
        Configuration.browserSize = "1920x1080";
    }
}
