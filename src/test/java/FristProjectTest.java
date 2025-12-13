import FristProject.Pages.*;
import FristProject.Pages.APP;
import org.testng.annotations.Test;
import testData.SearchTestData;
import testData.WifiTestData;
import utils.ConfigManager;
import utils.JsonUtils;

public class FristProjectTest extends BaseTest{
    private WifiTestData wifiTestData;
    private SearchTestData searchTestData;
    public FristProjectTest() {
        this.wifiTestData = JsonUtils.getTestData(ConfigManager.getProperty("wifi.testdata"), WifiTestData.class );
        this.searchTestData = JsonUtils.getTestData(ConfigManager.getProperty("search.testdata"), SearchTestData.class);
    }
    @Test
    public void searchTest(){
        ApiDemos apiDemos = new ApiDemos(driver);
        APP app = new APP(driver);
        Views views = new Views(driver);
        //home page
        apiDemos.clickOnAppBtn();
        //App
        app.clickOnSearchBtn();
        app.clickOnInvokeSearchBtn();
        app.enterTextToPrefillQueryField(searchTestData.prefillQuery());
        app.enterTextToAppDataField(searchTestData.appData());
        app.clickOnSearchRequestedBtn();
    }
    @Test
    public void scrollTest(){
        ApiDemos apiDemos = new ApiDemos(driver);
        Views views = new Views(driver);
        //home page
        apiDemos.clickOnViewsBtn();
        //Views
        views.scrollDown("down");
    }
    @Test
    public void wifiTest(){
        ApiDemos apiDemos = new ApiDemos(driver);
        Preference preference = new Preference(driver);
        //home page
        apiDemos.clickOnPreferencesBtn();
        //preference
        preference.clickOnPrefreneceDependenciesBtn();
        preference.clickOnWifiCheckBox();
        preference.clickOnWifiSettingsBtn();
        preference.enterTextToWifiSettings(wifiTestData.wifiName());
        preference.clickOnOkBtn();
    }
}
