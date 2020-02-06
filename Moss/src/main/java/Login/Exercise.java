package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Exercise
{
    static protected WebDriver driver;

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","src\\test\\java\\BrowserDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.autotrader.co.uk/");
        driver.findElement(By.linkText("Sign in")).click();
        //driver.findElement(By.id("Accept All-button")).click();
        driver.findElement(By.linkText("Register now")).click();


    }

}
