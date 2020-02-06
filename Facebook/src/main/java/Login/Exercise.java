package Login;

import com.sun.org.apache.bcel.internal.generic.Select;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Exercise {

    static protected WebDriver driver;

    @Test
    public void userShouldAbleToRegisterSuccessfully()
    {
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\BrowserDrivers\\chromedriver.exe");
        driver = new ChromeDriver(); // driver code for opening the chrome browser
        driver.manage().window().maximize(); // driver code for maximize the windows
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.sky.com/"); // code for test site
        driver.findElement(By.linkText("Sign in")).click(); //code for findelement to sign in
        driver.findElement(By.linkText("Sign up")).click(); //code for findelement to sign up
        driver.findElement(By.id("title")).sendKeys("Mr");
        driver.findElement(By.id("firstname")).sendKeys("Romic");
        driver.findElement(By.id("lastname")).sendKeys("Masih");
        driver.findElement(By.id("email")).sendKeys("romic.massi@gmail.com");
        driver.findElement(By.id("confirmEmail")).sendKeys("romic.massi@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Apple@Banana12");
        driver.findElement(By.id("confirmPassword")).sendKeys("Apple@Banana12");
    }


    @Test
    public void ocado()
    {
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\BrowserDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.ocado.com/webshop/startWebshop.do");
        driver.findElement(By.id("register")).click();
        driver.findElement(By.id("title")).sendKeys("Mrs");
        driver.findElement(By.id("firstName")).sendKeys("Kate");
        driver.findElement(By.id("lastName")).sendKeys("Kate");
        driver.findElement(By.id("login")).sendKeys("romic.massi@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Apple@Banana12");
        driver.findElement(By.id("postcode")).sendKeys("AB1 2CD");
    }

    @Test
    public void mockplus()
    {
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\BrowserDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://www.mockplus.com/");
        driver.findElement(By.className("user-btn")).click();
        driver.findElement(By.id("email")).sendKeys("romic.massi@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Apple@Banana12");
        driver.findElement(By.id("cofPassword")).sendKeys("Apple@Banana12");
    }

    @Test
    public void orangehrm()
    {
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\BrowserDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
    }

    @Test
    public void stackexchange()
    {
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\BrowserDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://security.stackexchange.com/questions/179823/workarounds-for-sites-that-are-broken-without-cookies");
        driver.findElement(By.linkText("Sign up")).click();
        driver.findElement(By.id("display-name")).sendKeys("Romic Masih");
        driver.findElement(By.id("email")).sendKeys("romic-masih@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Password@123");
    }
}
