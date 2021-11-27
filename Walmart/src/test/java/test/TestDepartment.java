package test;

import base.CommonAPI;
import homePage.Department;
import homePage.LogIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

     public class TestDepartment extends CommonAPI {
         @Test
         public void test21() throws InterruptedException {
             Department homePage = PageFactory.initElements(driver, Department.class);
             homePage.getDepartment();
             homePage.getAllDepartment();
             waitFor(3);}
         @Test
         public void test22() throws InterruptedException {
             Department homePage = PageFactory.initElements(driver, Department.class);
             homePage.getDepartment();
             homePage.getAllDepartment();
             homePage.getClothingShoesandAccessories();
             waitFor(3);}
         @Test
         public void test23() throws InterruptedException {
             Department homePage = PageFactory.initElements(driver, Department.class);
             homePage.getDepartment();
             homePage.getAllDepartment();
             homePage.getArtsCraftsSewingAndPartySupplies();
             waitFor(3);}
         @Test
         public void test24() throws InterruptedException {
             Department homePage = PageFactory.initElements(driver, Department.class);
             homePage.getDepartment();
             homePage.getAllDepartment();
             homePage.getClothingShoesandAccessories();
             homePage.getFashionGiftGuide();
             waitFor(3);}
         @Test
         public void test25() throws InterruptedException {
             Department homePage = PageFactory.initElements(driver, Department.class);
             homePage.getDepartment();
             homePage.getAllDepartment();
             homePage.getArtsCraftsSewingAndPartySupplies();
             homePage.getShopAllArtsCraftsAndSewing();
             waitFor(3);}
         @Test
         public void test26() throws InterruptedException {
             Department homePage = PageFactory.initElements(driver, Department.class);
             homePage.getDepartment();
             homePage.getAllDepartment();
             homePage.getClothingShoesandAccessories();
             homePage.getFashionGiftGuide();
             homePage.getShopTheGiftFinder();
             waitFor(3);}
         @Test
         public void test27() throws InterruptedException {
             Department homePage = PageFactory.initElements(driver, Department.class);
             homePage.getDepartment();
             homePage.getAllDepartment();
             homePage.getArtsCraftsSewingAndPartySupplies();
             homePage.getShopAllArtsCraftsAndSewing();
             homePage.getBlackFridayDeals();
             waitFor(3);}
         @Test
         public void test28() throws InterruptedException {
             Department homePage = PageFactory.initElements(driver, Department.class);
             homePage.getDepartment();
             homePage.getAllDepartment();
             homePage.getAutoTiresAndIndustrial();
             waitFor(3);}
         @Test
         public void test29() throws InterruptedException {
                 Department homePage = PageFactory.initElements(driver, Department.class);
                 homePage.getDepartment();
                 homePage.getAllDepartment();
                 homePage.getAutoTiresAndIndustrial();
                 homePage.getShopTheGiftFinder();
                 waitFor(3);}
         @Test
         public void test30() throws InterruptedException {
             Department homePage = PageFactory.initElements(driver, Department.class);
             homePage.getDepartment();
             homePage.getAllDepartment();
             homePage.getAutoTiresAndIndustrial();
             homePage.getShopTheGiftFinder();
             homePage.getTires();
             waitFor(3);}




             }

