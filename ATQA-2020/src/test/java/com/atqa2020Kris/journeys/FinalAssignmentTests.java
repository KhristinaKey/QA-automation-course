package com.atqa2020Kris.journeys;

import com.atqa2020Kris.BaseTest;
import com.atqa2020Kris.Pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FinalAssignmentTests extends BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void setupTest() {
        driver.get("https://amazon.com");
        HomePage homePage = new HomePage(driver);
    }
    @Test(groups = "main", suiteName = "ui", priority = 0)
    public void verifyNewReleasesPageTest() {
        //Given
        //When User on home page click on button “ALL” on the left panel
        //And from the menu select “New Releases”
        //Then On the “New Releases” page verify that ALL titles of the sections presented on the page are existing in the left List of links
    }

    @Test(groups = "main", suiteName = "ui", priority = 1)
    public void v() {
        //Given User navigate to amazon.co.uk
        //When
        //And
        //Then
    }
    @Test(groups = "main", suiteName = "ui", priority = 2)
    public void v() {
        //Given User navigate to amazon.co.uk
        //When
        //And
        //Then
    }
    @Test(groups = "main", suiteName = "ui", priority = 3)
    public void v() {
        //Given User navigate to amazon.co.uk
        //When
        //And
        //Then
    }
    @Test(groups = "main", suiteName = "ui", priority = 4)
    public void v() {
        //Given User navigate to amazon.co.uk
        //When
        //And
        //Then
    }
}
