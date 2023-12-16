package Ebay;


import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static Ebay.WebElements.*;

public class Homepage extends WebAPI {
    @FindBy(how = How.XPATH, using = CategoriesXpath)
    public WebElement categoriesWebElement;
    @FindBy(how = How.XPATH, using = BooksXpath)
    public WebElement booksAndMagazinesWebElement;
    @FindBy(how = How.XPATH, using = SearchButtonXpath)
    public WebElement searchButtonWebElement;


    // Method to click on 'Categories'
    public void clickCategories() {
        categoriesWebElement.click();
    }

    // Method to select 'Books & Magazines'
    public void selectBooksAndMagazines() {
        booksAndMagazinesWebElement.click();
    }

    // Method to click the search button
    public void clickSearchButton() {
        searchButtonWebElement.click();
    }

    // Method to close the window
    public void closeWindow() {
        driver.quit();
    }

    // Test Case to perform the sequence of actions
    public void performActions() {
        clickCategories();
        selectBooksAndMagazines();
        clickSearchButton();
        closeWindow();
    }

}
