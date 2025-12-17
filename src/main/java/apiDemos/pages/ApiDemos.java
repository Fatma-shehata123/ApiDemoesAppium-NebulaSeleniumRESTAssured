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
        androidActions.clickOnElement(apiDemos);
    }
    public void clickOnAppBtn() {
        androidActions.clickOnElement(appBtn);
    }
    public void  clickOnViewsBtn() {
        androidActions.clickOnElement(viewsBtn);
    }
    public void  clickOnPreferencesBtn() {
        androidActions.clickOnElement(preferencesBtn);
    }


}
