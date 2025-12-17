package nebula.pages;

import org.openqa.selenium.WebDriver;
import utils.WebActions;

public class BasePage {
    WebDriver driver;
    WebActions webActions;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.webActions = new WebActions(driver);
    }
}
