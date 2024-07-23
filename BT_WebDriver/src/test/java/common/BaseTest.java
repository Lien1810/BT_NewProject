package common;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;

    //C1: Test mặc định trên trình duyệt Chrome
    public static void createBrowser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().window().maximize();
    }

    //C2: Test trên nhiều trình duyệt
    public static void createBrowser(String browserName) {
        if (browserName.trim().toLowerCase().equals("chome")) {
            driver = new ChromeDriver();
        }
        if (browserName.trim().toLowerCase().equals("firefox")) {
            driver = new FirefoxDriver();
        }
        if (browserName.trim().toLowerCase().equals("edge")) {
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static void closeBrowser() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
