package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    By shoppingCartText = By.xpath("//span[@class='base']");

    By cronusYogaPant = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By size = By.xpath("//dd[contains(text(),'32')]");
    By color = By.xpath("//dd[contains(text(),'Black')]");

    By productNameOvernightDuffle = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
    By quantityText = By.xpath("//input[@title='Qty']");
    By productPrice = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']");
    By quantity = By.cssSelector(".input-text.qty");
    By updateCart = By.xpath("//span[normalize-space()='Update Shopping Cart']");
    By updatedProductPrice=By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']");

    public String getShoppingCart()
    {
        return getTextFromElement(shoppingCartText);
    }
    public String getCronusYogaPantText()
    {
        return getTextFromElement(cronusYogaPant);
    }
    public String getSizeText()
    {
        return getTextFromElement(size);
    }
    public String getColorText()
    {
        return getTextFromElement(color);
    }

    public String getProductNameText() {
        return getTextFromElement(productNameOvernightDuffle);
    }

    public void getQuantityText(String value) {
        getTextFromElement(quantityText);
    }

    public String getProductPriceText() {
        return getTextFromElement(productPrice);
    }

    public void updateQuantity(String value) {
        driver.findElement(quantity).clear();
        sendTextToElement(quantity, value);
    }

    public void clickOnUpdateCart() {
        clickOnElement(updateCart);
    }
    public String getUpdatedProductPrice()
    {
        return getTextFromElement(updatedProductPrice);
    }
}
