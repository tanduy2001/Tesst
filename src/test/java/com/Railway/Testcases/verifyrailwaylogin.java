package com.Railway.Testcases;

import com.Railway.Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class verifyrailwaylogin
{

    @Test
     public void verifyValidLogin()
     {
         WebDriverManager.chromedriver().setup();
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

         driver.get("http://www.raillog.somee.com/Page/HomePage.cshtml");

         LoginPage login=new LoginPage(driver);

         login.setLogin();

         login.typeUserName();

         login.typePassword();

         login.clickOnLoginButton();

         driver.quit();
     }
}
