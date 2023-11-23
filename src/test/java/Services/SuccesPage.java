package Services;


import DriverManager.DriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SuccesPage {
    private final Pages.SuccesPage succesPage;

    public SuccesPage(){

        succesPage = new Pages.SuccesPage();
    }


    public void getTxt_succesTitle() {
        succesPage.getTxt_succesTitle().getText();
    }
    }