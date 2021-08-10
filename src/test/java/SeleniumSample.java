import com.sun.org.apache.xalan.internal.xsltc.dom.AdaptiveResultTreeImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SeleniumSample {
/*    WebDriver driver;
    public static Properties properties = new Properties();

    @BeforeTest
    public void setup() throws IOException {
        System.out.println("user directory.."+System.getProperty("user.dir"));
        properties.load(new FileInputStream(System.getProperty("user.dir")+ "/test.properties"));
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "/webdrivers/chromedriver.exe");
//        System.setProperty("webdriver.chrome.driver","D:/BCG_B2B_Project/Test_Automation/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("https://www.google.com");
        System.out.println("url..."+properties.getProperty("url"));
        driver.get(properties.getProperty("url"));
    }
    @Parameters("date")
    @Test
    public void sampleTest(String date) throws InterruptedException{

        driver.findElement(By.xpath("//span[text()='TimeSheet Entries']")).click();
        Thread.sleep(2000);
//        String date = properties.getProperty("date");
        driver.findElement(By.xpath("//a[contains(text(),'"+date+"')]/parent::td/preceding-sibling::td/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("Ribbon.ContextualTabs.Timesheet.Home-title")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("Ribbon.ContextualTabs.Timesheet.Home.Tasks.AddLine-Large")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Select From Existing Assignments']/following-sibling::span")).click();
        Thread.sleep(3000);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='ms-dlgFrame']")));
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//span[@class='ms-commentexpand-iconouter'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[@class='ms-commentexpand-iconouter'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(),'QA tasks')]/preceding-sibling::input")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_ctl00_PlaceHolderMain_PWA_PlaceHolderMain_idComment")).sendKeys("Testing");
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_ctl00_PlaceHolderMain_idOkButton")).click();
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[text()='Actual'])[1]/parent::td/following-sibling::td")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//table[contains(@id,'rightpane_mainTable')]//tr)[2]/td")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("(//span[text()='Actual'])[1]/parent::td/following-sibling::td")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("jsgrid_editbox")).sendKeys("8h");
        Thread.sleep(2000);
        driver.findElement(By.id("Ribbon.ContextualTabs.Timesheet.Home.Sheet.SubmitMenu-Large")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("Ribbon.ContextualTabs.Timesheet.Home.Sheet.SubmitTimesheet-Menu32")).click();
        Thread.sleep(4000);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='ms-dlgFrame']")));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@value='OK']")).click();
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        Thread.sleep(1000);
        //        driver.findElement(By.name("q")).sendKeys("Hello");
//        driver.findElement(By.name("btnK")).click();
    }

    @AfterTest
    public void teardown(){
        driver.close();
    }*/

}
