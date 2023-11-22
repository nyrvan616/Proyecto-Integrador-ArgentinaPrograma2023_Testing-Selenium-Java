package Tests;

import DriverManager.DriverManager;
import Services.CartMenu;
import Services.HomePage;
import Services.ProductDetailPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
            Services.CartMenu cartMenu = new CartMenu();

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
            Assert.assertEquals(3,2 );
            //4. Hacer clic en "Add to Cart".
            productDetailPage.clickOnTxt_addToCart();
            //5. Hacer clic en el enlace "shopping cart".
            productDetailPage.clickOnTxt_topCart();
            //6. Hacer clic en "Proceed to Checkout".
            cartMenu.clickOnTxt_checkout();
            //7. Completar el formulario de dirección de envío con los datos deseados.

            //8. Seleccionar la primera opción en los Métodos de Envío.
            //9. Hacer clic en "Next".
            //10. Hacer clic en "Place Order".
        }
}
