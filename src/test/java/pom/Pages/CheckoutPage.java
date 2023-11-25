package pom.Pages;
import DriverManager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    @FindBy(id = "customer-email")
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

    @FindBy(name = "country_id")
    private WebElement txt_customerCountry;

    @FindBy(name = "region")
    private WebElement txt_region;

    @FindBy(name = "postcode")
    private WebElement txt_postCode;

    @FindBy(name = "telephone")
    private WebElement txt_telephone;

    @FindBy(id = "label_method_flatrate_flatrate")
    private WebElement txt_shippingMethod;

    @FindBy(css = ".button > span")
    private WebElement btn_next;

    public CheckoutPage(){
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

    public WebElement getTxt_customerCountry() {
        return txt_customerCountry;
    }

    public WebElement getTxt_customerRegion()  {
        return txt_region;
    }

    public WebElement getTxt_CustomerPostCode(){
        return txt_postCode;
    }

    public WebElement getTxt_customerTelephone() {
        return txt_telephone;
    }

    public WebElement getTxt_shippingMethod() {
        return txt_shippingMethod;
    }

    public WebElement getBtn_next(){
        return btn_next;
    }
}
