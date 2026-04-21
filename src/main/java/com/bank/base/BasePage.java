package com.bank.base;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bank.factory.DriverFactory;

import org.openqa.selenium.By;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected JavascriptExecutor js;

    public BasePage(){
        this.driver = DriverFactory.getDriver();
        this.driver.manage().window().maximize();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.js = (JavascriptExecutor) driver;
    }

    protected WebElement find(By locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void click(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected void type(By locator, String text){
        WebElement el = find(locator);
        el.clear();
        el.sendKeys(text);
    }

 //   protected String getText(By locator){
  //      return 
  //  }

    protected void hover(By locator){
        Actions actions = new Actions(driver);
        actions.moveToElement(find(locator));
    }
        protected void pause(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }

  //  protected void selectDropDown(By locator){
 //       Select select = new Select(VisibleText);
 //       select.selectByVisibleText(text);
   // }
}
