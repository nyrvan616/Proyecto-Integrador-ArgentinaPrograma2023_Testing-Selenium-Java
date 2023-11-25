package pom.Services;

import DriverManager.DriverManager;
import pom.Pages.CheckoutPage;
import org.openqa.selenium.By;

public class CheckoutPageServices {
    private final CheckoutPage checkout;

    public CheckoutPageServices(){

        checkout = new CheckoutPage();
    }


    public void clickOnTxt_customerEmail() {
        checkout.getTxt_customerEmail().click();
    }
    public void sendKeysOnTxt_customerEmail(String email) {
        checkout.getTxt_customerEmail().sendKeys(email);
    }
    public void sendKeysOnTxt_customerFirstName(String firstName) {
        checkout.getTxt_customerFirstName().sendKeys(firstName);
    }
    public void sendKeysOnTxt_customerLastName(String lastName) {
        checkout.getTxt_customerLastName().sendKeys(lastName);
    }
    public void sendKeysOnTxt_customerCompany(String company) {
        checkout.getTxt_customerCompany().sendKeys(company);
    }

    public void sendKeysOnTxt_customerStreet0(String street0) {
        checkout.getTxt_customerStreet0().sendKeys(street0);
    }

    public void sendKeysOnTxt_customerCity(String city){
        checkout.getTxt_customerCity().sendKeys(city);
    }

    public void sendKeysOnTxt_customerRegion(String state){
        checkout.getTxt_customerRegion().sendKeys(state);
    }

    public void selectOnTxt_customerCountry(String country){
        checkout.getTxt_customerCountry().findElement(By.xpath("//option[. = '"+country+"']")).click();
    }

    public void sendKeysOnTxt_customerPostCode(String postcode){
        checkout.getTxt_CustomerPostCode().sendKeys(postcode);
    }

    public void sendKeysOnTxt_customerTelephone(String telephone){
        checkout.getTxt_customerTelephone().sendKeys(telephone);
    }

    public void clickOnTxt_shippingMethod(){
        DriverManager.getWaitUntilVisibility(checkout.getTxt_shippingMethod());
        checkout.getTxt_shippingMethod().click();
    }

    public void clickOnBtn_next(){
        checkout.getBtn_next().click();
    }
}