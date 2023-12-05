package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;

public class BagsPage extends Utility {
    By Overnight_Duffle = By.xpath("//a[normalize-space()='Overnight Duffle']");
    By overnightDuffleText = By.xpath("//span[@class='base']");
    By quantity = By.xpath("//input[@id='qty']");

    By addToCart = By.xpath("//button[@id='product-addtocart-button']");

    By successText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");

    public void clickOnOvernightDuffle(){
        clickOnElement(Overnight_Duffle);
    }

    public String getOvernightDuffleText(){
        return getTextFromElement(overnightDuffleText);
    }

    public void updateQuantity(String value){
        driver.findElement(quantity).clear();
        sendTextToElement(quantity,value);
    }
    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }

    public String getSuccessText(){
        return getTextFromElement(successText);
    }
    public void clickOnShoppingCart(){
        clickOnElement(shoppingCart);
    }
}
