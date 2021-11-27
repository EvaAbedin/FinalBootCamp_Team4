package homePage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Services extends CommonAPI {

    @FindBy(xpath = "//a[@link-identifier='walmartLogo']")
    WebElement walmartLogo;
    @FindBy(xpath = "//header/div[1]/div[2]/a[1]")
    WebElement services;
    @FindBy(xpath = "//a[contains(text(),'All Services')]")
    WebElement AllServices;
    public WebElement getWalmartLogo() {return walmartLogo;}
    public WebElement getServices() {return services;}
    public WebElement getAllServices() {return AllServices;}
    public void services() {clickOn(getServices());}
    public void allServices() {clickOn(getAllServices());}

    @FindBy(xpath = "//button[contains(text(),'Custom Cakes')]")
    WebElement customCakes;
    public WebElement getCustomCakes() {return customCakes;}
    public void customCakes() {clickOn(getCustomCakes());}

    @FindBy(xpath = "//button[contains(text(),'Registry, Lists, & Gifts')]")
    WebElement registryListsandGifts;
    public WebElement getRegistryListsandGifts() {return registryListsandGifts;}
    public void registryListsandGifts(){clickOn(getRegistryListsandGifts());}

    @FindBy(xpath = "//button[contains(text(),'Health Services')]")
    WebElement healthServices;
    @FindBy(xpath = "//header/div[1]/div[2]/div[1]/div[1]/div[1]")
    WebElement pharmacy;
    public WebElement getHealthServices() {return healthServices;}
    public WebElement getPharmacy() {return pharmacy;}
    public void helthServices() {getHealthServices();}
    public void pharmacy() {clickOn(getPharmacy());}

    @FindBy(xpath = "//button[contains(text(),'Rx transfers')]")
    WebElement rxTransfers;
    public WebElement getRxTransfers() {return rxTransfers;}
    public void rxTransfers() {getRxTransfers();}

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[2]/button[1]")
    WebElement signIn;
    public WebElement getSignin() {return signIn;}
    public void signIn() {clickOn(getSignin());}

    @FindBy(xpath = "//span[contains(text(),'Create a new account')]")
    WebElement createNewAccount;
    public WebElement getCreateNewAccount() {return createNewAccount;}
    public void createNewAccount() {clickOn(getCreateNewAccount());}

    @FindBy(xpath = "//span[contains(text(),'Walmart Pharmacy Privacy Notice')]")
    WebElement privacyNotice;
    public WebElement getPrivacyNotice() {return privacyNotice;}
    public void privacyNotice(){clickOn(getPrivacyNotice());}

    @FindBy(xpath = "//span[contains(text(),'Leave Pharmacy')]")
    WebElement leavePharmacy;
    public WebElement getLeavePharmacy() {return leavePharmacy;}


}