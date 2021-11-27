package homePage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class ClothingAndShoes extends CommonAPI {

    @FindBy(xpath = "//button[contains(text(),'Clothing, Shoes & Accessories')]")
    WebElement clothing;
    public WebElement getClothing() {return clothing;}
    public void clothing() {clickOn(getClothing());}

    @FindBy(xpath = "//button[contains(text(),'Savings & Featured Shops')]")
    WebElement saving;
    public WebElement getSaving() {return saving;}
    public void saving() {clickOn(getSaving());}

    @FindBy(xpath = "//button[contains(text(),'Home, Furniture & Appliances')]")
    WebElement furniture;
    public WebElement getFurniture() {return furniture;}
    public void furniture() {clickOn(getFurniture());}

    @FindBy(xpath = "//button[contains(text(),'Home Improvement')]")
    WebElement home;
    public WebElement getHome() {return home;}
    public void home() {clickOn(getHome());}

    @FindBy(xpath = "//button[contains(text(),'Household Essentials')]")
    WebElement essentials;
    public WebElement getEssentials() {return essentials;}
    public void essentials() {clickOn(getEssentials());}

    @FindBy(xpath = "//button[contains(text(),'Baby')]")
    WebElement baby;
    public WebElement getBaby() {return baby;}
    public void baby() {clickOn(getBaby());}

    @FindBy(xpath = "//button[contains(text(),'Patio & Garden')]")
    WebElement patio;
    public WebElement getPatio() {return patio;}
    public void pation() {clickOn(getPatio());}

    @FindBy(xpath = "//button[contains(text(),'Personal Care')]]")
    WebElement care;
    public WebElement getCare() {return care;}
    public void care() {clickOn(getCare());}

    @FindBy(xpath = "//button[contains(text(),'Sports & Outdoors')]")
    WebElement sports;
    public WebElement getSports() {return sports;}
    public void sports() {clickOn(getSports());}

    @FindBy(xpath = "//button[contains(text(),'Pets')]")
    WebElement pets;
    public WebElement getPets() {return pets;}
    public void pets() {clickOn(getPets());}

    @FindBy(xpath = "//button[contains(text(),'Stationery & Office Supplies')]")
    WebElement stationary;
    public WebElement getStationary() {return stationary;}
    public void stationary() {clickOn(getStationary());}

    @FindBy(xpath = "//button[contains(text(),'Arts, Crafts, Sewing & Party Supplies')]")
    WebElement arts;
    public WebElement getArts() {return arts;}
    public void arts() {clickOn(getArts());}

    @FindBy(xpath = "//button[contains(text(),'Movies, Music & Books')]")
    WebElement movies;
    public WebElement getMovies() {return movies;}
    public void movies() {clickOn(getMovies());}

    @FindBy(xpath = "//button[contains(text(),'Gift Cards')]")
    WebElement giftCards;
    public WebElement getGiftCards() {return giftCards;}
    public void giftCards() {clickOn(getGiftCards());}


}
