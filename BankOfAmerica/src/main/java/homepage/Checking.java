package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class Checking extends CommonAPI {

    @FindBy(xpath = "//a[@id='navChecking']")
    WebElement checking;
    @FindBy(xpath = "//a[@id='exploreCheckingSolutions']")
    WebElement exploreCheckingSolutions;
    public WebElement getChecking() {return checking;}
    public WebElement getExploreCheckingSolutions() {return exploreCheckingSolutions;}
    public void Checking() {clickOn(getChecking());}
    public void ExploreCheckingSolutions() {clickOn(getExploreCheckingSolutions());}

    @FindBy(xpath = "//a[@id='advantageBanking']")
    WebElement advantageBanking;
    public WebElement getAdvantageBanking() {return advantageBanking;}
    public void AdventageBanking() {clickOn(getAdvantageBanking());}

    @FindBy(xpath = "//a[@id='studentBanking']")
    WebElement studentBanking;
    public WebElement getStudentBanking() {return studentBanking;}
    public void StudentBanking() {clickOn(getStudentBanking());}

    @FindBy(xpath = "//a[@id='businessChecking']")
    WebElement businessChecking;
    public WebElement getBusinessChecking() {return businessChecking;}
    public void BusinessChecking() {clickOn(getBusinessChecking());}

    @FindBy(xpath = "//input[@id='zipCodeModalInputField']")
    WebElement zipcode;
    public WebElement getZipcode() {return zipcode;}
    public void Zipcode() {clickOn(getZipcode());}

    @FindBy(xpath = "//input[@id='zipCodeModalInputField']")
    WebElement zipCodeInput;
    public WebElement getZipCodeInput() {return zipCodeInput;}
    public void setZipCodeInput(WebElement zipCodeInput) {this.zipCodeInput = zipCodeInput;}
    public void enterZipCodeInput() {
        TestLogger.log(getClass().getSimpleName() + ": " +convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getZipCodeInput().sendKeys("19082");
    }

    @FindBy(xpath = "//a[@id='go-button-zip-modal']")
    WebElement goButton;
    public WebElement getGoButton() {return goButton;}
    public void GoButton() {clickOn(getGoButton());
    }

    @FindBy(xpath = "//a[@id='eaGetStartedLargeMedium']")
    WebElement getStarted;
    public WebElement getGetStarted() {return getStarted;}
    public void GetStarted() {clickOn(getGetStarted());
    }

    @FindBy(xpath = "//a[@id='open-now-bus-fundamentals']")
    WebElement openNow;
    public WebElement getOpenNow() {return openNow;}
    public void OpenNow() {clickOn(getOpenNow());
    }

    @FindBy(xpath = "//a[@id='fundamentalsWaysToAvoidThisFee']")
    WebElement avoidMonthlyFee;
    public WebElement getAvoidMonthlyFee() {return avoidMonthlyFee;}
    public void AvoidMonthlyFree() {clickOn(getAvoidMonthlyFee());}


}




