package testhome;

import base.CommonAPI;
import home.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestMainPage extends CommonAPI {

    @Test
    public void test1() throws InterruptedException {
        MainPage home = PageFactory.initElements(driver, MainPage.class);
        home.getUnitedHealthCareLogo();
        home.getIndividual();
        waitFor(1);
    }
    @Test
    public void test2() throws InterruptedException {
        MainPage home = PageFactory.initElements(driver, MainPage.class);
        home.getMedicare();
        home.getUnitedHealthCareLogo();
        waitFor(3);
    }
    @Test
    public void test3() throws InterruptedException {
        MainPage home = PageFactory.initElements(driver, MainPage.class);
        home.getUnitedHealthCareLogo();
        home.getForProviders();
        waitFor(3);
    }





}

