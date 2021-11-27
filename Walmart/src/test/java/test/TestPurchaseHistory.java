package test;

import base.CommonAPI;
import homePage.Home;
import homePage.LogIn;
import homePage.PurchaseHistory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestPurchaseHistory extends CommonAPI {

    @Test
    public void test61() throws InterruptedException {
        PurchaseHistory homePage = PageFactory.initElements(driver, PurchaseHistory.class);
        homePage.getPurchaseHistory();
        waitFor(3);}
    @Test
    public void test62() throws InterruptedException {
        PurchaseHistory homePage = PageFactory.initElements(driver, PurchaseHistory.class);
        homePage.getPurchaseHistory();
        homePage.getEmailAdd();
        waitFor(3);}
    @Test
    public void test63() throws InterruptedException {
        PurchaseHistory homePage = PageFactory.initElements(driver, PurchaseHistory.class);
        homePage.getPurchaseHistory();
        homePage.getEmailAdd();
        homePage.getOderNumber();
        waitFor(3);}
    @Test
    public void test64() throws InterruptedException {
        PurchaseHistory homePage = PageFactory.initElements(driver, PurchaseHistory.class);
        homePage.getPurchaseHistory();
        homePage.getEmailAdd();
        homePage.getOderNumber();
        homePage.getViewOrderStatus();
        waitFor(3);}
    @Test
    public void test65() throws InterruptedException {
        PurchaseHistory homePage = PageFactory.initElements(driver, PurchaseHistory.class);
        homePage.getPurchaseHistory();
        homePage.getEmailAdd();
        homePage.getOderNumber();
        homePage.getViewOrderStatus();
        homePage.getSignIn();
        waitFor(3);}
    @Test
    public void test66() throws InterruptedException {
        PurchaseHistory homePage = PageFactory.initElements(driver, PurchaseHistory.class);
        homePage.getPurchaseHistory();
        homePage.getPrivacyPolicy();
        waitFor(3);}
    @Test
    public void test67() throws InterruptedException {
        PurchaseHistory homePage = PageFactory.initElements(driver, PurchaseHistory.class);
        homePage.getPurchaseHistory();
        homePage.getPrivacyPolicy();
        homePage.getSpanish();
        waitFor(3);}
    @Test
    public void test68() throws InterruptedException {
        PurchaseHistory homePage = PageFactory.initElements(driver, PurchaseHistory.class);
        homePage.getPurchaseHistory();
        homePage.getPrivacyPolicy();
        homePage.getDoNotSellPersonalInformation();
        waitFor(3);}
    @Test
    public void test70() throws InterruptedException {
        PurchaseHistory homePage = PageFactory.initElements(driver, PurchaseHistory.class);
        homePage.getPurchaseHistory();
        homePage.getPrivacyPolicy();
        homePage.getDoNotSellPersonalInformation();
        homePage.getRequestMyPersonalInformation();
        waitFor(3);}
    @Test
    public void test71() throws InterruptedException {
        PurchaseHistory homePage = PageFactory.initElements(driver, PurchaseHistory.class);
        homePage.getPurchaseHistory();
        homePage.getPrivacyPolicy();
        homePage.getDoNotSellPersonalInformation();
        homePage.getRequestMyPersonalInformation();
        homePage.getHelp();
        waitFor(3);}
    @Test
    public void test72() throws InterruptedException {
        PurchaseHistory homePage = PageFactory.initElements(driver, PurchaseHistory.class);
        homePage.getPurchaseHistory();
        homePage.getPrivacyPolicy();
        homePage.getDoNotSellPersonalInformation();
        homePage.getRequestMyPersonalInformation();
        homePage.getHelp();
        homePage.getTermsOfUse();
        waitFor(3);}

}
