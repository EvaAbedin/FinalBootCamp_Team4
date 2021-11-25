package test;

import base.CommonAPI;
import homePage.Cart;
import homePage.Services;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestCart extends CommonAPI {

    @Test
    public void test41() throws InterruptedException {
        Cart homePage = PageFactory.initElements(driver, Cart.class);
        homePage.getCart();
        homePage.getShopGrocery();
        homePage.getShopElectronics();
        waitFor(3);}
    @Test
    public void test42() throws InterruptedException {
        Cart homePage = PageFactory.initElements(driver, Cart.class);
        homePage.getCart();
        homePage.getShopGrocery();
        homePage.getHolidayMeal();
        homePage.getTurkey();
        waitFor(3);}
    @Test
    public void test43() throws InterruptedException {
        Cart homePage = PageFactory.initElements(driver, Cart.class);
        homePage.getCart();
        homePage.getShopGrocery();
        homePage.getHolidayMeal();
        homePage.getTurkey();
        homePage.getAddToCart();
        waitFor(3);}
    @Test
    public void test44() throws InterruptedException {
        Cart homePage = PageFactory.initElements(driver, Cart.class);
        homePage.getCart();
        homePage.getShopElectronics();
        homePage.getAllTvs();
        homePage.getTvsBySize();
        waitFor(3);}
    @Test
    public void test45() throws InterruptedException {
        Cart homePage = PageFactory.initElements(driver, Cart.class);
        homePage.getCart();
        homePage.getShopElectronics();
        homePage.getAllTvs();
        homePage.getTvsBySize();
        homePage.getAllFilters();
        homePage.getGifting();
        waitFor(3);}
    @Test
    public void test46() throws InterruptedException {
        Cart homePage = PageFactory.initElements(driver, Cart.class);
        homePage.getCart();
        homePage.getShopElectronics();
        homePage.getAllTvs();
        homePage.getTvsBySize();
        homePage.getAllFilters();
        homePage.getGifting();
        homePage.getViewResults();
        waitFor(3);}
    @Test
    public void test47() throws InterruptedException {
        Cart homePage = PageFactory.initElements(driver, Cart.class);
        homePage.getCart();
        homePage.getShopElectronics();
        homePage.getAllTvs();
        homePage.getTvsBySize();
        homePage.getAllFilters();
        homePage.getGifting();
        homePage.getViewResults();
        homePage.getGermmantownSupercenter();
        waitFor(3);}
    @Test
    public void test48() throws InterruptedException {
        Cart homePage = PageFactory.initElements(driver, Cart.class);
        homePage.getCart();
        homePage.getShopElectronics();
        homePage.getAllTvs();
        homePage.getTvsBySize();
        homePage.getAllFilters();
        homePage.getGifting();
        homePage.getViewResults();
        homePage.getGermmantownSupercenter();
        homePage.getAddToRegistry();
        waitFor(3);}
    @Test
    public void test49() throws InterruptedException {
        Cart homePage = PageFactory.initElements(driver, Cart.class);
        homePage.getCart();
        homePage.getShopElectronics();
        homePage.getAllTvs();
        homePage.getTvsBySize();
        homePage.getAllFilters();
        homePage.getGifting();
        homePage.getViewResults();
        homePage.getGermmantownSupercenter();
        homePage.getAddToRegistry();
        homePage.getAddToList();
        waitFor(3);}
    @Test
    public void test50() throws InterruptedException {
        Cart homePage = PageFactory.initElements(driver, Cart.class);
        homePage.getCart();
        homePage.getShopElectronics();
        homePage.getAllTvs();
        homePage.getTvsBySize();
        homePage.getAllFilters();
        homePage.getGifting();
        homePage.getViewResults();
        homePage.getGermmantownSupercenter();
        homePage.getAddToRegistry();
        homePage.getAddCart();
        waitFor(3);}











}
