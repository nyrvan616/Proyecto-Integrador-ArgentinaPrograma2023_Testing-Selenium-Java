package pom.Pages;
import DriverManager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage {
    @FindBy(css = "#option-label-size-143-item-169")
    private WebElement txt_largeSize;

    @FindBy(css = "#option-label-color-93-item-50")
    private WebElement txt_blueColor;

    @FindBy(id = "qty")
    private WebElement txt_Quantity;

    @FindBy(css = "#product-addtocart-button > span")
    private WebElement txt_addToCart;

    @FindBy(css = ".showcart")
    private WebElement txt_topCart;

    @FindBy(css=".message-success a")
    private WebElement txt_linkShoppingCart;

    public ProductDetailPage(){
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    public WebElement getTxt_largeSize() {
        return txt_largeSize;
    }

    public WebElement getTxt_blueColor(){return txt_blueColor;}

    public WebElement getTxt_Quantity(){return txt_Quantity;}

    public WebElement getTxt_addToCart(){return txt_addToCart;}

    public WebElement getTxt_linkShoppingCart(){return txt_linkShoppingCart;}

}