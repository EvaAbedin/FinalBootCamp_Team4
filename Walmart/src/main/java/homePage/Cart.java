package homePage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Cart extends CommonAPI {

    //Test 41:
    @FindBy(xpath = ("//header/div[1]/div[5]/button[1]/span[1]"))
    WebElement cart;
    @FindBy(xpath = "//a[contains(text(),'Shop Grocery')]")
    WebElement shopGrocery;
    @FindBy(xpath = "//a[contains(text(),'Shop Electronics')]")
    WebElement shopElectronics;
    public WebElement getCart() {return cart;}
    public WebElement getShopGrocery() {return shopGrocery;}
    public WebElement getShopElectronics() {return shopElectronics;}
    public void Cart() {clickOn(getCart());}
    public void shopGrocery() {clickOn(getShopGrocery());}
    public void shopElectronics() {clickOn(getShopElectronics());}

    //Test 42:
    @FindBy(xpath = "//button[contains(text(),'Holiday meal')]")
    WebElement holidayMeal;
    public WebElement getHolidayMeal() {return holidayMeal;}
    public void holidayMeal () {clickOn(getHolidayMeal());}
    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/section[1]/div[1]/ul[1]/li[1]/div[1]/a[1]")
    WebElement turkey;
    public WebElement getTurkey() {return turkey;}
    public void Turkey() {clickOn(getTurkey());}

    //Test 43:
    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement addToCart;
    public WebElement getAddToCart() {return addToCart;}
    public void addToCart() {clickOn(getAddToCart());}

    @FindBy(xpath = "//button[contains(text(),'All TVs')]")
    WebElement allTvs;
    @FindBy(xpath = "//button[contains(text(),'TVs by size')]")
    WebElement tvsBySize;
    public WebElement getAllTvs() {return allTvs;}
    public WebElement getTvsBySize() {return tvsBySize;}
    public void allTvs () {clickOn(getAllTvs());}
    public void tvbySize () {clickOn(getTvsBySize());}

    @FindBy (xpath = "//span[contains(text(),'All filters')]")
    WebElement allFilters;
    @FindBy(xpath = "//div[contains(text(),'Gifting')]")
    WebElement gifting;
    public WebElement getAllFilters() {return allFilters;}
    public WebElement getGifting() {return gifting;}
    public void allFilters() {clickOn(getAllFilters());}
    public void gifting () {clickOn(getGifting());}

    @FindBy (xpath = "//button[contains(text(),'View results')]")
    WebElement viewResults;
    public WebElement getViewResults() {return viewResults;}
    public void viewFilters() {clickOn(getViewResults());}

    @FindBy(xpath = "//button[contains(text(),'Germantown Supercenter')]")
    WebElement germmantownSupercenter;
    public WebElement getGermmantownSupercenter() {return germmantownSupercenter;}
    public void GermantownSupercenter () {clickOn(getGermmantownSupercenter());}

    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/section[1]/button[1]")
    WebElement AddToRegistry;
    public WebElement getAddToRegistry() {return AddToRegistry;}
    public void addToRegistry(){clickOn(getAddToRegistry());}

    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/section[1]/button[1]")
    WebElement addToList;
    public WebElement getAddToList() {return addToList;}
    public void AddToRegustry() {clickOn(getAddToRegistry());}

    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement addCart;
    public WebElement getAddCart() {return addCart;}
    public void addCart() {clickOn(getAddCart());}


}




