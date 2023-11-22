package Services;

public class CartMenu {
    private final Pages.CartMenu cartMenu;

    public CartMenu(){

        cartMenu = new Pages.CartMenu();
    }


    public void clickOnTxt_checkout() {
        cartMenu.getTxt_checkout().click(); };
    }