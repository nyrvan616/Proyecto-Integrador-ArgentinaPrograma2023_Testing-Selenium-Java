package Pages;
import DriverManager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SuccesPage {
    @FindBy(xpath = "//h1/span")
    private WebElement txt_succesTitle;

    @FindBy (className = "action primary continue")
    private WebElement btn_continueShopping;

    @FindBy (className = "action primary")
    private WebElement btn_createAnAccount;

    @FindBy(css = "p:nth-child(1) > span") //ACA QUEDE
    private WebElement txt_numero;

    public SuccesPage(){

        PageFactory.initElements(DriverManager.getDriver(), this);

    }

    public WebElement getTxt_succesTitle() {
        return txt_succesTitle;
    }

    public WebElement getBtn_continueShopping(){return btn_continueShopping;}

    public WebElement getBtn_createAnAccount(){return btn_createAnAccount;}
}