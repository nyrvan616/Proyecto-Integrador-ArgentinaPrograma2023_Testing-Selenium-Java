package Pages;
import DriverManager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;

public class CartPage {
    @FindBy(id = "id=top-cart-btn-checkout")
    private WebElement txt_checkout;

    public CartMenu(){

        PageFactory.initElements(DriverManager.getDriver(), this);
        // Esperar a que el elemento sea visible después de la inicialización de la página
        WebDriverWait wait = DriverManager.getWait();
        wait.until(ExpectedConditions.visibilityOf(txt_checkout));
    }

    public WebElement getTxt_checkout() {
        return txt_checkout;
    }
}
