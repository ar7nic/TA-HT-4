package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "//h1[@id='j-catalog-header']")
    private WebElement searchTitle;

    @FindBy(xpath = "//a[contains(@class,'j-buy-button-add')]")
    private List<WebElement> listOfBuyButtons;

    @FindBy(xpath = "//div[@class='cart']")
    private WebElement cart;

    @FindBy(xpath = "//div[@class='cart-btnOrder']")
    private WebElement orderButton;

    public boolean isOrderButtonVisible() {
        return orderButton.isDisplayed();
    }

    public WebElement getCart() {
        return cart;
    }

    public List<WebElement> getListOfBuyButtons() {
        return listOfBuyButtons;
    }

    public void clickOnFirstBuyButton() {
        listOfBuyButtons.get(0).click();
    }

    public WebElement getSearchTitle() {
        return searchTitle;
    }

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }
}
