package Steps;

import Base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by imranhossan on 11/1/17.
 */
public class Hooks extends BaseUtil {

    private BaseUtil base;

    public Hooks(BaseUtil base) {

        this.base = base;
    }

    @Before
    public void initializeTest() {
        System.out.println("Lunching firefox browser ");
        System.setProperty("webdriver.gecko.driver", "/Users/imranhossan/AllProjects/GeckoDriver/geckodriver");

        base.driver = new FirefoxDriver();
    }

    @After
    public void teardownTest() {
        System.out.println("Closing browser");
        base.driver.quit();
    }
}
