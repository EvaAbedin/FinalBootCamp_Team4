package homePage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
public class ShopDeals extends CommonAPI {

    @FindBy(xpath = "//a[contains(text(),'Shop deals')]")
    WebElement shopDeals;
    public WebElement getShopDeals() {return shopDeals;}
    public void shopDeals () {clickOn(getShopDeals());}

    @FindBy(xpath = "//span[contains(text(),'Germantown SuperCenter')]")
    WebElement germantownSuperCenter;
    public WebElement getGermantownSuperCenter() {return germantownSuperCenter;}
    public void germantownSuperCenter() {clickOn(getGermantownSuperCenter());}

    @FindBy(xpath = "//span[contains(text(),'Germantown, 20874')]")
    WebElement germanTown;
    public WebElement getGermanTown() {return germanTown;}
    public void germanTown() {clickOn(getGermanTown());}

    @FindBy(xpath = "//span[contains(text(),'All filters')]")
    WebElement allfilters;
    public WebElement getAllfilters() {return allfilters;}
    public void allfilters() {clickOn(getAllfilters());}

    @FindBy(xpath = "//span[contains(text(),'In-store')]")
    WebElement inStore;
    public WebElement getInStore() {return inStore;}
    public void inStore() {clickOn(getInStore());}

    @FindBy(xpath = "//span[contains(text(),'Pickup & shipping')]")
    WebElement pickUpShip;
    public WebElement getPickUpShip() {return pickUpShip;}
    public void pickUpShip() {clickOn(getPickUpShip());}

    @FindBy(xpath = "//span[contains(text(),'Price')]")
    WebElement price;
    public WebElement getPrice() {return price;}
    public void price() {clickOn(getPrice());}

    @FindBy(xpath = "//span[contains(text(),'Brand')]")
    WebElement brand;
    public WebElement getBrand() {return brand;}
    public void brand() {clickOn(getBrand());}

    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/section[2]/section[1]/div[7]/button[1]/span[1]")
    WebElement speed;
    public WebElement getSpeed() {return speed;}
    public void speed() {clickOn(getSpeed());}

    @FindBy(xpath ="//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/section[3]/form[1]/div[1]/input[1]")
    WebElement searchDeals;
    public WebElement getSearchDeals() {return searchDeals;}
    public void searchDeals () {clickOn(getSearchDeals());}

    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement blackFridayDeal;
    public WebElement getBlackFridayDeal() {return blackFridayDeal;}
    public void blackFridayDeal() {clickOn(getBlackFridayDeal());}

    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]/span[1]")
    WebElement addPowerxl;
    public WebElement getAddPowerxl() {return addPowerxl;}
    public void powerxl() {clickOn(getAddPowerxl());}

    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/a[1]/span[1]")
    WebElement option;
    public WebElement getOption() {return option;}
    public void setOption() {clickOn(getOption());}

    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/section[1]/div[1]/div[4]/div[1]/div[1]/a[1]")
    WebElement sale;
    public WebElement getSale() {return sale;}
    public void sale() {clickOn(getSale());}

    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/section[2]/section[1]/div[8]/button[1]")
    WebElement bestmatch;
    public WebElement getBestmatch() {return bestmatch;}
    public void bestmatch() {clickOn(getBestmatch());}

    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/section[1]/div[1]/div[11]/div[1]/div[1]/a[1]")
    WebElement reducedPrice;
    public WebElement getReducedPrice() {return reducedPrice;}
    public void reducedPrice() {clickOn(getReducedPrice());}



}
