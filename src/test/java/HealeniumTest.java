
import com.epam.healenium.SelfHealingDriver;
import com.epam.healenium.annotation.DisableHealing;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class HealeniumTest extends BaseTest {



            @Test
    public  void firstTest() {
            driver.findElement(By.id("firstName")).sendKeys("FirstName");
                driver.findElement(By.id("lastName")).sendKeys("LastName");
                driver.findElement(By.id("username")).sendKeys("Username");
                driver.findElement(By.id("email")).sendKeys("email@gmaail.com");
                driver.findElement(By.id("address")).sendKeys("Sample address");
                driver.findElement(By.id("address2")).sendKeys("Sample Address2");
                driver.findElement(By.id("country")).sendKeys("India");
                driver.findElement(By.id("state")).sendKeys("Maharashtra");
                driver.findElement(By.id("zip")).sendKeys("Healenium Test");
                driver.findElement(By.id("cc-name")).sendKeys("FirstName Lastname");
                driver.findElement(By.id("cc-number")).sendKeys("546215665166545");
                driver.findElement(By.id("cc-expiration")).sendKeys("2/26");
                driver.findElement(By.id("card-cvv")).sendKeys("123");
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[text()='Continue to checkout']")));
//                assertTrue(driver.getCurrentUrl().contains("paymentMethod=on"), "Checkout failed!");
                }


}
