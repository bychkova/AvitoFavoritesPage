package pages;

import base.SeleniumPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class FavoritesPage extends SeleniumPage {

    public boolean LinkExists(String link){
        List<WebElement> linkElements = driver.findElements(By.tagName("a"));
        List<String> linkUrls = new ArrayList<>();

        for (WebElement element : linkElements) {
            linkUrls.add(element.getAttribute("href"));
        }
        if (linkUrls.contains(link)){
            return true;
        }else{
            return false;
        }
    }
}