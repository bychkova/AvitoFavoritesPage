package favoritesPage;

import base.SeleniumTest;
import org.junit.jupiter.api.*;
import pages.FavoritesPage;
import pages.ItemPage;

public class FavoritesPageTests extends SeleniumTest {

    @Test
    public void AddItemToFavorites() {
        String testLink = "https://www.avito.ru/nikel/knigi_i_zhurnaly/domain-driven_design_distilled_vaughn_vernon_2639542363";
        String favoriteLink = "https://www.avito.ru/favorites";

        ItemPage itemPage = new ItemPage(testLink);
        itemPage.AddToFavorite(favoriteLink);

        FavoritesPage favoritesPage = new FavoritesPage();
        boolean actual = favoritesPage.LinkExists(testLink);

        Assertions.assertTrue(actual);
    }
}