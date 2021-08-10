package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class TestBase {
    public static WebDriver driver;
    public static Properties prop;
    FileInputStream fileInputStream;

    @BeforeSuite
    public void setup() throws IOException {
        prop = new Properties();
        try {
            fileInputStream = new FileInputStream(System.getProperty("user.dir")+ "/test.properties");
            prop.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        WebDriverManager.chromedriver().setup();
    }
    @BeforeMethod
    public static void startTest(Method method) {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(prop.getProperty("url"));
    }

    @AfterMethod
    public static void testTearDown(ITestResult result) {
        driver.quit();
    }

    @AfterSuite
    public void teardown(){

        try {
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

