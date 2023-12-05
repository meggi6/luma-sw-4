package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;

public class MenPage extends Utility {
    By cronusYogaPant = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By size32 = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']");
    By color = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']");
    //By addToCart = By.xpath("//span[contains(text(),'Add to Cart')])[1]");
    By addToCart = By.xpath("//main[@id='maincontent']/div[3]/div[1]/div[3]/ol/li[1]/div/div/div[3]/div/div[1]/form/button/span");
    By addToCartText =By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");

    public void mouseHoverOnCronusYogaPant()
    {
        mouseHoverToElement(cronusYogaPant);
    }

    public void clickOnSize()
    {
        mouseHoverToElementAndClick(size32);
    }

    public void clickOnColor()
    {
        mouseHoverToElementAndClick(color);
    }

    public void clickOnAddToCart()
    {
        clickOnElement(addToCart);
    }

    public String getTextAfterAddToCart()
    {
        return getTextFromElement(addToCartText);
    }

    public void clickOnShoppingCart()
    {
        clickOnElement(shoppingCart);
    }
}
