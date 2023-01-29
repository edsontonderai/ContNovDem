package SeleniumExerciseOne;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class question9 {
    WebDriver driver;

    String baseurl;
     @BeforeMethod
    public void setup() {
         WebDriverManager.chromedriver();
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         baseurl = "https://the-internet.herokuapp.com/dynamic_loading";
     }
     @Test
    public void Test1() throws InterruptedException {
         driver.get(baseurl);
         WebElement alltext = driver.findElement(By.tagName("body"));
         System.out.println("The Text Content " + alltext.getText());
         Thread.sleep(3000);
     }
    @AfterMethod
    public void teardown(){
         driver.quit();
    }
}
