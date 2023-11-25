package pom.Pages;
import DriverManager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @FindBy(xpath = "//img[@alt='Radiant Tee']")
    private WebElement txt_product;


    public HomePage(){
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    public WebElement getTxt_product() {
        return txt_product;
    }
}
