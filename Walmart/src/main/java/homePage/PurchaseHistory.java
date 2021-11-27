package homePage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import reporting.TestLogger;


public class PurchaseHistory extends CommonAPI {

    @FindBy(xpath = "/div[contains(text(),'Purchase history')]")
    WebElement purchaseHistory;
    public WebElement getPurchaseHistory() {return purchaseHistory;}
    public void PurchaseHistory() {clickOn(getPurchaseHistory());}

    @FindBy(id = "//input[@id='ld_select_4']")
    public WebElement emailAdd;
    public WebElement getEmailAdd() {
        return emailAdd;
    }
    public void setEmailAdd(WebElement oderNumber) {
        this.emailAdd = emailAdd;
    }
    public void emailAdd() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getOderNumber().sendKeys("abc123");}

    @FindBy(id = "//span[contains(text(),'Order number (13 digits)')]")
    public WebElement oderNumber;
    public WebElement getOderNumber() {
        return oderNumber;
    }
    public void setOderNumber(WebElement oderNumber) {
        this.oderNumber = oderNumber;
    }
    public void orderNumber() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getOderNumber().sendKeys("abc123");}


    @FindBy(xpath = "//button[contains(text(),'View order status')]")
    WebElement viewOrderStatus;
    public WebElement getViewOrderStatus() {return viewOrderStatus;}
    public void viewOrderStatus() {clickOn(getViewOrderStatus());}

    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/section[1]/div[1]/form[1]/p[2]/button[1]]")
    WebElement signIn;
    public WebElement getSignIn() {return signIn;}
    public void signIn() {clickOn(getSignIn());}

    @FindBy(xpath = "//div[contains(text(),'Privacy Policy')]")
    WebElement privacyPolicy;
    public WebElement getPrivacyPolicy() {return privacyPolicy;}
    public void privacyPolicy() {clickOn(getPrivacyPolicy());}

    @FindBy(xpath = "//a[contains(text(),'Spanish')]]")
    WebElement spanish;
    public WebElement getSpanish() {return spanish;}
    public void Spanish() {clickOn(getSpanish());}

    @FindBy(xpath = "//div[contains(text(),'Do Not Sell My Personal Information')]")
    WebElement doNotSellPersonalInformation;
    public WebElement getDoNotSellPersonalInformation() {return doNotSellPersonalInformation;}
    public void doNotSellPersonalInformation() {clickOn(getDoNotSellPersonalInformation());}

    @FindBy(xpath = "//div[contains(text(),'Request My Personal Information')]")
    WebElement requestMyPersonalInformation;
    public WebElement getRequestMyPersonalInformation() {return requestMyPersonalInformation;}
    public void requestMyPersonalInformation() {clickOn(getRequestMyPersonalInformation());}

    @FindBy(xpath = "//div[contains(text(),'Help')]")
    WebElement help;
    public WebElement getHelp() {return help;}
    public void help() {clickOn(getHelp());}

    @FindBy(xpath = "//div[contains(text(),'Terms of Use')]")
    WebElement termsOfUse;
    public WebElement getTermsOfUse() {return termsOfUse;}
    public void termOfUse() {clickOn(getTermsOfUse());}

}
