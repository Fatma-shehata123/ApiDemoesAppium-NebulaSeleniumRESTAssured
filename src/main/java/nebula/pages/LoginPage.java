package nebula.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
//    private final By nebulaTextLocator = By.xpath("//*[text()="Nebula TestLab"]");
    private final By userNameFieldLocator = By.id("username-input");
    private final By passwordFieldLocator = By.id("password-input");
    private final By loginBtnLocator = By.id("btn-login");

    // Child Constructor
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterUserName(String userName) {
        actions.enterTextToField(userNameFieldLocator , userName);
    }
    public void enterPassword(String password) {
        actions.enterTextToField(passwordFieldLocator , password);
    }
    public void clickOnLoginBtn(){
        actions.clickOnButton(loginBtnLocator);
    }
}
