package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Investing extends CommonAPI {

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[7]/a[1]/span[3]")
    WebElement investing;
    @FindBy(xpath = "//a[@id='btnInvesting']")
    WebElement getStarted;

    public WebElement getInvesting() {
        return investing;
    }

    public WebElement getGetStarted() {
        return getStarted;
    }
    public void Investing(){clickOn(getInvesting());}
    public void GetStarted(){clickOn(getGetStarted());}

    @FindBy(xpath = "//strong[contains(text(),'Build your own portfolio')]")
    WebElement buildYourOwnPortfolio;

    public WebElement getBuildYourOwnPortfolio() {
        return buildYourOwnPortfolio;
    }
    public void BuildYourOwnPortfolio(){clickOn(getBuildYourOwnPortfolio());}

    @FindBy(xpath = "//body[1]/form[1]/div[4]/div[1]/div[4]/div[1]/div[2]/div[2]/div[1]/div[1]/span[1]/div[1]/div[4]/div[1]/div[1]/a[1]/span[1]")
    WebElement openAnAccount;

    public WebElement getOpenAnAccount() {
        return openAnAccount;
    }
    public void OpenAnAccount(){clickOn(getOpenAnAccount());}

    @FindBy(xpath = "//h2[contains(text(),'Help me get started')]")
    WebElement helpMeGetStarted;

    public WebElement getHelpMeGetStarted() {
        return helpMeGetStarted;
    }
    public void HelpMeGetStated(){clickOn(getHelpMeGetStarted());}

    @FindBy(xpath = "//a[@id='2aGen']")
    WebElement generalInvesting;

    public WebElement getGeneralInvesting() {
        return generalInvesting;
    }
    public void GeneralInvesting(){clickOn(getGeneralInvesting());}

    @FindBy(xpath = "//body[1]/form[1]/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[2]/div[2]/a[2]/h3[1]")
    WebElement retirement;

    public WebElement getRetirement() {
        return retirement;
    }
    public void Retirement(){clickOn(getRetirement());}

    @FindBy(xpath = "//h3[contains(text(),'Education')]")
    WebElement education;

    public WebElement getEducation() {
        return education;
    }
    public void Education(){clickOn(getEducation());}

    @FindBy(xpath = "//h2[contains(text(),'Show me all accounts')]")
    WebElement ShowMeAllAccount;

    public WebElement getShowMeAllAccount() {
        return ShowMeAllAccount;
    }
    public void ShowMeAllAccount(){clickOn(getShowMeAllAccount());}

    @FindBy(xpath = "//body[1]/form[1]/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[2]/div[3]/a[1]/h3[1]")
    WebElement iwillSelectMyOwnInvestment;

    public WebElement getIwillSelectMyOwnInvestment() {
        return iwillSelectMyOwnInvestment;
    }
    public void IwillSelectMyOwnInvestment(){clickOn(getIwillSelectMyOwnInvestment());}

    @FindBy(xpath = "//h3[contains(text(),'General investing')]")
    WebElement generalInvestinG;

    @FindBy(xpath = "//h3[contains(text(),\"I'm opening a new retirement account\")]")
    WebElement IamOpeningAnewRetirementAccount;

    public WebElement getIamOpeningAnewRetirementAccount() {
        return IamOpeningAnewRetirementAccount;
    }
    public void IamOpeningAnewRetirementAccount(){clickOn(getIamOpeningAnewRetirementAccount());}

    @FindBy(xpath = "//h3[contains(text(),\"I'm moving assets from an existing retirement acco\")]")
    WebElement iamMovingAssets;

    public WebElement getIamMovingAssets() {
        return iamMovingAssets;
    }
    public void IamMovingAssets(){clickOn(getIamMovingAssets());}

    @FindBy(xpath = "//body[1]/form[1]/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[2]/div[3]/a[2]/h3[1]")
    WebElement iPreferedAPortfolio;

    public WebElement getiPreferedAPortfolio() {
        return iPreferedAPortfolio;
    }
    public void IPreferedAPortfolio(){clickOn(getiPreferedAPortfolio());}

    @FindBy(xpath = "//a[@id='3aEduOnly']")
    WebElement educationRelatedExpence;

    public WebElement getEducationRelatedExpence() {
        return educationRelatedExpence;
    }
    public void EducationRelatedExpence(){clickOn(getEducationRelatedExpence());}

    @FindBy(xpath = "//h3[contains(text(),'I want the flexibility to use funds for other expe')]")
    WebElement fundsForOtherExpence;

    public WebElement getFundsForOtherExpence() {
        return fundsForOtherExpence;
    }
    public void FundsForOtherExpence(){clickOn(getFundsForOtherExpence());}
}


