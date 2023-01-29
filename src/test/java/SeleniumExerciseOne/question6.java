package SeleniumExerciseOne;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class question6 {
    WebDriver driver;
    String baseurl;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        baseurl = "https://agiletestingalliance.org/";

    }
    @Test
    public void TEst1() throws InterruptedException {
        driver.get(baseurl);
        driver.findElement(By.linkText("CONTACT US")).click();
        Thread.sleep(3000);

    }
    @After

    public void teardown(){
        driver.quit();
    }
}
