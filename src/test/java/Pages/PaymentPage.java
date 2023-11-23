package Pages;
import DriverManager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {

    @FindBy(css = ".billing-address-details")
    private WebElement txt_billingAddressDetails;

    @FindBy(xpath = "//div[@id='checkout-payment-method-load']/div/div/div[2]/div[2]/div[4]/div/button/span")
    private WebElement btn_placeOrder;

    public PaymentPage(){

        PageFactory.initElements(DriverManager.getDriver(), this);

    }

    public WebElement getTxt_billingAddressDetails(){
        return txt_billingAddressDetails;
    }

    public WebElement getBtn_placeOrder() {
        return btn_placeOrder;
    }
}
