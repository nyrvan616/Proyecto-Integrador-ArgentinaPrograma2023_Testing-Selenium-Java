package pom.Services;

import pom.Pages.HomePage;

public class HomePageServices {
    private final HomePage homePage;

    public HomePageServices(){
        homePage = new HomePage();
    }

    public void clickOnTxt_product(){
        homePage.getTxt_product().click();
    }
}
