package base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    private WebDriver driver;

    @BeforeEach
    void setUp() {
        System.setProperty("webdriver.chrome.driver", "../chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        SeleniumPage.setDriver(driver);
    }

    @AfterEach
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}