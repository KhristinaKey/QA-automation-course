package com.atqa2020Kris;

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



    private static String DEALS_PAGE_TITLE = "Deals and Promotions";
    private HomePage homePage;
    private BlogPage blogPage;
    private HelpPage helpPage;
    private GiftCardsPage giftCardsPage;

    private DealsAndPromotionsPage dealsAndPromotionsPage;

    /*@BeforeMethod(alwaysRun = true)
    public void setupTest() {
        driver.get("https://amazon.com");
        homePage = new HomePage(driver);
      // homePage = new HomePage(driver);
      // HomePage homePage = new HomePage(driver);
    }
      //  public EarlyAccessPage(RemoteWebDriver driver) { super(driver); }
*/
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

   /* @Test(groups = "main", suiteName = "ui", priority = 1)
        public void SignButtonTest() {

        //Given user opens a browser need provides a valid url

        //when user clicks on Cart button on the top right corner.
        //span[@id='nav-cart-count']

        //And After Opening a Cart Page click on Sign Up button.
        //span[contains(text(),'Sign up now')]
        //Then Sign form is opened
        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Today's Deals')]")).isDisplayed());
        System.out.println("02_Cart_Button_Test");
    }
*/

    // 03 -------------------------------------------------------------
    @Test(groups = "main", suiteName = "ui", priority = 2)
    public void mainUrlTest() {
        //Given user opens a browser nd provides a valid url

        //when user clicks on the Help button down the page

        //And

        //Then user is redirected to the Help Page.
        Assert.assertTrue(helpPage.isTitleCorrect(),"Title is not correct!!!");
        System.out.println("03_Test");
    }

    /*
    // 04 -------------------------------------------------------------
    @Test(groups = "main", suiteName = "ui", priority = 3)
    public void BlogPageTest() throws Exception {
        //Given user opens a browser nd provides a valid url

        //when user Clicks on the Blog link

        //And

        //Then user is redirected to the Blog Page.

        Assert.assertTrue(blogPage.isTitleCorrect(),"Title is not correct!!!");
        System.out.println("04_Test");
    }
    */


    // 05 --------------------------------------------------------------
    @Test(groups = "main", suiteName = "ui", priority = 4)
    public void mainUrlTest() {
        //Given user opens a browser nd provides a valid url

        //when user clicks on the Gift Cards block on the top of page.

        //And

        //Then the Gift Cards list Page is opened
        Assert.assertTrue(giftCards.isTitleCorrect(),"Title is not correct!!!");
        System.out.println("05_Test");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        System.out.println("teardown");
    }
}
