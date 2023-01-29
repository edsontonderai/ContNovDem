package SeleniumExerciseOne;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class question10 {
    WebDriver driver;
    String baseurl;

    @Before
    public void setup(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        baseurl = "https://en.wikipedia.org/wiki/Main_Page";
    }
    @Test
    public void Test1() throws InterruptedException {
        driver.get(baseurl);
        driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("Black Panther (film)");
        driver.findElement(By.name("go")).click();
        // verify budget




        //Display names of starring in the console
        List<WebElement> list = driver.findElements(By.className("plainlist"));

        for (int i = 0; i < list.size()-4; i++) {
            String textElement = list.get(i).getText();
            System.out.println(textElement);
        }

        System.out.println("***********************************");
        String directorName = String.valueOf(driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[3]/td/a")));
        System.out.println(directorName);


        Thread.sleep(5000);
    }
   @After
    public void teardown(){
        driver.quit();
    }
}
