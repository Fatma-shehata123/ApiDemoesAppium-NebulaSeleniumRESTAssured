package apiDemos.pages;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumBy;

public class ApiDemos extends BasePage {
    private final By apiDemos = AppiumBy.xpath("(//android.widget.TextView[@resource-id=\"com.huawei.android.launcher:id/drawer_icon\"])[8]");
    private final By appBtn = AppiumBy.accessibilityId("App");
    private final By viewsBtn = AppiumBy.accessibilityId("Views");
    private final By preferencesBtn = AppiumBy.accessibilityId("Preference");
    // child constructor
    public ApiDemos(AndroidDriver driver) {
        super(driver);
    }

    public void  clickOnApiDemos() {
        actions.clickOnElement(apiDemos);
    }
    public void clickOnAppBtn() {
        actions.clickOnElement(appBtn);
    }
    public void  clickOnViewsBtn() {
        actions.clickOnElement(viewsBtn);
    }
    public void  clickOnPreferencesBtn() {
        actions.clickOnElement(preferencesBtn);
    }


}
