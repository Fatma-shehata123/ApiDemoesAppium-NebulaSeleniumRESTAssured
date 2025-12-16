package apiDemos.pages;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumBy;

public class Views extends BasePage{
    private final By scrollLocator = AppiumBy.accessibilityId("Popup Menu");

    //child constructor
    public Views(AndroidDriver driver) {
        super(driver);
    }

    public void scrollDown(String upOrDown) {
        actions.scroll(upOrDown);
    }


}
