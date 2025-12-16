package nebulaTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.reader.ConfigManager;

import java.time.Duration;

public class BaseTest {
    public BaseTest() {
        ConfigManager.initialize();
    }
    protected WebDriver driver;
    protected WebDriverWait wait;
    @BeforeMethod
    public void startDriver() {
        this.driver = new ChromeDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.get(ConfigManager.getProperty("nebula.url"));
    }
    @AfterMethod
    public  void stopDriver(){
        driver.quit();
    }
}
