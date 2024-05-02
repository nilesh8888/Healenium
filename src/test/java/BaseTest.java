import com.epam.healenium.SelfHealingDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;


public class BaseTest {

    public WebDriver driver;

    @BeforeMethod
    public void init(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriver delegate = new ChromeDriver(options);
//         driver = new ChromeDriver(options);
        driver = SelfHealingDriver.create(delegate);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.navigate().to(getClass().getClassLoader().getResource("checkout/index.html"));
    }

    @AfterMethod
    public void after() throws InterruptedException {
        Thread.sleep(5000);

        driver.quit();
    }

}
