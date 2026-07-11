package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import static org.assertj.core.api.Assertions.assertThat;


public class LoginTest {
    WebDriver driver;

    @BeforeEach
    void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    void shouldFailLoginWithFakeCredentials() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.typeUsername("tomek");
        loginPage.typePassword("hasloTomka123");
        loginPage.clickLogin();

        assertThat(loginPage.getflashMessageText()).contains("Your username is invalid!")
    }


    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
