package com.Railway.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By setlogin=By.xpath("//span[contains(., 'Login')]");
    By username=By.id("username");
    By password=By.id("password");
    By loginButton=By.xpath("//input[@value='Login']");

    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void setLogin()
    {
        driver.findElement(setlogin).click();
    }

    public void typeUserName()
    {
        driver.findElement(username).sendKeys("tanduy999@gmail.com");
    }
    public void typePassword()
    {
//        driver.findElement(password).sendKeys("20112001duy");
        String text = Keys.chord("12345678", Keys.RETURN);
        driver.findElement(By.id("password")).sendKeys(text);
    }
    public void clickOnLoginButton()
    {
        driver.findElement(loginButton).click();
    }


}
