package test;

import base.CommonAPI;
import homePage.Cart;
import homePage.PopularServices;
import homePage.Services;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestPopularServices extends CommonAPI {
    @Test
    public void test51() throws InterruptedException {
        PopularServices homePage = PageFactory.initElements(driver, PopularServices.class);
        homePage.getViewAll();
        homePage.getPharmacy();
        homePage.getAutoCareCenter();
        homePage.getCustomCakes();
        waitFor(3);}
    @Test
    public void test52() throws InterruptedException {
        PopularServices homePage = PageFactory.initElements(driver, PopularServices.class);
        homePage.getViewAll();
        homePage.getPharmacy();
        homePage.getAutoCareCenter();
        homePage.getCustomCakes();
        homePage.getFinancialServices();
        waitFor(3);}
    @Test
    public void test53() throws InterruptedException {
        PopularServices homePage = PageFactory.initElements(driver, PopularServices.class);
        homePage.getViewAll();
        homePage.getPharmacy();
        homePage.getAutoCareCenter();
        homePage.getCustomCakes();
        homePage.getFinancialServices();
        homePage.getMoneyTransfers();
        waitFor(3);}
    @Test
    public void test54() throws InterruptedException {
        PopularServices homePage = PageFactory.initElements(driver, PopularServices.class);
        homePage.getViewAll();
        homePage.getPharmacy();
        homePage.getAutoCareCenter();
        homePage.getCustomCakes();
        homePage.getFinancialServices();
        homePage.getMoneyTransfers();
        homePage.getDomestic();
        waitFor(3);}
    @Test
    public void test55() throws InterruptedException {
        PopularServices homePage = PageFactory.initElements(driver, PopularServices.class);
        homePage.getViewAll();
        homePage.getPharmacy();
        homePage.getAutoCareCenter();
        homePage.getautoBying();
        waitFor(3);}
    @Test
    public void test56() throws InterruptedException {
        PopularServices homePage = PageFactory.initElements(driver, PopularServices.class);
        homePage.getViewAll();
        homePage.getPharmacy();
        homePage.getAutoCareCenter();
        homePage.getautoBying();
        homePage.getcarSaver();
        waitFor(3);}
    @Test
    public void test57() throws InterruptedException {
        PopularServices homePage = PageFactory.initElements(driver, PopularServices.class);
        homePage.getViewAll();
        homePage.getPharmacy();
        homePage.getAutoCareCenter();
        homePage.getautoBying();
        homePage.getcarSaver();
        homePage.getFinance();
        waitFor(3);}
    @Test
    public void test58() throws InterruptedException {
        PopularServices homePage = PageFactory.initElements(driver, PopularServices.class);
        homePage.getViewAll();
        homePage.getPharmacy();
        homePage.getAutoCareCenter();
        homePage.getautoBying();
        homePage.getcarSaver();
        homePage.getFinance();
        homePage.getHowItWorks();
        waitFor(3);}
    @Test
    public void test59() throws InterruptedException {
        PopularServices homePage = PageFactory.initElements(driver, PopularServices.class);
        homePage.getViewAll();
        homePage.getPharmacy();
        homePage.getAutoCareCenter();
        homePage.getautoBying();
        homePage.getcarSaver();
        homePage.getFinance();
        homePage.getHowItWorks();
        homePage.getGetStarted();
        waitFor(3);}
    @Test
    public void test60() throws InterruptedException {
        PopularServices homePage = PageFactory.initElements(driver, PopularServices.class);
        homePage.getViewAll();
        homePage.getPharmacy();
        homePage.getAutoCareCenter();
        homePage.getautoBying();
        homePage.getcarSaver();
        homePage.getFinance();
        homePage.getHowItWorks();
        homePage.getSignIn();
        waitFor(3);}











}
