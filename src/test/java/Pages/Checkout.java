package Pages;
import DriverManager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartMenu {
    @FindBy(id = "id=top-cart-btn-checkout")
    private WebElement txt_checkout;

    public CartMenu(){
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    public WebElement getTxt_checkout() {
        return txt_checkout;
    }
}
