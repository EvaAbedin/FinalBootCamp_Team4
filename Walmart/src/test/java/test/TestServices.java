package test;

import base.CommonAPI;
import homePage.Services;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestServices extends CommonAPI {

    @Test
    public void test31() throws InterruptedException {
        Services homePage = PageFactory.initElements(driver, Services.class);
        homePage.getWalmartLogo();
        homePage.getServices();
        homePage.getAllServices();
        waitFor(3);}
    @Test
    public void test32() throws InterruptedException {
        Services homePage = PageFactory.initElements(driver, Services.class);
        homePage.getWalmartLogo();
        homePage.getServices();
        homePage.getAllServices();
        homePage.getCustomCakes();
        waitFor(3);}
    @Test
    public void test33() throws InterruptedException {
        Services homePage = PageFactory.initElements(driver, Services.class);
        homePage.getWalmartLogo();
        homePage.getServices();
        homePage.getAllServices();
        homePage.getRegistryListsandGifts();
        waitFor(3);}
    @Test
    public void test34() throws InterruptedException {
        Services homePage = PageFactory.initElements(driver, Services.class);
        homePage.getServices();
        homePage.getAllServices();
        homePage.getHealthServices();
        homePage.getPharmacy();
        waitFor(3);}
        @Test
        public void test35() throws InterruptedException {
            Services homePage = PageFactory.initElements(driver, Services.class);
            homePage.getServices();
            homePage.getAllServices();
            homePage.getHealthServices();
            homePage.getPharmacy();
            homePage.getRxTransfers();
            waitFor(3);}
    @Test
    public void test36() throws InterruptedException {
        Services homePage = PageFactory.initElements(driver, Services.class);
        homePage.getServices();
        homePage.getAllServices();
        homePage.getHealthServices();
        homePage.getPharmacy();
        homePage.getRxTransfers();
        homePage.getSignin();
        waitFor(3);}
    @Test
    public void test37() throws InterruptedException {
        Services homePage = PageFactory.initElements(driver, Services.class);
        homePage.getServices();
        homePage.getAllServices();
        homePage.getHealthServices();
        homePage.getPharmacy();
        homePage.getRxTransfers();
        homePage.getCreateNewAccount();
        waitFor(3);}
    @Test
    public void test38() throws InterruptedException {
        Services homePage = PageFactory.initElements(driver, Services.class);
        homePage.getServices();
        homePage.getAllServices();
        homePage.getHealthServices();
        homePage.getPharmacy();
        homePage.getRxTransfers();
        homePage.getCreateNewAccount();
        homePage.getPrivacyNotice();
        waitFor(3);}
    @Test
    public void test39() throws InterruptedException {
        Services homePage = PageFactory.initElements(driver, Services.class);
        homePage.getServices();
        homePage.getAllServices();
        homePage.getHealthServices();
        homePage.getPharmacy();
        homePage.getRxTransfers();
        homePage.getCreateNewAccount();
        homePage.getLeavePharmacy();
        waitFor(3);}


}
