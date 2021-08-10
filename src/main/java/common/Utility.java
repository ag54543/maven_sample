package common;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utility extends TestBase{
    static WebDriverWait wait;
//            =new WebDriverWait(TestBase.driver, Duration.ofMillis(Integer.parseInt(TestBase.prop.getProperty("EXPLICIT_WAIT_TIMEOUT"))));

    public static void waitUntilElementIsVisible(WebElement element) {
        wait = new WebDriverWait(driver, Duration.ofMillis(Integer.parseInt(TestBase.prop.getProperty("EXPLICIT_WAIT_TIMEOUT"))));
//        wait = new WebDriverWait(driver, Integer.parseInt(TestBase.prop.getProperty("EXPLICIT_WAIT_TIMEOUT")));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitUntilElementIsPresent(WebDriver driver, By locator) {
//        wait = new WebDriverWait(driver, Integer.parseInt(TestBase.prop.getProperty("EXPLICIT_WAIT_TIMEOUT")));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public static void waitUntilElementIsClickable(WebElement element) {
        wait = new WebDriverWait(driver, Duration.ofMillis(Integer.parseInt(TestBase.prop.getProperty("EXPLICIT_WAIT_TIMEOUT"))));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitUntilElementIsNotVisible(WebDriver driver, WebElement element) {
//        wait = new WebDriverWait(driver, Integer.parseInt(TestBase.prop.getProperty("EXPLICIT_WAIT_TIMEOUT")));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public static void clickElement(WebElement element){
        waitUntilElementIsVisible(element);
        waitUntilElementIsClickable(element);
        element.click();
    }

    public static void enterText(WebElement element, String text){
        waitUntilElementIsVisible(element);
        waitUntilElementIsClickable(element);
        element.sendKeys(text);
    }

    public static void switchToFrame(WebElement element){
        waitUntilElementIsVisible(element);
        waitUntilElementIsClickable(element);
        TestBase.driver.switchTo().frame(element);
    }
}
