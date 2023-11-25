package pom.Pages;
import DriverManager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuccesPage {
    @FindBy(xpath = "//h1/span")
    private WebElement txt_succesTitle;

    @FindBy (css = ".continue")
    private WebElement btn_continueShopping;

    @FindBy (css = "#registration")
    private WebElement btn_createAnAccount;

    @FindBy(css = ".checkout-success p span") //ACA QUEDE
    private WebElement txt_numeroDeOrden;

    public SuccesPage(){

        PageFactory.initElements(DriverManager.getDriver(), this);

    }

    public WebElement getTxt_succesTitle() {
        return txt_succesTitle;
    }

    public WebElement getBtn_continueShopping(){return btn_continueShopping;}

    public WebElement getBtn_createAnAccount(){return btn_createAnAccount;}

    public WebElement getTxt_numeroDeOrden(){return txt_numeroDeOrden;}
}