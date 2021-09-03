package pages;

import base.TestBase;
import common.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class GoogleSearchPage extends TestBase {

    @FindBy(xpath = "//img[@src='/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png']")
    private  WebElement imgGoogle;

    @FindBy(css=".gLFyf.gsfi")
    private WebElement txtBxSearchBox;

    @FindBy(css=".Wkr6U.z4P7Tc")
    private WebElement txtSearchResult;

    public GoogleSearchPage() {
        PageFactory.initElements(driver, this);
    }

    public String googleSearch() throws InterruptedException{
        Thread.sleep(3000);
        Utility.waitUntilElementIsVisible(imgGoogle);
        Utility.enterText(txtBxSearchBox, "automation testing");
        txtBxSearchBox.sendKeys(Keys.ENTER);
        return txtSearchResult.getText();
    }
}
