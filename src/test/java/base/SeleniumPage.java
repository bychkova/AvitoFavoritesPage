package base;

import org.openqa.selenium.WebDriver;

public class SeleniumPage {
    protected static WebDriver driver;

    public static void setDriver(WebDriver webDriver){
        driver = webDriver;
    }
}