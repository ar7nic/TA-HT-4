package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//input[@class='search__input']")
    private WebElement searchInput;

    @FindBy(xpath = "//button[@class='search__button']")
    private WebElement searchIcon;

    @FindBy(xpath = "//span[text()='Все результаты поиска']")
    private WebElement allResultsLink;

    public WebElement getAllResultsLink() {
        return allResultsLink;
    }

    public WebElement getSearchIcon() {
        return searchIcon;
    }

    public void clickSearchIcon() {
        searchIcon.click();
    }

    public WebElement getSearchInput() {
        return searchInput;
    }

    public void enterTextToSearchInput(final String searchText) {
        searchInput.sendKeys(searchText);
    }

    public HomePage(WebDriver driver) {
        super(driver);
    }
}
