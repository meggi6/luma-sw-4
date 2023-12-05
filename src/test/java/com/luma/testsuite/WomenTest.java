package com.luma.testsuite;

import com.luma.pages.HomePage;
import com.luma.pages.Womenpage;
import com.luma.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomenTest extends BaseTest {

    HomePage homePage = new HomePage();
    Womenpage womenPage = new Womenpage();

    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {

        //Mouse Hover on Women Menu
        homePage.mouseHoverOnWomenMenu();
        //Mouse Hover on Tops
        homePage.mouseHoverOnTops();
        //Click on Jackets
        homePage.clickOnJackets();
        //Select Sort By filter “Product Name”
        womenPage.selectProductNameFilter("name");
        //Verify the products name display in alphabetical order
        Assert.assertEquals(womenPage.getProductList1(), womenPage.getProductList2());

    }

    @Test
    public void verifyTheSortByPriceFilter() {
        //Mouse Hover on Women Menu
        homePage.mouseHoverOnWomenMenu();
        //Mouse Hover on Tops
        homePage.mouseHoverOnTops();
        //Click on Jackets
        homePage.clickOnJackets();
        //Select Sort By filter “Price”
        womenPage.selectProductNameFilter("price");
        //Verify the products price display in Low to High
        Assert.assertEquals(womenPage.getProductPriceList1(), womenPage.getProductPriceList2());
    }
}
