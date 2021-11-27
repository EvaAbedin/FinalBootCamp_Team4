package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeLoans extends CommonAPI {

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[4]/a[1]/span[3]")
    WebElement homeLoan;

    public WebElement getHomeLoan() {
        return homeLoan;
    }
    public void HomeLoan(){clickOn(getHomeLoan());}

    @FindBy(xpath = "//a[@id='mortgages']")
    WebElement mortgages;

    public WebElement getMortgages() {
        return mortgages;
    }
    public void Mortgages(){clickOn(getMortgages());}

    @FindBy(xpath = "//a[@id='applyNow']")
    WebElement applyNow;

    public WebElement getApplyNow() {
        return applyNow;
    }
    public void ApplyNow(){clickOn(getApplyNow());}


    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/a[1]")
    WebElement getEstimateOfCost;

    public WebElement getGetEstimateOfCost() {
        return getEstimateOfCost;
    }
    public void GetEstimateOfCost() {clickOn(getGetEstimateOfCost());}

    @FindBy(xpath = "//a[@id='prequalification-signin-link']")
    WebElement prequalification;

    public WebElement getPrequalification() {
        return prequalification;
    }
    public void Prequalification(){clickOn(getPrequalification());}

    @FindBy(xpath = "//a[@id='signInAsGuestBtn']")
    WebElement signInAsGuest;

    public WebElement getSignInAsGuest() {
        return signInAsGuest;
    }
    public void SignInAsGuest(){clickOn(getSignInAsGuest());}

    @FindBy(xpath = "//a[@id='update-button-medium']")
    WebElement update;

    public WebElement getUpdate() {
        return update;
    }
    public void Update(){clickOn(getUpdate());}

    @FindBy(xpath = "//p[contains(text(),'Find a home')]")
    WebElement findAHome;

    public WebElement getFindAHome() {
        return findAHome;
    }
    public void FindAHome(){clickOn(getFindAHome());}

    @FindBy(xpath = "//a[@id='refinance']")
    WebElement refinance;

    public WebElement getRefinance() {
        return refinance;
    }
    public void Refinance(){clickOn(getRefinance());}

    @FindBy(xpath = "//a[@id='refinance-calculator']")
    WebElement refinanceCalculator;

    public WebElement getRefinanceCalculator() {
        return refinanceCalculator;
    }
    public void RefinanceCalculator(){clickOn(getRefinanceCalculator());}

    @FindBy(xpath = "//a[@id='homeEquity']")
    WebElement homeEquity;

    public WebElement getHomeEquity() {
        return homeEquity;
    }
    public void HomeEquity(){clickOn(getHomeEquity());}

    @FindBy(xpath = "//select[@id='stateSelect']")
    WebElement selectState;

    public WebElement getSelectState() {
        return selectState;
    }
    public void SelectState(){clickOn(getSelectState());}

    @FindBy(xpath = "//a[@id='helpWithHomeLoanPayments']")
    WebElement helpWithHomeLoanPayments;

    public WebElement getHelpWithHomeLoanPayments() {
        return helpWithHomeLoanPayments;
    }
    public void HelpWithHomeLoanPayments(){clickOn(getHelpWithHomeLoanPayments());}

    @FindBy(xpath = "//a[@id='Learn_More_Coronavirus_Assistance']")
    WebElement CoronaVirus;

    public WebElement getCoronaVirus() {
        return CoronaVirus;
    }
    public void CoronaVirus(){clickOn(getCoronaVirus());}

    @FindBy(xpath = "//a[@id='navHomeLoansManageYourLoansLink']")
    WebElement manageLoans;

    public WebElement getManageLoans() {
        return manageLoans;
    }
    public void ManageLoans(){clickOn(getManageLoans());}
}

