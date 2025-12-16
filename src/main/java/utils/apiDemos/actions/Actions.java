package utils.apiDemos.actions;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.time.temporal.ChronoUnit.SECONDS;

public class Actions {
    private final AndroidDriver driver;
    private final WebDriverWait wait;
    //constructor
    public Actions(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver , Duration.ofSeconds(20));
    }
    public void clickOnElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void sendTextToElement(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }

    public  void scroll(String directionOfScroll) {
        boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver)
                .executeScript("mobile: scrollGesture",
                        ImmutableMap.of(
                                "left", 300,
                                "top", 300,
                                "width", 300,
                                "height", 300,
                                "direction", directionOfScroll,
                                "percent", 0.78));
    }

}