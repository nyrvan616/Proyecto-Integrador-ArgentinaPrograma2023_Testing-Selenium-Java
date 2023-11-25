package DriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class DriverManager {

    private static WebDriver driver;
    private static WebDriverWait wait;

    private static Wait<WebDriver> fluentWait;

    public static void create(String browser){
        driver = WebDriverManager.getInstance(browser).create();
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(60))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static Wait<WebDriver> getFluentWait(){
        return (Wait<WebDriver>) fluentWait;
    };

    public static Wait<WebDriver> getWaitUntilVisibility(WebElement element){
        Wait<WebDriver> fluentWait = DriverManager.getFluentWait();
        fluentWait.until(ExpectedConditions.visibilityOf(element));
        return (Wait<WebDriver>) fluentWait;
    }

    public static Wait<WebDriver> getWaitUntilTextToBePresent(WebElement element, String text){
        Wait<WebDriver> fluentWait = DriverManager.getFluentWait();
        fluentWait.until(ExpectedConditions.textToBePresentInElement(element, text));
        return (Wait<WebDriver>) fluentWait;
    }


}
