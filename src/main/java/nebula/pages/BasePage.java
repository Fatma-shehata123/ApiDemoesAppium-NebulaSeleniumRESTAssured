package nebula.pages;

import org.openqa.selenium.WebDriver;
import utils.nebula.actions.Actions;

public class BasePage {
    WebDriver driver;
    Actions actions;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
    }
}
