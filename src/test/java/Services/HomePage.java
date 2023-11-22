package Services;

public class HomePage {
    private final Pages.HomePage homePage;

    public HomePage(){
        homePage = new Pages.HomePage();
    }

    public void clickOnTxt_product(){
        homePage.getTxt_product().click();
    }
}
