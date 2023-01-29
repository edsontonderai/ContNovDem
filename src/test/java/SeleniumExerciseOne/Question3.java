package SeleniumExerciseOne;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {
    WebDriver driver;
    String baseurl;

    @BeforeEach
    public void Setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        baseurl = "http://www.datamateinc.com";

    }
    @Test
    public void Test() throws InterruptedException {
        driver.get(baseurl);
        driver.findElement(By.linkText("About Us")).click();
        Thread.sleep(3000);
    }
    @AfterEach
    public void teardown(){
        driver.quit();
    }

}
