package homePage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class PopularServices extends CommonAPI {

    @FindBy(xpath = "//a[contains(text(),'View All')]")
    WebElement viewAll;
    @FindBy(xpath = "//p[contains(text(),'Pharmacy]")
    WebElement pharmacy;
    @FindBy(xpath = "//p[contains(text(),'Auto Care Center')]")
    WebElement autoCareCenter;
    @FindBy(xpath = "//p[contains(text(),'Custom Cakes')]")
    WebElement customCakes;
    public WebElement getViewAll() {return viewAll;}
    public WebElement getPharmacy() {return pharmacy;}
    public WebElement getAutoCareCenter() {return autoCareCenter;}
    public WebElement getCustomCakes() {return customCakes;}
    public void viewAll() {clickOn(getViewAll());}
    public void pharmacy () {clickOn(getPharmacy());}
    public void AutoCareCenter() {clickOn(getAutoCareCenter());}
    public void customCake() {clickOn(getCustomCakes());}

    @FindBy(xpath = "//a[contains(text(),'Financial Services')]")
    WebElement financialServices;
    public WebElement getFinancialServices() {return financialServices;}
    public void Finalcialservices() {clickOn(getFinancialServices());}

    @FindBy(xpath = "//a[contains(text(),'Money Transfer')]")
    WebElement moneyTransfers;
    public WebElement getMoneyTransfers() {return moneyTransfers;}
    public void moneyTransfers () {clickOn(getMoneyTransfers());}

    @FindBy(xpath = "//iframe[@id='iframe-contentZone2']")
    WebElement domestic;
    public WebElement getDomestic() {return domestic;}
    public void domestic() {clickOn(getDomestic());}

    @FindBy(xpath = "//a[contains(text(),'Auto Buying')]")
    WebElement autoBuying;
    public WebElement getautoBying() {return autoBuying;}
    public void autoBuying() {clickOn(getautoBying());}

    @FindBy(xpath = "//a[@id='povActive']")
    WebElement carSaver;
    public WebElement getcarSaver() {return carSaver;}
    public void carSaver() {clickOn(getcarSaver());}

    @FindBy(xpath = "//header/nav[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement finance;
    public WebElement getFinance() {return finance;}
    public void finance() {clickOn(getFinance());}

    @FindBy(xpath = "//header/nav[1]/div[1]/ul[1]/li[5]/a[1]")
    WebElement howItWorks;
    public WebElement getHowItWorks() {return howItWorks;}
    public void howItWorks() {clickOn(getHowItWorks());}

    @FindBy(xpath = "//body/div[@id='root']/div[@id='how-it-works']/div[3]/div[1]/a[1]")
    WebElement getStarted;
    public WebElement getGetStarted() {return getStarted;}
    public void getStarted() {clickOn(getGetStarted());}

    @FindBy(xpath = "//a[contains(text(),'Sign In')]")
    WebElement signIn;
    public WebElement getSignIn() {return signIn;}
    public void GetSignIn() {clickOn(getSignIn());}






}
