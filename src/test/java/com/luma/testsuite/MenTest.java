package com.luma.testsuite;

import com.luma.pages.HomePage;
import com.luma.pages.MenPage;
import com.luma.pages.ShoppingCartPage;
import com.luma.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    HomePage homePage = new HomePage();
    MenPage menPage = new MenPage();
    ShoppingCartPage shoppingCart = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        Thread.sleep(1000);
        //Mouse Hover on Men Menu
        homePage.mouseHoverOnMenMenu();
        //Mouse Hover on Bottoms
        homePage.mouseHoverOnBottom();
        //Click on Pants
        homePage.clickOnPant();
        // Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32.
        menPage.mouseHoverOnCronusYogaPant();
        menPage.clickOnSize();
        //Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
        menPage.clickOnColor();
        //Mouse Hover on product name ‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.
        Thread.sleep(1000);
        //menPage.mouseHoverOnCronusYogaPant();
        menPage.mouseHoverOnCronusYogaPant();
        menPage.clickOnAddToCart();
        // Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        Assert.assertEquals(menPage.getTextAfterAddToCart(), "You added Cronus Yoga Pant to your shopping cart.");
        //Click on ‘shopping cart’ Link into message
        menPage.clickOnShoppingCart();
        //Verify the text ‘Shopping Cart.’
        Assert.assertEquals(shoppingCart.getShoppingCart(), "Shopping Cart");
        //Verify the product name ‘Cronus Yoga Pant’
        Assert.assertEquals(shoppingCart.getCronusYogaPantText(), "Cronus Yoga Pant");
        //Verify the product size ‘32’
        Assert.assertEquals(shoppingCart.getSizeText(), "32");
        //Verify the product colour ‘Black’
        Assert.assertEquals(shoppingCart.getColorText(), "Black");
    }


}
