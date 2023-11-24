import DriverManager.DriverManager;
import Services.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.Serial;

public class compraExitosa {

    @BeforeMethod
        public void setup(){
            DriverManager.create("chrome");
            DriverManager.getDriver().get("https://magento.softwaretestingboard.com/");
        }

        @Test
        public void CompraExitosa(){
            Services.HomePage homePage = new HomePage();
            Services.ProductDetailPage productDetailPage = new ProductDetailPage();
            Services.CartPage cartPage = new CartPage();
            Services.Checkout checkoutPage = new Checkout();
            Services.PaymentPage paymentPage = new PaymentPage();
            Pages.SuccesPage succesPageElements = new Pages.SuccesPage();
            Services.SuccesPage succesPageServices = new Services.SuccesPage();

            //Pasos para ejecutar la prueba
            //2. Seleccionar la prenda "Radiant Tee".
            homePage.clickOnTxt_product();

            //3. Configurar las opciones de la prenda:
            //a. Tamaño: L
            productDetailPage.clickOnTxt_largeSize();
            //b. Color: Azul
            productDetailPage.clickOnTxt_blueColor();
            //c. Cantidad: 2
            productDetailPage.setQuantity("2");

            //4. Hacer clic en "Add to Cart".
            productDetailPage.clickOnTxt_addToCart();

            //5. Hacer clic en el enlace "shopping cart".
            productDetailPage.clickOnTxt_linkShoppingCart();

            //6. Hacer clic en "Proceed to Checkout".
            cartPage.clickOnBtn_proceedToCheckout();

            //7. Completar el formulario de dirección de envío con los datos deseados.
            checkoutPage.clickOnTxt_customerEmail();
            checkoutPage.sendKeysOnTxt_customerEmail("test@test.com");
            checkoutPage.sendKeysOnTxt_customerFirstName("firstnameTest");
            checkoutPage.sendKeysOnTxt_customerLastName("lastnameTest");
            checkoutPage.sendKeysOnTxt_customerCompany("companyTest");
            checkoutPage.sendKeysOnTxt_customerStreet0("street0Test");
            checkoutPage.sendKeysOnTxt_customerCity("testCity");
            checkoutPage.selectOnTxt_customerCountry("Argentina");
            checkoutPage.sendKeysOnTxt_customerRegion("regionTest");
            checkoutPage.sendKeysOnTxt_customerTelephone("3454000001");
            checkoutPage.sendKeysOnTxt_customerPostCode("3200");

            //8. Seleccionar la primera opción en los Métodos de Envío.
            checkoutPage.clickOnTxt_shippingMethod();
            //9. Hacer clic en "Next".
            checkoutPage.clickOnBtn_next();
            //10. Hacer clic en "Place Order".
            paymentPage.clickOnBtn_placeOrder();

            //Validaciones
            //El titulo es igual a "Thank you for purchase!"
            DriverManager.getWaitUntilTextToBePresent(succesPageElements.getTxt_succesTitle(), "Thank you for your purchase!");
            Assert.assertEquals(succesPageServices.getTxt_succesTitleText(), "Thank you for your purchase!");

            //- El boton "Continue Shopping" esta habilitado.
            //- El boton "Create an Account" esta visible.
            //- El nùmero de la orden (Your order # is:) es un numero (en la captura de
            //ejemplo es el 000026889). Pista, mediante el metodo split() de la clase
            //String, podra separar todo el texto en palabras.
        }
}
