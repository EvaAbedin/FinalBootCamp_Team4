package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BetterMoneyHabits extends CommonAPI {

    @FindBy(xpath = "//span[contains(text(),'Better Money Habits®')]")
    WebElement bettermoneyhabits;
    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[2]/div[1]/section[8]/div[2]/div[1]/div[2]/ul[1]/li[1]/a[1]/span[1]")
    WebElement creditCard;
    @FindBy(xpath = "//a[@id='SubTopicTab_choosing_a_credit_card']")
    WebElement choosingAcreditcard;

    public WebElement getBettermoneyhabits() {
        return bettermoneyhabits;
    }

    public WebElement getCreditCard() {
        return creditCard;
    }

    public WebElement getChoosingAcreditcard() {
        return choosingAcreditcard;
    }
    public void Bettermoneyhabits(){clickOn(getBettermoneyhabits());}
    public void CreditCard(){clickOn(getCreditCard());}
    public void ChoosingAcreditcard(){clickOn(getChoosingAcreditcard());}


    @FindBy(xpath = "//a[@id='visitBetterMoneyHabits']")
    WebElement visitBetterMoneyHabits;

    public WebElement getVisitBetterMoneyHabits() {
        return visitBetterMoneyHabits;
    }
    public void VisitBetterMoneyHabits(){clickOn(getVisitBetterMoneyHabits());}

    @FindBy(xpath = "//span[contains(text(),'Home Ownership')]")
    WebElement homeOwnershop;

    public WebElement getHomeOwnershop() {
        return homeOwnershop;
    }
    public void HomeOwnership(){clickOn(getHomeOwnershop());}

    @FindBy(xpath = "//span[contains(text(),'College')]")
    WebElement college;

    public WebElement getCollege() {
        return college;
    }
    public void College(){clickOn(getCollege());}

    @FindBy(xpath = "//span[contains(text(),'Taxes & Income')]")
    WebElement taxesAndIncome;

    public WebElement getTaxesAndIncome() {
        return taxesAndIncome;
    }
    public void TaxesAndIncome(){clickOn(getTaxesAndIncome());}

    @FindBy(xpath = "//span[contains(text(),'Personal Banking')]")
    WebElement personalBanking;

    public WebElement getPersonalBanking() {
        return personalBanking;
    }
    public void PersonalBanking(){clickOn(getPersonalBanking());}

    @FindBy(xpath = "//a[@id='SubTopicTab_planning']")
    WebElement planning;

    public WebElement getPlanning() {
        return planning;
    }
    public void Planning(){clickOn(getPlanning());}

    @FindBy(xpath = "//a[@id='SubTopicTab_starting_out']")
    WebElement startingOut;

    public WebElement getStartingOut() {
        return startingOut;
    }
    public void StartingOut(){clickOn(getStartingOut());}

    @FindBy(xpath = "//span[contains(text(),'Retirement')]")
    WebElement retirement;

    public WebElement getRetirement() {
        return retirement;
    }
    public void Retirement(){clickOn(getRetirement());}

    @FindBy(xpath = "//a[@id='cta-banner813294222-_-get-the-app']")
    WebElement getTheApp;

    public WebElement getGetTheApp() {
        return getTheApp;
    }
    public void GetTheApp(){clickOn(getGetTheApp());}
}
