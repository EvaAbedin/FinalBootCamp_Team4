package homePage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Department extends CommonAPI {

    //Test 21:
    @FindBy (xpath = "//a[@link-identifier='Departments']")
    WebElement department;
    @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement allDepartment;
    public WebElement getDepartment() {return department;}
    public WebElement getAllDepartment() {return allDepartment;}
    public void department(){clickOn(getDepartment());}
    public void allDepartment () {getAllDepartment();}

    //Test 22:
    @FindBy (xpath = "//a[contains(text(),'Clothing, Shoes & Accessories')]")
    WebElement clothingShoesandAccessories;
    public WebElement getClothingShoesandAccessories() {return clothingShoesandAccessories;}
    public void clothingShoesandAccessories() {clickOn(getClothingShoesandAccessories());}

    //Test 23:
    @FindBy (xpath = "//a[contains(text(),'Arts, Crafts, Sewing & Party Supplies')]")
    WebElement artsCraftsSewingAndPartySupplies;
    public WebElement getArtsCraftsSewingAndPartySupplies() {return artsCraftsSewingAndPartySupplies;}
    public void artsCraftsSewingAndPartySupplies() {clickOn(getArtsCraftsSewingAndPartySupplies());}

    //Test 24:
    @FindBy (xpath = "//a[contains(text(),'Fashion Gift Guide')]")
    WebElement fashionGiftGuide;
    public WebElement getFashionGiftGuide() {return fashionGiftGuide;}
    public void fasionGigtGuide () {getFashionGiftGuide();}

    //Test 25:
    @FindBy(xpath = "//a[contains(text(),'Shop All Arts Crafts & Sewing')]")
    WebElement shopAllArtsCraftsAndSewing;
    public WebElement getShopAllArtsCraftsAndSewing() {return shopAllArtsCraftsAndSewing;}
    public void shopAllArtsCraftsAndSewing () {clickOn(getShopAllArtsCraftsAndSewing());}

    //Test 26:
    @FindBy(xpath = "//button[contains(text(),'Shop the Gift Finder')]")
    WebElement shopTheGiftFinder;
    public WebElement getShopTheGiftFinder() {return shopTheGiftFinder;}
    public void shopTheGiftFinder () {clickOn(getShopTheGiftFinder());}

    //Test 27:
    @FindBy(xpath = "//button[contains(text(),'Black Friday Deals')]")
    WebElement blackFridayDeals;
    public WebElement getBlackFridayDeals() {return blackFridayDeals;}
    public void blackFridayDeals() {clickOn(getBlackFridayDeals());}

    //Test 28:
    @FindBy(xpath = "//a[contains(text(),'Auto, Tires & Industrial')]")
    WebElement autoTiresAndIndustrial;
    public WebElement getAutoTiresAndIndustrial() {return autoTiresAndIndustrial;}
    public void autoTiresAndIndustrial() {clickOn(getAutoTiresAndIndustrial());}

    //Test 29:
    @FindBy(xpath = "//a[contains(text(),'Shop All Auto Parts')]")
    WebElement shopAllAutoParts;
    public WebElement getShopAllAutoParts() {return shopAllAutoParts;}
    public void shopAllAutoParts() {clickOn(getShopAllAutoParts());}

    //Test 30:
    @FindBy(xpath = "//span[contains(text(),'Tires')]")
    WebElement tires;
    public WebElement getTires() {return tires;}
    public void tires() {clickOn(getTires());}



}


