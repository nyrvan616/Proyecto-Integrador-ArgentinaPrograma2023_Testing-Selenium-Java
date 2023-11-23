package Services;

public class CartPage {
    private final Pages.CartPage cartPage;

    public CartPage(){

        cartPage = new Pages.CartPage();
    }


    public void clickOnBtn_proceedToCheckout() {
        cartPage.getBtn_proceedToCheckout().click(); }
    }