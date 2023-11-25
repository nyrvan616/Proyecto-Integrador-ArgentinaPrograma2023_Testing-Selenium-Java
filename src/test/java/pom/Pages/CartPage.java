package pom.Pages;
import DriverManager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    @FindBy(css = ".checkout > span")
    private WebElement btn_proceedToCheckout;

    public CartPage(){

        PageFactory.initElements(DriverManager.getDriver(), this);

    }

    public WebElement getBtn_proceedToCheckout() {
        return btn_proceedToCheckout;
    }
}
