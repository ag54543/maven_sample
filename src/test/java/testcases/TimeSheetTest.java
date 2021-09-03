package testcases;

import base.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.TimeSheetPage;

public class TimeSheetTest extends TestBase {

    @Parameters("date")
    @Test
    public void fillTimeSheet(String date) throws InterruptedException{
         TimeSheetPage timeSheetPage = new TimeSheetPage();
         Assert.assertTrue(timeSheetPage.iVerifyThatTimeSheetFilledSuccessMessageDisplayed(date));
    }
}
