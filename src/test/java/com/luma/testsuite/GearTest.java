package com.luma.testsuite;

import com.luma.pages.BagsPage;
import com.luma.pages.HomePage;
import com.luma.pages.ShoppingCartPage;
import com.luma.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {

    HomePage homePage = new HomePage();
    BagsPage bagPage = new BagsPage();
    ShoppingCartPage shoppingCart = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() throws InterruptedException {
        Thread.sleep(3000);
        //Mouse Hover on Gear Menu
        homePage.mouseHoverOnGearMenu();
        //Click on Bags
        homePage.clickOnBags();
        //Click on Product Name ‘Overnight Duffle’
        bagPage.clickOnOvernightDuffle();
        // Verify the text ‘Overnight Duffle’ Change Qty 3
        String expectedText = "Overnight Duffle";
        String actualText = bagPage.getOvernightDuffleText();
        Assert.assertEquals(expectedText, actualText);
        //change qty 3
        bagPage.updateQuantity("3");
        //Click on ‘Add to Cart’ Button.
        bagPage.clickOnAddToCart();
        //Verify the text ‘You added Overnight Duffle to your shopping cart.’
        String expectedMeassge = "You added Overnight Duffle to your shopping cart.";
        String actualMeassge = bagPage.getSuccessText();
        Assert.assertEquals(expectedMeassge, actualMeassge);
        //Click on ‘shopping cart’ Link into message
        bagPage.clickOnShoppingCart();
        // Verify the product name ‘Overnight Duffle’
        String expectedProductName = "Overnight Duffle";
        String actualProductName = shoppingCart.getProductNameText();
        Assert.assertEquals(expectedProductName,actualProductName);
        //Verify the Qty is ‘3’
        shoppingCart.getQuantityText("3");
        //Verify the product price ‘$135.00’
        String expectedProductPrice = "$135.00";
        String actualProductPrice = shoppingCart.getProductPriceText();
        Assert.assertEquals(expectedProductPrice, actualProductPrice);
        //Change Qty to ‘5’
        shoppingCart.updateQuantity("5");
        //Click on ‘Update Shopping Cart’ button
        shoppingCart.clickOnUpdateCart();
        //Verify the product price ‘$225.00’
        String expectedProductPrice1 = "$225.00";
        String actualProductPrice1 = shoppingCart.getUpdatedProductPrice();
        Assert.assertEquals(expectedProductPrice1, actualProductPrice1);
    }
}
