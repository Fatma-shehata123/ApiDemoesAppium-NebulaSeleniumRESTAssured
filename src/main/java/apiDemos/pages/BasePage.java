package apiDemos.pages;

import utils.apiDemos.actions.Actions;
import io.appium.java_client.android.AndroidDriver;

public class BasePage {
    AndroidDriver driver;
    Actions actions;

    public BasePage(AndroidDriver driver){
        this.driver = driver;
        this.actions = new Actions(driver);
    }
}
