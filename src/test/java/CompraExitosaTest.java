import DriverManager.DriverManager;
import pom.Pages.CheckoutPage;
import pom.Pages.PaymentPage;
import pom.Pages.ProductDetailPage;
import pom.Services.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.Pages.SuccesPage;

import static org.apache.commons.lang3.StringUtils.isNumeric;

public class CompraExitosaTest {

    @BeforeMethod
        public void setup(){
            DriverManager.create("chrome");
            DriverManager.getDriver().get("https://magento.softwaretestingboard.com/");
        }

        @Test
        public void realizarCompraExitosa(){
            HomePageServices homePageServices = new HomePageServices();
            ProductDetailPage productDetailPageElements = new ProductDetailPage();
            ProductDetailPageServices productDetailPageServices = new ProductDetailPageServices();
            CartPageServices cartPageServices = new CartPageServices();
            CheckoutPageServices checkoutPageServices = new CheckoutPageServices();
            CheckoutPage checkoutElements = new CheckoutPage();
            PaymentPage paymentPageElements = new PaymentPage();
            PaymentPageServices paymentPageServices = new PaymentPageServices();
            SuccesPage succesPageElements = new SuccesPage();
            SuccesPageServices succesPageServices = new SuccesPageServices();

            //Pasos para ejecutar la prueba
            //2. Seleccionar la prenda "Radiant Tee".
            homePageServices.clickOnTxt_product();

            //3. Configurar las opciones de la prenda:
            //a. Tamaño: L
            DriverManager.getWaitUntilVisibility(productDetailPageElements.getTxt_largeSize());
            productDetailPageServices.clickOnTxt_largeSize();

            //b. Color: Azul
            DriverManager.getWaitUntilVisibility(productDetailPageElements.getTxt_blueColor());
            productDetailPageServices.clickOnTxt_blueColor();

            //c. Cantidad: 2
            productDetailPageServices.setQuantity("2");

            //4. Hacer clic en "Add to Cart".
            productDetailPageServices.clickOnTxt_addToCart();

            //5. Hacer clic en el enlace "shopping cart".
            DriverManager.getWaitUntilVisibility(productDetailPageElements.getTxt_linkShoppingCart());
            productDetailPageServices.clickOnTxt_linkShoppingCart();

            //6. Hacer clic en "Proceed to Checkout".
            cartPageServices.clickOnBtn_proceedToCheckout();

            //7. Completar el formulario de dirección de envío con los datos deseados.
            DriverManager.getWaitUntilVisibility(checkoutElements.getTxt_customerEmail());
            checkoutPageServices.clickOnTxt_customerEmail();
            checkoutPageServices.sendKeysOnTxt_customerEmail("testNicoPruebaAutomatizada34464706@test.com");
            checkoutPageServices.sendKeysOnTxt_customerFirstName("firstnameTest");
            checkoutPageServices.sendKeysOnTxt_customerLastName("lastnameTest");
            checkoutPageServices.sendKeysOnTxt_customerCompany("companyTest");
            checkoutPageServices.sendKeysOnTxt_customerStreet0("street0Test");
            checkoutPageServices.sendKeysOnTxt_customerCity("testCity");
            checkoutPageServices.selectOnTxt_customerCountry("Argentina");
            DriverManager.getWaitUntilVisibility(checkoutElements.getTxt_customerRegion());
            checkoutPageServices.sendKeysOnTxt_customerRegion("regionTest");
            checkoutPageServices.sendKeysOnTxt_customerTelephone("3454000001");
            checkoutPageServices.sendKeysOnTxt_customerPostCode("3200");

            //8. Seleccionar la primera opción en los Métodos de Envío.
            checkoutPageServices.clickOnTxt_shippingMethod();

            //9. Hacer clic en "Next".
            checkoutPageServices.clickOnBtn_next();

            //10. Hacer clic en "Place Order".
            DriverManager.getWaitUntilVisibility(paymentPageElements.getBtn_placeOrder());
            paymentPageServices.clickOnBtn_placeOrder();

            //Validaciones
            //El titulo es igual a "Thank you for purchase!"
            DriverManager.getWaitUntilTextToBePresent(succesPageElements.getTxt_succesTitle(), "Thank you for your purchase!");
            Assert.assertEquals(succesPageServices.getTxt_succesTitleText(), "Thank you for your purchase!", "El titulo no es correcto");

            //- El boton "Continue Shopping" esta habilitado.
            Assert.assertTrue(succesPageElements.getBtn_continueShopping().isEnabled(),"El boton Continue Shopping no esta habilitado.");

            //- El boton "Create an Account" esta visible.
            DriverManager.getWaitUntilVisibility(succesPageElements.getBtn_createAnAccount());
            Assert.assertTrue(succesPageElements.getBtn_createAnAccount().isDisplayed(), "El boton Create an Account no està visible.");

            //- El nùmero de la orden (Your order # is:) es un numero (en la captura de
            //ejemplo es el 000026889). Pista, mediante el metodo split() de la clase
            //String, podra separar to.do el texto en palabras.
            Assert.assertTrue(isNumeric(succesPageServices.getTxt_orderNumber()), "El valor de vuelto en 'Order' no es un numero");
        }
}
