import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {

    public static WebDriver driver;

    @BeforeTest
    void Setup(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver();
    }

    @Test
    void TestSteps(){
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        System.out.println(title);

        driver.findElement(By.name("q")).sendKeys("Wipro Jobs");

    }
}
