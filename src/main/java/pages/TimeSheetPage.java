package pages;

import base.TestBase;
import common.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TimeSheetPage extends TestBase {
//    Utility util = new Utility();

    @FindBy(xpath = "//span[text()='TimeSheet Entries']")
    WebElement timeEntriesLink;

    @FindBy(id = "Ribbon.ContextualTabs.Timesheet.Home-title")
    WebElement timeSheetMenu;

    @FindBy(id = "Ribbon.ContextualTabs.Timesheet.Home.Tasks.AddLine-Large")
    WebElement timeSheetMenu_addRow;

    @FindBy(xpath = "//span[text()='Select From Existing Assignments']/following-sibling::span")
    WebElement timeSheetMenu_addRow_selectExistingTask;

    @FindBy(xpath = "//iframe[@class='ms-dlgFrame']")
    WebElement frame_addExistingTask;

    @FindBy(xpath = "(//span[@class='ms-commentexpand-iconouter'])[1]")
    WebElement frame_addExistingTask_downArrow;

    @FindBy(xpath = "//span[contains(text(),'QA tasks')]/preceding-sibling::input")
    WebElement frame_addExistingTask_taskName;

    @FindBy(id = "ctl00_ctl00_PlaceHolderMain_PWA_PlaceHolderMain_idComment")
    WebElement frame_addExistingTask_comment;

    @FindBy(id = "ctl00_ctl00_PlaceHolderMain_idOkButton")
    WebElement frame_addExistingTask_okButton;

    @FindBy(xpath = "(//span[text()='Actual'])[1]/parent::td/following-sibling::td")
    WebElement myTimeSheet_rowCell;

    @FindBy(xpath = "(//table[contains(@id,'rightpane_mainTable')]//tr)[2]/td")
    WebElement myTimeSheet_rowTextBox;

    @FindBy(id = "jsgrid_editbox")
    WebElement myTimeSheet_rowEdit;

    @FindBy(id = "Ribbon.ContextualTabs.Timesheet.Home.Sheet.SubmitMenu-Large")
    WebElement timeSheetMenu_SendLink;

    @FindBy(id = "Ribbon.ContextualTabs.Timesheet.Home.Sheet.SubmitTimesheet-Menu32")
    WebElement timeSheetMenu_SendLink_finalTimesheet;

    @FindBy(xpath = "//iframe[@class='ms-dlgFrame']")
    WebElement frame_sendTimeSheet;

    @FindBy(xpath = "//input[@value='OK']")
    WebElement frame_sendTimeSheet_okButton;

    @FindBy(xpath = "//div[@id='pageStatusBar']/span/span[3]")
    WebElement timesheetStatus;

//    WebDriver driver;
    public TimeSheetPage() {
//        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public boolean iVerifyThatTimeSheetFilledSuccessMessageDisplayed(String date) throws InterruptedException{
        Thread.sleep(3000);
//        Utility.waitUntilElementIsVisible(timeEntriesLink);
//        timeEntriesLink.click();
        Utility.clickElement(timeEntriesLink);
        WebElement dateToClick = driver.findElement(By.xpath("//a[contains(text(),'"+date+"')]/parent::td/preceding-sibling::td/a"));
        Utility.clickElement(dateToClick);
        Utility.clickElement(timeSheetMenu);
        Utility.clickElement(timeSheetMenu_addRow);
        Utility.clickElement(timeSheetMenu_addRow_selectExistingTask);
        Utility.switchToFrame(frame_addExistingTask);
        Utility.clickElement(frame_addExistingTask_downArrow);
        Utility.clickElement(frame_addExistingTask_downArrow);
        Utility.clickElement(frame_addExistingTask_taskName);
        Utility.enterText(frame_addExistingTask_comment,"Testing");
        Utility.clickElement(frame_addExistingTask_okButton);
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        Utility.clickElement(myTimeSheet_rowCell);
        Utility.clickElement(myTimeSheet_rowTextBox);
        Utility.enterText(myTimeSheet_rowEdit,"8h");
        Utility.clickElement(timeSheetMenu_SendLink);
        Utility.clickElement(timeSheetMenu_SendLink_finalTimesheet);
        Utility.switchToFrame(frame_sendTimeSheet);
        Utility.clickElement(frame_sendTimeSheet_okButton);
        Thread.sleep(10000);
        driver.switchTo().defaultContent();
        Utility.waitUntilElementIsVisible(timesheetStatus);
        Assert.assertTrue(timesheetStatus.getText().contains("Your timesheet has been sent to Pankaj Sharma for approval"));
        return true;
    }
}
