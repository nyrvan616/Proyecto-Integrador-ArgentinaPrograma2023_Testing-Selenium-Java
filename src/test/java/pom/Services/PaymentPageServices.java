package pom.Services;

import pom.Pages.PaymentPage;

public class PaymentPageServices {
    private final PaymentPage paymentPage;

    public PaymentPageServices(){

        paymentPage = new PaymentPage();
    }


    public void clickOnBtn_placeOrder() {
        paymentPage.getBtn_placeOrder().click(); }
    }