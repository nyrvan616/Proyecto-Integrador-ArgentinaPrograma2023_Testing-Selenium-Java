package Services;

import DriverManager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartMenu {
    private final Pages.CartMenu cartMenu;

    public CartMenu(){

        cartMenu = new Pages.CartMenu();
    }


    public void clickOnTxt_checkout() {
        cartMenu.getTxt_checkout().click(); }
    }