package SeleniumExerciseOne;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class question8 {
    WebDriver driver;
    String baseurl;

    @BeforeMethod
    public void setup(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        baseurl = "http://www.onlineconversion.com/length_common.htm";
    }
    @Test
    public void Test1() throws InterruptedException {
        driver.get(baseurl);
        driver.findElement(By.name("what")).sendKeys("4");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/form/div/center/table/tbody/tr[2]/td[1]/select"));
        Select select = new Select(driver.findElement(By.name("from")));
        select.selectByIndex(3);
        Select select1 = new Select(driver.findElement(By.name("to")));
        select1.selectByIndex(6);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/form/div/center/table/tbody/tr[3]/td/input")).click();
        driver.findElement(By.name("answer"));
        Thread.sleep(5000);


    }
    @After
    public void teardown(){
        driver.quit();
    }
}
