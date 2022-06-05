package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTests extends BaseTest{

    private static final long DEFAULT_WAITING_TIME = 30;
    private static final String KEYWORD = "dell";

    @Test
    public void checkKeywordIsOnUrl() throws InterruptedException {
    getHomePage().enterTextToSearchInput(KEYWORD);
    getSearchResultsPage().waitVisibilityOfElement(DEFAULT_WAITING_TIME,getHomePage().getAllResultsLink());
        Thread.sleep(2000);
    getHomePage().clickSearchIcon();
    getSearchResultsPage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getSearchResultsPage().getSearchTitle());
    Assert.assertTrue(getDriver().getCurrentUrl().contains(KEYWORD));
}
    @Test
    public void checkIfCanAddToCart() throws InterruptedException {
        getHomePage().enterTextToSearchInput(KEYWORD);
        getSearchResultsPage().waitVisibilityOfElement(DEFAULT_WAITING_TIME,getHomePage().getAllResultsLink());
        Thread.sleep(2000);
        getHomePage().clickSearchIcon();
        getSearchResultsPage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getSearchResultsPage().getSearchTitle());
        getSearchResultsPage().clickOnFirstBuyButton();
        getSearchResultsPage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getSearchResultsPage().getCart());
        Assert.assertTrue(getSearchResultsPage().isOrderButtonVisible());
    }

}
