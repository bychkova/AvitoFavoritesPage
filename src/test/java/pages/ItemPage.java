package pages;

import base.SeleniumPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ItemPage extends SeleniumPage {
    public ItemPage(String testLink){
        driver.get(testLink);
    }

    public void AddToFavorite(String favoriteLink) {
        WebElement buttonToFavorite = driver.findElement(By.cssSelector("[data-marker='item-view/favorite-button'].desktop-usq1f1"));
        buttonToFavorite.click();
        driver.get(favoriteLink);
    }
}