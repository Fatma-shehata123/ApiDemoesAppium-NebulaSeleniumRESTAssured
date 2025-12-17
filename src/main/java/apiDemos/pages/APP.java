package apiDemos.pages;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumBy;

public class APP extends BasePage{
    private final By searchBtn = AppiumBy.accessibilityId("Search");
    private final By invokeSearchBtn = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Invoke Search\"]");
    private final By prefillQueryField = AppiumBy.id("io.appium.android.apis:id/txt_query_prefill");
    private final By appDataField = AppiumBy.id("io.appium.android.apis:id/txt_query_appdata");
    private final By onSearchRequestedBtn = AppiumBy.id("io.appium.android.apis:id/btn_start_search");

    public APP(AndroidDriver driver) {
        super(driver);
    }

    public void  clickOnSearchBtn() {
        androidActions.clickOnElement(searchBtn);
    }
    public void  clickOnInvokeSearchBtn() {
        androidActions.clickOnElement(invokeSearchBtn);
    }
    public void enterTextToPrefillQueryField(String text) {
        androidActions.sendTextToElement(prefillQueryField, text);
    }
    public void enterTextToAppDataField(String text) {
        androidActions.sendTextToElement(appDataField, text);
    }
    public void  clickOnSearchRequestedBtn() {
        androidActions.clickOnElement(onSearchRequestedBtn);
    }


}
