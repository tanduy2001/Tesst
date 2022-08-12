import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCase {

    WebDriver driver;

    @Test(priority = 1)
    public void Test02() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        driver.get("http://www.raillog.somee.com/Page/HomePage.cshtml");
        driver.findElement(By.xpath("//a[contains(., 'Login')]")).click();
        driver.findElement(By.id("username")).sendKeys("hatakehv@gmail.com");
//        driver.findElement(By.id("password")).sendKeys("12345678");
        String text = Keys.chord("12345678", Keys.RETURN);
        driver.findElement(By.id("password")).sendKeys(text);
//        driver.findElement(By.xpath("//input[@type='submit']")).click();
//        driver.quit();
    }
}

