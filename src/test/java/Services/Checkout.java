package Services;

public class Checkout {
    private final Pages.Checkout checkout;

    public Checkout(){

        checkout = new Pages.Checkout();
    }


    public void clickOnTxt_customerEmail() {
        checkout.getTxt_customerEmail().click();
    }
    public void sendKeysOnTxt_customerEmail(String email) {
        checkout.getTxt_customerEmail().sendKeys(email);
    }
    public void clickOnTxt_customerFirstName() {
        checkout.getTxt_customerFirstName().click();
    }
    public void sendKeysOnTxt_customerFirstName(String firstName) {
        checkout.getTxt_customerFirstName().sendKeys(firstName);
    }
    public void clickOnTxt_customerLastName() {
        checkout.getTxt_customerLastName().click();
    }
    public void sendKeysOnTxt_customerLastName(String lastName) {
        checkout.getTxt_customerLastName().sendKeys(lastName);
    }
    public void clickOnTxt_customerCompany() {
        checkout.getTxt_customerCompany().click();
    }
    public void sendKeysOnTxt_customerCompany(String company) {
        checkout.getTxt_customerCompany().sendKeys(company);
    }

    public void clickOnTxt_customerStreet0() {
        checkout.getTxt_customerStreet0().click();
    }
    public void sendKeysOnTxt_customerStreet0(String street0) {
        checkout.getTxt_customerStreet0().sendKeys(street0);
    }
}