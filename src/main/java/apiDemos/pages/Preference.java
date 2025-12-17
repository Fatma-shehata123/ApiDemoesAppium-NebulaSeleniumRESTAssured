package apiDemos.pages;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumBy;

public class Preference extends BasePage{
    private final By prefreneceDependenciesBtn = AppiumBy.accessibilityId("3. Preference dependencies");
    private final By wifiCheckBox = AppiumBy.id("android:id/checkbox");
    private final By wifiSettingsBtn = AppiumBy.xpath("//android.widget.ListView[@resource-id=\"android:id/list\"]/android.widget.LinearLayout[2]/android.widget.RelativeLayout");
    private final By getWifiSettingsField = AppiumBy.id("android:id/edit");
    private final By okBtn = AppiumBy.id("android:id/button1");
    //child constructor
    public Preference(AndroidDriver driver) {
        super(driver);
    }
    public void  clickOnPrefreneceDependenciesBtn() {
        androidActions.clickOnElement(prefreneceDependenciesBtn);
    }
    public void  clickOnWifiCheckBox() {
        androidActions.clickOnElement(wifiCheckBox);
    }
    public void  clickOnWifiSettingsBtn() {
        androidActions.clickOnElement(wifiSettingsBtn);
    }
    public void enterTextToWifiSettings(String text) {
        androidActions.sendTextToElement(getWifiSettingsField, text);
    }
    public void  clickOnOkBtn() {
        androidActions.clickOnElement(okBtn);
    }


}
