package nebula.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    //constructor
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //Locators
    //send and get data
    private final By sendAndGetDataLocator = By.id("link-1");
    private final By sendAndGetDataTextLocator = By.id("send-title"); //still not used
    private final By nameLocator =  By.id("name");
    private final By emailLocator = By.id("email");
    private final By submitBtnLocator = By.id("btn-submit-echo");
    //chexbox
    private final By checkBoxesAndRadioLocator = By.id("link-3");
    private final By checkBoxesAndRadioTextLocator = By.id("checks-title");
    private final By javaCheckBoxLocator = By.id("chk-java");
    private final By seleniumCheckBoxLocator = By.id("chk-selenium");
    private final By apiCheckBoxLocator = By.id("chk-api");
    //Radio
    private final By juniorRadioLocator = By.id("rdo-junior");
    private final By midRadiolocator = By.id("rdo-mid");
    private final By seniorRadioLocator = By.id("rdo-senior");
    //Drop Down
    private final By dropDownLocator = By.id("link-9");
    private final By dropDownTextLocator = By.id("ddown-title");
    //Single Select
    private final By singleSelectLocator = By.id("single-select");
    //Multi Select
    private final By multiSelectLocator = By.id("multi-select");
    //Dependent Select
    private final By countryLocator = By.id("country");
    private final By cityLocator = By.id("city");
    //send and get data
    public void clickOnSendAndGetDataBtn(){
        actions.clickOnButton(sendAndGetDataLocator);
    }
    public void enterName(String name){
        actions.enterTextToField(nameLocator , name);
    }
    public void enterEmail(String email){
       actions.enterTextToField(this.emailLocator , email);
    }
    public void clickOnSubmitBtn(){
        actions.clickOnButton(this.submitBtnLocator);
    }
    //Check Box
    public void clickOnCheckBoxAndRadioBtn(){
        actions.clickOnButton(this.checkBoxesAndRadioLocator);
    }
    public void checkOnCheckBox(){
        actions.clickOnButton(this.javaCheckBoxLocator);
        actions.clickOnButton(this.seleniumCheckBoxLocator);
    }
    //Radio
    public void checkRadioBtn(){
        actions.clickOnButton(this.midRadiolocator);
    }
    //Drop Down
    public void clickOnDropDownBtn(){
        this.actions.clickOnButton(this.dropDownLocator);
    }
    //single select
    public void singleSelectWithValue(String value){
        this.actions.singleSelectUsingValue(this.singleSelectLocator , value);
    }
    //multi select
    public void multiSelectWithValue(String[] values){
        this.actions.multiSelectUsingValue(this.multiSelectLocator , values);
    }
    //Dependent Select
    public void dependentSelectCountryWithValue(String value){
        this.actions.singleSelectUsingValue(this.countryLocator , value);
    }
    public void dependentSelectCityWithValue(String value){
        this.actions.singleSelectUsingValue(this.cityLocator , value);
    }
}
