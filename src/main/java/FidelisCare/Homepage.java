package FidelisCare;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static FidelisCare.WebElements.*;

public class Homepage extends WebAPI {
    @FindBy(how = How.XPATH, using = ProvidersXpath)
    public WebElement providersWebElement;
    @FindBy(how = How.XPATH, using = FindADoctorXpath)
    public WebElement findADoctorWebElement;
    @FindBy(how = How.XPATH, using = LocationBoxXpath)
    public WebElement locationBoxWebElement;
    @FindBy(how = How.XPATH, using = LookingForBoxXpath)
    public WebElement lookingForBoxWebElement;
    @FindBy(how = How.XPATH, using = SeeResultsButtonXpath)
    public WebElement seeResultsButtonWebElement;

    // Method to click on 'Providers'
    public void clickProviders() {
        providersWebElement.click();
    }

    // Method to select 'Find a Doctor'
    public void selectFindADoctor() {
        findADoctorWebElement.click();
    }

    // Method to fill the location and looking for boxes
    public void fillSearchCriteria(String location, String lookingFor) {
        locationBoxWebElement.sendKeys(location);
        lookingForBoxWebElement.sendKeys(lookingFor);
    }

    // Method to click 'See Results'
    public void clickSeeResults() {
        seeResultsButtonWebElement.click();
    }

    // Method to close the window
    public void closeWindow() {
        driver.quit();
    }

    // Test Case to perform the sequence of actions
    public void performActions() {
        clickProviders();
        selectFindADoctor();
        fillSearchCriteria("Bronx, NY", "PCP");
        clickSeeResults();
        closeWindow();
    }
}
