
package com.atqa2020Kris.journeys;

import com.atqa2020Kris.BaseTest;
import com.atqa2020Kris.Pages.AmazonGiftIdeasPage;
import com.atqa2020Kris.Pages.AmazonNewReleasesPage;
import com.atqa2020Kris.Pages.HomePage;
import com.atqa2020Kris.Pages.SearchResultPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FinalAssignmentTests extends BaseTest {
    private String seeAll33DepartmentsButtonLocator = "span[contains(text(),'See All 33 Departments')]";
    private String computerAndAccessoriesButtonLocator = "//span[contains(text(),'Computers & Accessories')]";
    private String monitorButtonLocator = "//span[contains(text(),'Monitors')]";
    private String searchTerm = "go pro 4K";
    private String searchMinPriceValue = "100";
    private String searchTermPC = "PC";
    private String searchTermLocator = "//*[@class='a-color-state a-text-bold']";
    private String searchMinPriceButtonLocator = "//span[@id='a-autoid-1']";
    private String allTopMenuButtonLocator = "//select[@id='searchDropdownBox']";
    private String seeMoreButtonLocator = "/html/body/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/a/span";
    private String newReleasesButtonLocator = "//a[contains(text(),'New Releases')]";
    private String acceptCookiesButtonLocator = "//input[@id='sp-cc-accept";
    private String tabletsButtonLocator = "//header/div[@id='navbar']/div[@id='nav-progressive-subnav']/div[@id='nav-subnav']/a[7]/span[1]";
    private String primeCheckboxButtonLocator = "//body/div[@id='a-page']/div[2]/div[2]/div[2]/div[1]/div[1]/div[8]/ul[1]/li[1]/span[1]/a[1]/div[1]/label[1]/i[1]";

    private HomePage homePage;
    private AmazonNewReleasesPage amazonNewReleasesPage;
    private AmazonGiftIdeasPage amazonGiftIdeasPage;
    private SearchResultPage searchResultPage;

    @BeforeMethod(alwaysRun = true)
    public void setupTest() throws Exception {
        driver.get("https://amazon.com");

        if (driver.findElement(By.xpath(acceptCookiesButtonLocator)).isDisplayed()) {
            driver.findElement(By.xpath(acceptCookiesButtonLocator)).click();
        }
    }
    private HomePage new HomePage;
    private AmazonNewReleasesPage new AmazonNewReleasesPage;
    private AmazonGiftIdeasPage new AmazonGiftIdeasPage;

    @Test(groups = "main", suiteName = "ui", priority = 0)
    public void testCase1() throws Exception {
        //Given
        //When User on home page click on button “ALL” on the left panel
        homePage.navigateToAllTopMenuButtonLocator();
        this.wait = new WebDriverWait(driver,15);
        //And from the menu select “New Releases”
        driver.findElement(By.xpath(newReleasesButtonLocator)).click();
        //Then On the “New Releases” page verify that ALL titles of the sections presented on the page are existing in the left List of links
        Assert.assertTrue(driver.findElement(By.xpath()).isDisplayed());
    }

    @Test(groups = "main", suiteName = "ui", priority = 1)
    public void testCase2() {
        //Given User navigate to amazon.co.uk
        //When from the home page click on link “New Releases” from the Top menu
        //And from the “Hot New Releases” click on “Most Gifted” link from the top menu
        //And from the “Amazon Gift Ideas” click on “Books” link from the left menu
        //Then on the “Most Gifted in Books” page check ALL listings and verify that all of them have Ratings presented
    }
    @Test(groups = "main", suiteName = "ui", priority = 2)
    public void testCase3() throws Exception {
        //Given User navigate to amazon.co.uk
        //When User from the home page search for “go pro 4k” via search field
        searchResultPage = homePage.searchForItem(SearchResultPage.class, searchTerm);
        //And on the “Search results” page select Avg. Customer Review 4+ stars from the left section
        //And on the “Search results” page set min price as 100 and apply changes
        searchResultPage.selectFourPlusCustomerReviewRating().setMinimalPrice().submitPrice();
        //Then verify that all updated results (except Limited deals one) have an average rating 4+ and item price is higher than 100
        Assert.assertTrue(searchResultPage.isExpectedConditionsMet(), "Expected conditions weren't met ");
    }
    @Test(groups = "main", suiteName = "ui", priority = 3)
    public void testCase4() {
        //Given User navigate to amazon.co.uk
        //When User from the home page click on link “PC” from the Top menu
        //And on “Computers & Accessories” page click on “Monitors”
        driver.findElement(By.xpath(allTopMenuButtonLocator)).click();
        driver.findElement(By.xpath(computerAndAccessoriesButtonLocator)).click();
        driver.findElement(By.xpath(monitorButtonLocator)).click();
        //And on “Monitors” page click on “See more” link next to the “Top rated section”
        driver.findElement(By.xpath(seeMoreButtonLocator)).click();
        //And on “Monitors top rated results” page apply filter “Sort by: Avg. Customer Review” from the top of the page

        //Then verify that in refreshed list all listings on the first page are sorted according to the Customer review (e.g., most rated on the top, etc.)

    }
    @Test(groups = "main", suiteName = "ui", priority = 4)
    public void testCase5() {
        //Given User navigate to amazon.co.uk
        //When User from the home page click on link “PC” from the Top menu
        //And on “Computers & Accessories” page click on “Tablets”
        driver.findElement(By.xpath(allTopMenuButtonLocator)).click();
        driver.findElement(By.xpath(computerAndAccessoriesButtonLocator)).click();
        driver.findElement(By.xpath(tabletsButtonLocator)).click();
        //And on Results page select “Prime” option checkbox from the left menu
        driver.findElement(By.xpath(primeCheckboxButtonLocator)).click();
        //Then in result list verify that all listings on the first page either have “Prime option” or “FREE Delivery” in the listing body
    }
}

