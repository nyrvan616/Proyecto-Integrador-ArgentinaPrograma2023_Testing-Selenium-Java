package pom.Pages;
import DriverManager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {

    @FindBy(css = ".billing-address-details")
    private WebElement txt_billingAddressDetails;

    @FindBy(css = ".primary .checkout")
    private WebElement btn_placeOrder;

    public PaymentPage(){

        PageFactory.initElements(DriverManager.getDriver(), this);

    }

    public WebElement getBtn_placeOrder() {
        return btn_placeOrder;
    }
}
