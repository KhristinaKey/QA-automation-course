package com.atqa2020Kris.journeys;

import com.atqa2020Kris.BaseTest;
import com.atqa2020Kris.Pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.*;

import static com.atqa2020Kris.Pages.BlogPage.*;
import static org.apache.commons.lang3.SystemUtils.*;

public class FirstWebTests extends BaseTest {

    private HomePage homePage;
    private BlogPage blogPage;
    private HelpPage helpPage;
    private GiftCardsPage giftCardsPage;
    private CartPage cartPage;
    private DealsAndPromotionsPage dealsAndPromotionsPage;

    //TODO please fix formating for all methods below 
    @BeforeMethod(alwaysRun = true)
    public void setupTest() {
    driver.get("https://amazon.com");
    homePage = new HomePage(driver);
       }
      //  public EarlyAccessPage(RemoteWebDriver driver) { super(driver); }
//TODO please remove all redundant commented out lines of code
//TODO please remove separations between tests and please rename all test methods to match camel case style convention - e.g. testMainUrl()
      // 01 --------------------------------------------------------
    @Test(groups = "main", suiteName = "ui", priority = 0)
        public void TodayDealsTest() {

        //Given user opens a browser need provides a valid url

        //When user clicks on the Today deals block on the main page.
        dealsAndPromotionsPage = homePage.clickOnButton(DealsAndPromotionsPage.class, dealsAndPromotions);
        //And

        //Then Deals and Deals and Promotions Page is opened.
        Assert.assertTrue(dealsAndPromotionsPage.isItDealsAndPromotionsPage(dealsAndPromotions),"Title is not valid!!!!!!");
        //driver.findElement(By.xpath("//div[@class='fst-h1-st pageBanner']//b[contains(text(),'Deals and Promotions')]")).getText().equals(DEALS_PAGE_TITLE)
        //  System.out.println("01_Deals");
        }

        // 02 -------------------------------------------------------------

    @Test(groups = "main", suiteName = "ui", priority = 1)
        public void SignButtonTest() throws Exception {

        //Given user opens a browser need provides a valid url

        //when user clicks on Cart button on the top right corner.
        homePage.navigateToCartPage();
        //And After Opening a Cart Page click on Sign Up button.
        //span[contains(text(),'Sign up now')]
        //Then Sign form is opened
        //TODO all interactions with the elements should be dealt on the corresponding page
        Assert.assertTrue(driver.findElement(By.xpath(")).isDisplayed());
         }

    // 03 -------------------------------------------------------------
    @Test(groups = "main", suiteName = "ui", priority = 2)
    public void mainUrlTest() throws Exception {
        //Given user opens a browser nd provides a valid url

        //when user clicks on the Help button down the page
        homePage.navigateToHelpPage();
        //And
        //TODO not sure how this works as helpPage is never instantiated
        //Then user is redirected to the Help Page.
        Assert.assertTrue(helpPage.isTitleCorrect(),"Title is not correct!!!");
        }

    // 04 -------------------------------------------------------------
    @Test(groups = "main", suiteName = "ui", priority = 3)
    public void BlogPageTest() throws Exception {
        //Given user opens a browser nd provides a valid url

        //when user Clicks on the Blog link
        homePage.navigateToBlogPage();
        //And
        //TODO not sure how this works as blogPage is never instantiated
        //Then user is redirected to the Blog Page.
        Assert.assertTrue(blogPage.isTitleCorrect(), "Title is not correct!!!!");
        }


    // 05 --------------------------------------------------------------
    @Test(groups = "main", suiteName = "ui", priority = 4)
    public void mainUrlTest() throws Exception {
        //Given user opens a browser nd provides a valid url

        //when user clicks on the Gift Cards block on the top of page.
        homePage.navigateToGiftCardsPage();
        //And

        //Then the Gift Cards list Page is opened
        //TODO not sure how this works as giftCardsPage is never instantiated
        Assert.assertTrue(giftCardsPage.isTitleCorrect(),"Title is not correct!!!");
        }

   /* @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        System.out.println("teardown");
    }*/
}
