package FristProject.Pages;

import FristProject.utils.Actoins;
import io.appium.java_client.android.AndroidDriver;

public class BasePage {
    AndroidDriver driver;
    Actoins actoins;

    public BasePage(AndroidDriver driver){
        this.driver = driver;
        this.actoins = new Actoins(driver);
    }
}
