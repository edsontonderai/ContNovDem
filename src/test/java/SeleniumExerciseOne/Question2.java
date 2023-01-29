package SeleniumExerciseOne;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Question2 {
    WebDriver driver;
    String baseurl;

    @BeforeMethod
    public void Setup(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        baseurl = "https://en.wikipedia.org/wiki/Main_Page";
        driver.manage().window().maximize();

    }
    @Test
    public void Test1() throws InterruptedException {
        driver.get(baseurl);
        driver.findElement(By.id("searchInput")).sendKeys("Selenium");
        driver.findElement(By.id("searchButton")).click();
        Thread.sleep(3000);


    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
