package pom.Services;

import pom.Pages.CartPage;

public class CartPageServices {
    private final CartPage cartPage;

    public CartPageServices(){

        cartPage = new CartPage();
    }


    public void clickOnBtn_proceedToCheckout() {
        cartPage.getBtn_proceedToCheckout().click(); }
    }