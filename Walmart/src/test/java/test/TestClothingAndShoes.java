package test;

import base.CommonAPI;
import homePage.Cart;
import homePage.ClothingAndShoes;
import homePage.LogIn;
import homePage.Services;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestClothingAndShoes extends CommonAPI {

    @Test
    public void test89() throws InterruptedException {
        ClothingAndShoes homePage = PageFactory.initElements(driver, ClothingAndShoes.class);
        homePage.getClothing();
        waitFor(3);}
    @Test
    public void test90() throws InterruptedException {
        ClothingAndShoes homePage = PageFactory.initElements(driver, ClothingAndShoes.class);
        homePage.getClothing();
        homePage.getSaving();
        homePage.getFurniture();
        waitFor(3);}
    @Test
    public void test91() throws InterruptedException {
        ClothingAndShoes homePage = PageFactory.initElements(driver, ClothingAndShoes.class);
        homePage.getClothing();
        homePage.getSaving();
        homePage.getFurniture();
        homePage.getHome();
        waitFor(3);}
    @Test
    public void test92() throws InterruptedException {
        ClothingAndShoes homePage = PageFactory.initElements(driver, ClothingAndShoes.class);
        homePage.getClothing();
        homePage.getSaving();
        homePage.getFurniture();
        homePage.getHome();
        homePage.getBaby();
        waitFor(3);}
    @Test
    public void test93() throws InterruptedException {
        ClothingAndShoes homePage = PageFactory.initElements(driver, ClothingAndShoes.class);
        homePage.getClothing();
        homePage.getSaving();
        homePage.getFurniture();
        homePage.getHome();
        homePage.getBaby();
        homePage.getPatio();
        waitFor(3);}
    @Test
    public void test94() throws InterruptedException {
        ClothingAndShoes homePage = PageFactory.initElements(driver, ClothingAndShoes.class);
        homePage.getClothing();
        homePage.getSaving();
        homePage.getFurniture();
        homePage.getHome();
        homePage.getBaby();
        homePage.getPatio();
        waitFor(3);}
    @Test
    public void test95() throws InterruptedException {
        ClothingAndShoes homePage = PageFactory.initElements(driver, ClothingAndShoes.class);
        homePage.getClothing();
        homePage.getSaving();
        homePage.getFurniture();
        homePage.getHome();
        homePage.getBaby();
        homePage.getPatio();
        homePage.getSports();
        waitFor(3);}
    @Test
    public void test96() throws InterruptedException {
        ClothingAndShoes homePage = PageFactory.initElements(driver, ClothingAndShoes.class);
        homePage.getClothing();
        homePage.getSaving();
        homePage.getFurniture();
        homePage.getHome();
        homePage.getBaby();
        homePage.getPatio();
        homePage.getSports();
        homePage.getPets();
        waitFor(3);}
    @Test
    public void test97() throws InterruptedException {
        ClothingAndShoes homePage = PageFactory.initElements(driver, ClothingAndShoes.class);
        homePage.getClothing();
        homePage.getSaving();
        homePage.getFurniture();
        homePage.getHome();
        homePage.getBaby();
        homePage.getPatio();
        homePage.getSports();
        homePage.getPets();
        homePage.getStationary();
        waitFor(3);}
    @Test
    public void test98() throws InterruptedException {
        ClothingAndShoes homePage = PageFactory.initElements(driver, ClothingAndShoes.class);
        homePage.getClothing();
        homePage.getSaving();
        homePage.getFurniture();
        homePage.getHome();
        homePage.getBaby();
        homePage.getPatio();
        homePage.getSports();
        homePage.getPets();
        homePage.getStationary();
        homePage.getArts();
        waitFor(3);}
    @Test
    public void test99() throws InterruptedException {
        ClothingAndShoes homePage = PageFactory.initElements(driver, ClothingAndShoes.class);
        homePage.getClothing();
        homePage.getSaving();
        homePage.getFurniture();
        homePage.getHome();
        homePage.getBaby();
        homePage.getPatio();
        homePage.getSports();
        homePage.getPets();
        homePage.getStationary();
        homePage.getArts();
        homePage.getMovies();
        waitFor(3);}
    @Test
    public void test100() throws InterruptedException {
        ClothingAndShoes homePage = PageFactory.initElements(driver, ClothingAndShoes.class);
        homePage.getClothing();
        homePage.getSaving();
        homePage.getFurniture();
        homePage.getHome();
        homePage.getBaby();
        homePage.getPatio();
        homePage.getSports();
        homePage.getPets();
        homePage.getStationary();
        homePage.getArts();
        homePage.getMovies();
        homePage.getGiftCards();
        waitFor(3);}


}
