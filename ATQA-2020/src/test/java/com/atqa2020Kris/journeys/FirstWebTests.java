package com.atqa2020Kris.journeys;

import com.atqa2020Kris.BaseTest;
import com.atqa2020Kris.Pages.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

public class FirstWebTests extends BaseTest {
    private HomePage homePage;
    private BlogPage blogPage;
    private HelpPage helpPage;
    private GiftCardsPage giftCardsPage;
    private CartPage cartPage;
    private DealsAndPromotionsPage dealsAndPromotionsPage;

    @BeforeMethod(alwaysRun = true)
    public void setupTest() {
        driver.get("https://amazon.com");
        homePage = new HomePage(driver);
    }
    @Test(groups = "main", suiteName = "ui", priority = 0)
    public void todayDealsTest() {

        //Given user opens a browser need provides a valid url

        //When user clicks on the Today deals block on the main page.
        dealsAndPromotionsPage = homePage.clickOnButton(DealsAndPromotionsPage.class, dealsAndPromotionsPage);
        //And

        //Then Deals and Deals and Promotions Page is opened.
        }

    @Test(groups = "main", suiteName = "ui", priority = 1)
    public void signButtonTest() throws Exception {

        //Given user opens a browser need provides a valid url

        //when user clicks on Cart button on the top right corner.
        cartPage = homePage.navigateToCartPage();
        //And After Opening a Cart Page click on Sign Up button.

        //Then Sign form is opened
        //TODO all interactions with the elements should be dealt on the corresponding page
        Assert.assertTrue(driver.findElement(By.xpath()).isDisplayed());
    }

   @Test(groups = "main", suiteName = "ui", priority = 2)
    public void setHelpPageTest() throws Exception {
        //Given user opens a browser nd provides a valid url

        //when user clicks on the Help button down the page
        helpPage = homePage.navigateToHelpPage();
        //Then user is redirected to the Help Page.
        Assert.assertTrue(helpPage.isTitleCorrect(), "Title is not correct!!!");
    }

    @Test(groups = "main", suiteName = "ui", priority = 3)
    public void blogPageTest() throws Exception {
        //Given user opens a browser nd provides a valid url

        //when user Clicks on the Blog link
        blogPage = homePage.navigateToBlogPage();
        //Then user is redirected to the Blog Page.
        Assert.assertTrue(blogPage.isTitleCorrect(), "Title is not correct!!!!");
    }

    @Test(groups = "main", suiteName = "ui", priority = 4)
    public void giftCardsPageTest() throws Exception {
        //Given user opens a browser nd provides a valid url

        //when user clicks on the Gift Cards block on the top of page.
        giftCardsPage = homePage.navigateToGiftCardsPage();
        //Then the Gift Cards list Page is opened
        Assert.assertTrue(giftCardsPage.isTitleCorrect(), "Title is not correct!!!");
    }
  }
