package Services;

public class ProductDetailPage {
    private final Pages.ProductDetailPage productDetailPage;

    public ProductDetailPage(){

        productDetailPage = new Pages.ProductDetailPage();
    }

    public void clickOnTxt_largeSize(){
        productDetailPage.getTxt_largeSize().click();
    }
    public void clickOnTxt_blueColor(){
        productDetailPage.getTxt_blueColor().click();
    }

    public void setQuantity(CharSequence qty){
        productDetailPage.getTxt_Quantity().sendKeys(qty);
    }

    public void getQuantity(){
        productDetailPage.getTxt_Quantity().getText();
    }

    public void clickOnTxt_addToCart(){
        productDetailPage.getTxt_addToCart().click();
    }

    public void clickOnTxt_topCart() {
        productDetailPage.getTxt_topCart().click();
    }

}