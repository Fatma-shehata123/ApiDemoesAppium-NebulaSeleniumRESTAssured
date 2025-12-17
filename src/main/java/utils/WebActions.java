package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class WebActions {
    private final WebDriver driver;

    //constructor
    public WebActions(WebDriver driver) {
        this.driver = driver;
    }

    public void enterTextToField(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }

    public void clickOnButton(By locator) {
        driver.findElement(locator).click();
    }

    public void singleSelectUsingValue(By locator, String valueOfSingleSelect) {
        Select select = new Select(driver.findElement(locator));
        select.selectByValue(valueOfSingleSelect);
    }

    public void singleSelectUsingIndex(By locator, Integer indexOfSingleSelect) {
        Select select = new Select(driver.findElement(locator));
        select.selectByIndex(indexOfSingleSelect);
    }

    public void multiSelectUsingValue(By locator, String[] valuesOfMultiSelect) {
        Select select = new Select(driver.findElement(locator));
        if (select.isMultiple()) {
            for (String value : valuesOfMultiSelect) {
                select.selectByValue(value);
            }
        }
    }
}
