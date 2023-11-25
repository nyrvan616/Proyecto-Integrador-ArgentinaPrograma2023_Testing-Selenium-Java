package pom.Services;

import pom.Pages.ProductDetailPage;

public class ProductDetailPageServices {
    private final ProductDetailPage productDetailPage;

    public ProductDetailPageServices(){

        productDetailPage = new ProductDetailPage();
    }

    public void clickOnTxt_largeSize(){
        productDetailPage.getTxt_largeSize().click();
    }
    public void clickOnTxt_blueColor(){
        productDetailPage.getTxt_blueColor().click();
    }

    public void setQuantity(CharSequence qty){
        productDetailPage.getTxt_Quantity().clear();
        productDetailPage.getTxt_Quantity().sendKeys(qty);
    }

    public void clickOnTxt_addToCart(){
        productDetailPage.getTxt_addToCart().click();
    }
    public void clickOnTxt_linkShoppingCart(){
        productDetailPage.getTxt_linkShoppingCart().click();
    }

}