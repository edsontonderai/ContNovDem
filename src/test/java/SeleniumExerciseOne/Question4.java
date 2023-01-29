package SeleniumExerciseOne;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Question4 {
    WebDriver driver;
    String baseurl;

    @BeforeMethod
    public void setup(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        baseurl = "https://demosite.executeautomation.com/Login.html";
    }
    @Test
    public void Test1() throws InterruptedException {
        driver.get(baseurl);
        driver.findElement(By.name("UserName")).sendKeys("Edson");
        driver.findElement(By.name("Password")).sendKeys("maison");
        driver.findElement(By.xpath("/html/body/form/p[3]/input")).click();
        Select dropdown=new Select(driver.findElement(By.id("TitleId")));
        dropdown.selectByIndex(2);
        driver.findElement(By.id("Initial")).sendKeys("ETM");
        driver.findElement(By.id("FirstName")).sendKeys("Edson");
        driver.findElement(By.id("MiddleName")).sendKeys("Tonderai");
        WebElement check1 = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input[2]"));
        check1.click();
        WebElement tick1 = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input[2]"));
        tick1.click();
        driver.findElement(By.xpath("/html/body/div/ul/li[1]/a/span")).click();
        Thread.sleep(5000);
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }

}