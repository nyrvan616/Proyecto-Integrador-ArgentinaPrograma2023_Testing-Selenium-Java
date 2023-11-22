package Services;

public class CartPage {
    private final Pages.CartPage cartPage;

    public CartPage(){

        cartPage = new Pages.CartPage();
    }


    public void clickOnTxt_checkout() {
        cartPage.getBtn_ProceedToCheckout().click(); }
    }