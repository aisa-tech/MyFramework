package com.Ascom.pages;

import com.Ascom.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Main {
    public Main() {
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(xpath = "(//a[@href='/collections/new'])[3]")
    public WebElement shopAllNewBtn;

    @FindBy(xpath = "//a[@id='CardLink-template--16601640665328__product-grid-8111703130352']")
    public WebElement hoddieVarsity;

    @FindBy(xpath = "//button[@name='add']")
    public WebElement addToChartBtn;

    @FindBy(xpath = "//a[@id='cart-notification-button']")
    public WebElement viewMyCartBtn;

    @FindBy(xpath = "//tbody//tr//td[@class='cart-item__details']//a")
    public List<WebElement>products;







}
