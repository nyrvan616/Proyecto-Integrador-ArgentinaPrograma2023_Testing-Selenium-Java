package Services;

import DriverManager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkout {
    private final Pages.Checkout checkout;

    public Checkout(){

        checkout = new Pages.Checkout();
    }


    public void clickOnTxt_customerEmail() {

        WebDriverWait wait = DriverManager.getWait();
        wait.until(ExpectedConditions.visibilityOf(checkout.getTxt_customerEmail()));
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
        WebDriverWait wait = DriverManager.getWait();
        wait.until(ExpectedConditions.visibilityOf(checkout.getTxt_customerRegion()));
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
        checkout.getTxt_shippingMethod().click();
    }

    public void clickOnBtn_next(){
        checkout.getBtn_next().click();
    }
}