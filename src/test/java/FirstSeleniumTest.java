import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

class FirstSeleniumTest {
    WebDriver driver;

    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    void shouldOpenBrowser() {
        driver.get("https://the-internet.herokuapp.com");
        System.out.println(driver.getTitle());
    }

    @Test
    void shouldReadPageHeading() {
        driver.get("https://the-internet.herokuapp.com");
        WebElement heading = driver.findElement(By.tagName("h1"));
        System.out.println(heading.getText());
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
