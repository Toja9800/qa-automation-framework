import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.setAllowExtractingPrivateFields;

class FirstSeleniumTest {
    WebDriver driver;

    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

//    @Test
//    void shouldOpenBrowser() {
//        driver.get("https://the-internet.herokuapp.com");
//        System.out.println(driver.getTitle());
//    }

//    @Test
//    void shouldReadPageHeading() {
//        driver.get("https://the-internet.herokuapp.com");
//        WebElement heading = driver.findElement(By.tagName("h1"));
//        System.out.println(heading.getText());
//    }

//    @Test
//    void shouldTypeIntoUsernameField() {
//        driver.get("https://the-internet.herokuapp.com/login");
//        WebElement usernameField = driver.findElement(By.id("username"));
//        usernameField.clear();
//        usernameField.sendKeys("tomek");
//        System.out.println(usernameField.getAttribute("value"));
//        assertThat(usernameField.getAttribute("value")).isEqualTo("tomek");
//    }

    @Test
    void shouldFailLoginWithFakeCredentials() {
        driver.get("https://the-internet.herokuapp.com/login");
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        usernameField.clear();
        passwordField.clear();
        usernameField.sendKeys("tomek");
        passwordField.sendKeys("hasloTomka123");
        WebElement loginButton = driver.findElement(By.cssSelector("button.radius"));
        loginButton.click();
        WebElement flashMessage = driver.findElement(By.id("flash"));
        assertThat(flashMessage.getText()).contains("Your username is invalid!");
    }


    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
