import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utils.ConfigManager;

import static java.time.temporal.ChronoUnit.SECONDS;

public class BaseTest {

    private final AppiumDriverLocalService appiumServer;
    protected AndroidDriver driver;
    protected WebDriverWait wait;

    //constructor
    public BaseTest(){
        ConfigManager.initialize();
        this.appiumServer = new AppiumServiceBuilder()
                .withAppiumJS(new File(ConfigManager.getProperty("main.js.path")))
                .withIPAddress(ConfigManager.getProperty("ip.address")).usingPort(Integer.parseInt(ConfigManager.getProperty("port.number"))).build();
    }

    // open the appium server
    @BeforeClass
    public void starAppiumServer(){
        appiumServer.start();
    }

    //initate driver
    public void initDriver() throws MalformedURLException, URISyntaxException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName(ConfigManager.getProperty("device.name"));
       options.setApp(ConfigManager.getProperty("set.app"));

       driver = new AndroidDriver(new URI(ConfigManager.getProperty("appium.url")).toURL() , options);
    }

    // start driver
    @BeforeMethod
    public void startDriver()  throws MalformedURLException, URISyntaxException  {
        initDriver();
        this.wait = new WebDriverWait(driver , Duration.of(3, SECONDS));
    }

    //close driver
    @AfterMethod
    public  void stopDriver(){
        driver.quit();
    }

    //close appium server
    @AfterClass
    public void  stopAppiumServer(){
        appiumServer.stop();
    }
}
