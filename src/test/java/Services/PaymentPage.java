package Services;

import DriverManager.DriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentPage {
    private final Pages.PaymentPage paymentPage;

    public PaymentPage(){

        paymentPage = new Pages.PaymentPage();
    }


    public void clickOnBtn_placeOrder() {
        WebDriverWait wait = DriverManager.getWait();
        wait.until(ExpectedConditions.visibilityOf(paymentPage.getTxt_billingAddressDetails()));
        paymentPage.getBtn_placeOrder().click(); }
    }