package Pages;
import DriverManager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SuccesPage {
    @FindBy(xpath = "//h1/span")
    private WebElement txt_succesTitle;

    public SuccesPage(){

        PageFactory.initElements(DriverManager.getDriver(), this);

    }

    public WebElement getTxt_succesTitle() {
        return txt_succesTitle;
    }
}
