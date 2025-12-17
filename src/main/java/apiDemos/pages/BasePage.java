package apiDemos.pages;

import utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;

public class BasePage {
    AndroidDriver driver;
    AndroidActions androidActions;

    public BasePage(AndroidDriver driver){
        this.driver = driver;
        this.androidActions = new AndroidActions(driver);
    }
}
