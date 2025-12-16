package nebulaTest;

import nebula.pages.HomePage;
import nebula.pages.LoginPage;
import nebulaTestData.LoginTestData;
import nebulaTestData.SendDataTestData;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.reader.ConfigManager;
import utils.reader.JsonUtils;

import java.time.Duration;

public class E2ETest extends  BaseTest{
    private LoginTestData loginTestData;
    private SendDataTestData sendDataTestData;
    //constructor
    public E2ETest(){
        this.loginTestData = JsonUtils.getTestData(ConfigManager.getProperty("login.testdata"), LoginTestData.class );
        this.sendDataTestData = JsonUtils.getTestData(ConfigManager.getProperty("send.testdata"), SendDataTestData.class );
    }

    @Test
    public void E2ETestCase(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        //login page
        loginPage.enterUserName(loginTestData.username());
        loginPage.enterPassword(loginTestData.password());
        loginPage.clickOnLoginBtn();
        //Home Page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Send and Get Data
        homePage.clickOnSendAndGetDataBtn();
        homePage.enterName(sendDataTestData.name());
        homePage.enterEmail(sendDataTestData.email());
        homePage.clickOnSubmitBtn();
        //check box
        homePage.clickOnCheckBoxAndRadioBtn();
        homePage.checkOnCheckBox();
        //radio
        homePage.checkRadioBtn();
        //single select
        homePage.clickOnDropDownBtn();
        homePage.singleSelectWithValue("firefox");
        // multi select
        homePage.multiSelectWithValue(new String[]{"api", "ui"});
        //Dependent Select
        homePage.dependentSelectCountryWithValue("eg");
        homePage.dependentSelectCityWithValue("Cairo");
    }
}
