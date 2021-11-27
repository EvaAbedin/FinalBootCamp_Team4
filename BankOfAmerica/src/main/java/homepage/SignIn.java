package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class SignIn extends CommonAPI {

    @FindBy(xpath = "//input[@id='onlineId1']")
    WebElement onlineID;

    public WebElement getOnlineID() {
        return onlineID;
    }

    public void setOnlineID(WebElement onlineID) {
        this.onlineID = onlineID;
    }

    public void enterOnlineID() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getOnlineID().sendKeys("Eva Abedin");
    }

    @FindBy(xpath = "//input[@id='passcode1']")
    WebElement password;

    public WebElement getPassword() {
        return password;
    }

    public void setPassword(WebElement password) {
        this.password = password;
    }

    public void enterPassword() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getPassword().sendKeys("eabedin");

    }

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/label[1]")
    WebElement saveOnlineID;

    public WebElement getSaveOnlineID() {
        return saveOnlineID;
    }

    public void SaveOnlineID() {
        clickOn(getSaveOnlineID());
    }

    @FindBy(xpath = "//button[@id='signIn']")
    WebElement SignUp;

    public WebElement getSignUp() {
        return SignUp;
    }

    public void SignUp() {
        clickOn(getSignUp());
    }


    @FindBy(xpath = "//a[@id='forgot-oid-pwd']")
    WebElement forgrtPassword;

    public WebElement getForgrtPassword() {
        return forgrtPassword;
    }

    public void ForgetPasswor() {
        clickOn(getForgrtPassword());

    }

    @FindBy(xpath = "//a[@id='security']")
    WebElement securityAndHelp;

    public WebElement getSecurityAndHelp() {
        return securityAndHelp;
    }

    public void SecurityAndHelp() {
        clickOn(getSecurityAndHelp());
    }


    @FindBy(xpath = "//a[@id='enroll']")
    WebElement enroll;

    public WebElement getEnroll() {
        return enroll;
    }

    public void Enroll() {
        clickOn(getEnroll());
    }

    @FindBy(xpath = "//a[@id='open']")
    WebElement openAnAccount;

    public WebElement getOpenAnAccount() {
        return openAnAccount;
    }

    public void OpenAnAccount() {
        clickOn(getOpenAnAccount());
    }

    @FindBy(xpath = "//div[contains(text(),'Erica® has your back 24/7')]")
    WebElement ericaHasYourBack;

    public WebElement getEricaHasYourBack() {
        return ericaHasYourBack;
    }

    public void EricaHasYourBack() {
        clickOn(getEricaHasYourBack());
    }

    @FindBy(xpath = "//a[@id='cta-banner813294222-_-get-the-app']")
    WebElement getTheApp;

    public WebElement getGetTheApp() {
        return getTheApp;
    }

    public void GetTheApp() {
        clickOn(getGetTheApp());
    }

    @FindBy(xpath = "//a[@id='cta-banner813294222-_-get-the-app']")
    WebElement getTheAPP;

    public WebElement getGetTheAPP() {
        return getTheAPP;
    }

    public void GetTheAPP() {
        clickOn(getTheAPP);
    }

    @FindBy(xpath = "//a[@id='mobile-app-widget704666739-_-download-the-app']")
    WebElement downloadTheApp;

    public WebElement getDownloadTheApp() {
        return downloadTheApp;
    }

    public void DownloadTheApp() {
        clickOn(getDownloadTheApp());
    }

    @FindBy(xpath = "//span[contains(text(),'How does Erica work?')]")
    WebElement howDoesEricaWork;

    public WebElement getHowDoesEricaWork() {
        return howDoesEricaWork;
    }

    public void HowDoesEricaWork() {
        clickOn(getHowDoesEricaWork());
    }

    @FindBy(xpath = "//span[contains(text(),'Do I need the Mobile Banking app to use Erica?')]")
    WebElement doINeedMobileBankingAppToUseErica;

    public WebElement getDoINeedMobileBankingAppToUseErica() {
        return doINeedMobileBankingAppToUseErica;
    }

    public void DoINeedMobileBankingAppToUseErica() {
        clickOn(getDoINeedMobileBankingAppToUseErica());
    }

    @FindBy(xpath = "//span[contains(text(),'What languages can Erica speak?')]")
    WebElement whatlanguagescanEricaspeak;

    public WebElement getWhatlanguagescanEricaspeak() {
        return whatlanguagescanEricaspeak;
    }

    public void WhatlanguagescanEricaspeak() {
        clickOn(getWhatlanguagescanEricaspeak());
    }

    @FindBy(xpath = "//div[contains(text(),'Get checking with the right features')]")
    WebElement getcheckingwiththerightfeature;

    public WebElement getGetcheckingwiththerightfeature() {
        return getcheckingwiththerightfeature;
    }
    public void Getcheckingwiththerightfeature(){clickOn(getcheckingwiththerightfeature);}

    @FindBy(xpath = "//div[contains(text(),'Deals all day, every day')]")
    WebElement dealsAllDAy;

    public WebElement getDealsAllDAy() {
        return dealsAllDAy;
    }
    public void DealsAllDAy(){clickOn(getDealsAllDAy());}
}
