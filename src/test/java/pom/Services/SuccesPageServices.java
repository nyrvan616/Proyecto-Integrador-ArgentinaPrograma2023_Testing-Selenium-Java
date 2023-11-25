package pom.Services;


import pom.Pages.SuccesPage;

public class SuccesPageServices {
    private final SuccesPage succesPage;

    public SuccesPageServices(){

        succesPage = new SuccesPage();
    }


    public String getTxt_succesTitleText() {
        return succesPage.getTxt_succesTitle().getText();
    }

    public String getTxt_orderNumber() { return succesPage.getTxt_numeroDeOrden().getText(); }
}