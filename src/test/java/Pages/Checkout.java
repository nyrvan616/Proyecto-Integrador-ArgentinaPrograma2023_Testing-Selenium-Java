package Pages;
import DriverManager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout {
    @FindBy(id = "id=customer-email")
    private WebElement txt_customerEmail;

    @FindBy(name = "firstname")
    private WebElement txt_customerFirstName;

    @FindBy(name = "lastname")
    private WebElement txt_customerLastName;

    @FindBy(name = "company")
    private WebElement txt_customerCompany;

    @FindBy(name = "street[0]")
    private WebElement txt_customerStreet0;

    @FindBy(name = "city")
    private WebElement txt_customerCity;

    public Checkout(){
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    public WebElement getTxt_customerEmail() {

        return txt_customerEmail;
    }
    public WebElement getTxt_customerFirstName() {

        return txt_customerFirstName;
    }
    public WebElement getTxt_customerLastName(){
        return txt_customerLastName;
    }

    public WebElement getTxt_customerCompany() {
        return txt_customerCompany;
    }

    public WebElement getTxt_customerStreet0() {
        return txt_customerStreet0;
    }

    public WebElement getTxt_customerCity() {
        return txt_customerCity;
    }
}
