package SeleniumExerciseOne;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class question7 {
    WebDriver driver;
    String baseurl;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        baseurl = "https://www.google.com/";
        driver.manage().window().maximize();
    }
    @Test
    public void Test1() throws InterruptedException {
        driver.get(baseurl);
        String pageTitle = driver.getTitle();
        Assert.assertEquals("Google", pageTitle);
        System.out.println(pageTitle);

    driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Yahoo");
    driver.findElement(By.linkText("Mail")).click();
        Thread.sleep(3000);

    }
    @After
    public void teardown(){
        driver.quit();
    }
}
