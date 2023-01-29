package SeleniumExerciseOne;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class qestion5 {
    WebDriver driver;
    String baseurl;

    @Before
    public void setup(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        baseurl = "http://www.datamate.co.za/";

    }
    @Test
    public void Test1() throws InterruptedException {
        driver.get(baseurl);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/nav/ul/li[3]/a/span/span")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/nav/ul/li[3]/div/ul/li[2]/ul/li[8]/a/span/span")).click();
        driver.findElement(By.xpath("//*[@id=\"default-btn-86dfb65d5a95023ba5557de2b61b07ef\"]")).click();
        //Select dropdown = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div/div/section[3]/div/div[1]/div/div/div/div/form/div[1]/div[9]/div/div[1]/div/div")));
        //dropdown.selectByIndex(14);
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        Thread.sleep(5000);
    }
    @After
    public void teardown(){
        driver.quit();
    }
}
