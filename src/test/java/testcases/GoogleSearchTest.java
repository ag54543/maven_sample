package testcases;

import base.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.GoogleSearchPage;

public class GoogleSearchTest extends TestBase {

//    @Parameters("date")
    @Test
    public void googleSearchTest() throws InterruptedException{
         GoogleSearchPage searchPage = new GoogleSearchPage();
         Assert.assertEquals(searchPage.googleSearch(),"Test automation Software");
    }
}
