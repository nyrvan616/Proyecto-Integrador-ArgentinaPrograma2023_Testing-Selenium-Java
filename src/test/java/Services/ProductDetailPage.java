package Services;

import DriverManager.DriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductDetailPage {
    private final Pages.ProductDetailPage productDetailPage;

    public ProductDetailPage(){

        productDetailPage = new Pages.ProductDetailPage();
    }

    public void clickOnTxt_largeSize(){
        DriverManager.getWaitUntilVisibility(productDetailPage.getTxt_largeSize());
        productDetailPage.getTxt_largeSize().click();
    }
    public void clickOnTxt_blueColor(){
        productDetailPage.getTxt_blueColor().click();
    }

    public void setQuantity(CharSequence qty){
        productDetailPage.getTxt_Quantity().clear();
        productDetailPage.getTxt_Quantity().sendKeys(qty);
    }

    public void getQuantity(){
        productDetailPage.getTxt_Quantity().getText();
    }

    public void clickOnTxt_addToCart(){
        productDetailPage.getTxt_addToCart().click();
    }
    public void clickOnTxt_linkShoppingCart(){
        WebDriverWait wait = DriverManager.getWait();
        wait.until(ExpectedConditions.visibilityOf(productDetailPage.getTxt_linkShoppingCart()));
        productDetailPage.getTxt_linkShoppingCart().click();
    }

}