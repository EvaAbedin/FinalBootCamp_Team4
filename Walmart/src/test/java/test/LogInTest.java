package test;

import base.CommonAPI;
import homePage.LogIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class LogInTest extends CommonAPI {

    @Test
    public void test11() throws InterruptedException {
        LogIn homePage = PageFactory.initElements(driver, LogIn.class);
        homePage.getSignInAccount();
        waitFor(3);}
    @Test
    public void test12() throws InterruptedException {
        LogIn homePage = PageFactory.initElements(driver, LogIn.class);
        homePage.getSignInAccount();
        homePage.getSignIn();
        waitFor(3);}
    @Test
    public void test13() throws InterruptedException {
        LogIn homePage = PageFactory.initElements(driver, LogIn.class);
        homePage.getSignInAccount();
        homePage.getSignIn();
        homePage.getCreateAnAccount();
        waitFor(3);}
    @Test
    public void test14() throws InterruptedException {
        LogIn homePage = PageFactory.initElements(driver, LogIn.class);
        homePage.getSignInAccount();
        homePage.getSignIn();
        homePage.getCreateAnAccount();
        homePage.getPurchaseHistory();
        waitFor(3);}
    @Test
    public void test15() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        //creating object using pageFactory
        LogIn homepage = PageFactory.initElements(driver, LogIn.class);
        homepage.getSignInAccount();
        homepage.getSignIn();
        homepage.getCreateAnAccount();
        homepage.getPurchaseHistory();
        homepage.getEmail();
        waitFor(3);}
    @Test
    public void test16() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        //creating object using pageFactory
        LogIn homepage = PageFactory.initElements(driver, LogIn.class);
        homepage.getSignInAccount();
        homepage.getSignIn();
        homepage.getCreateAnAccount();
        homepage.getPurchaseHistory();
        homepage.getEmail();
        homepage.getPassword();
        waitFor(3);}
    @Test
    public void test17() throws InterruptedException {
        LogIn homePage = PageFactory.initElements(driver, LogIn.class);
        homePage.getSignInAccount();
        homePage.getSignIn();
        homePage.getCreateAnAccount();
        homePage.getPurchaseHistory();
        homePage.getEmail();
        homePage.getPassword();
        homePage.getforgotPassword();
        waitFor(3);}
    @Test
    public void test18() throws InterruptedException {
        LogIn homePage = PageFactory.initElements(driver, LogIn.class);
        homePage.getSignInAccount();
        homePage.getSignIn();
        homePage.getCreateAnAccount();
        homePage.getPurchaseHistory();
        homePage.getEmail();
        homePage.getPassword();
        homePage.getforgotPassword();
        homePage.getshowPassword();
        waitFor(3);}
    @Test
    public void test19() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        //creating object using pageFactory
        LogIn homepage = PageFactory.initElements(driver, LogIn.class);
        homepage.getSignInAccount();
        homepage.getSignIn();
        homepage.getCreateAnAccount();
        homepage.getPurchaseHistory();
        homepage.getEmail();
        homepage.getPassword();
        homepage.getforgotPassword();
        homepage.getEnterSignIn();
        waitFor(3);}
    @Test
    public void test20() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        //creating object using pageFactory
        LogIn homepage = PageFactory.initElements(driver, LogIn.class);
        homepage.getSignInAccount();
        homepage.getSignIn();
        homepage.getCreateAnAccount();
        homepage.getPurchaseHistory();
        homepage.getEmail();
        homepage.getPassword();
        homepage.getforgotPassword();
        homepage.getEnterSignIn();
        homepage.getMoreoption();
        waitFor(3);}



}










