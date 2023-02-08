package com.Ascom.step_definitions;

import com.Ascom.pages.Main;
import com.Ascom.utilities.ConfigurationReader;
import com.Ascom.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AddItem_stepDefinintions {

    Main mainPage = new Main();
    WebDriverWait wait = new WebDriverWait(Driver.get(),10);

    @Given("I am on the Blue Origin shopping page")
    public void i_am_on_the_blue_origin_shopping_page() {

        Driver.get().get(ConfigurationReader.getProperty("environment"));



    }

    @When("I go to shop all new page")
    public void iGoToShopAllNewPage() {
        Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        mainPage.shopAllNewBtn.click();


    }
    @When("I add an item to my cart")
    public void i_add_an_item_to_my_cart() {
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(mainPage.hoddieVarsity);
        wait.until(ExpectedConditions.visibilityOf(mainPage.hoddieVarsity));
        mainPage.hoddieVarsity.sendKeys(Keys.ENTER);
        mainPage.addToChartBtn.click();


    }
    @And("the item should appear in my cart")
    public void the_item_should_appear_in_my_cart() {
        WebDriverWait wait = new WebDriverWait(Driver.get(),10);
        wait.until(ExpectedConditions.visibilityOf(mainPage.viewMyCartBtn));
        mainPage.viewMyCartBtn.click();

        List<String>productsName = new ArrayList<>();
        for (WebElement each : mainPage.products) {
            productsName.add(each.getText());
        }
        System.out.println(productsName);
    }



}

