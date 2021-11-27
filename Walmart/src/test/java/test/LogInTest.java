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
                waitFor(3);
            }
            @Test
            public void test12() throws InterruptedException {
                LogIn homePage = PageFactory.initElements(driver, LogIn.class);
                homePage.getSignInAccount();
                homePage.getSignIn();
                waitFor(3);
            }
            @Test
            public void test13() throws InterruptedException {
                LogIn homePage = PageFactory.initElements(driver, LogIn.class);
                homePage.getSignInAccount();
                homePage.getSignIn();
                homePage.getCreateAnAccount();
                waitFor(3);
            }
            @Test
            public void test14() throws InterruptedException {
                LogIn homePage = PageFactory.initElements(driver, LogIn.class);
                homePage.getSignInAccount();
                homePage.getSignIn();
                homePage.getCreateAnAccount();
                homePage.getPurchaseHistory();
                waitFor(3);
            /*@Test
            public void test15() {
                TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()));
                LogIn homePage = PageFactory.initElements(driver, LogIn.class);
                homePage.getEmail();
                homePage.enterEmail();
                waitFor(1);}
            @Test
            public void test16() {TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
               }.getClass().getEnclosingMethod().getName()));
               LogIn homePage = PageFactory.initElements(driver, LogIn.class);
               homePage.getpassword();
               homePage.enterEmail();
                waitFor(1);*/


            }

        }
