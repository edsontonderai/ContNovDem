package SeleniumExerciseOne;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Qestion1 {
    WebDriver driver;
    String baseurl;



    @BeforeMethod
    public void Setup() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        baseurl="http://datamateinc.com";
        driver.manage().window().maximize();
    }
@Test
    public void Test1() throws InterruptedException {
        driver.get(baseurl);
        driver.findElement(By.linkText("Training")).click();
        Thread.sleep(3000);

    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
