package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreditCards extends CommonAPI {



    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[3]")
    WebElement creditCards;
    public WebElement getCreditCards() {
        return creditCards;
    }
    public void CreditCards() {clickOn(getCreditCards());
    }

    @FindBy(xpath = "//a[@id='btnCompareCreditCards']")
    WebElement shopAllCreditCards;

    public WebElement getShopAllCreditCards() {
        return shopAllCreditCards;
    }
    public void ShopAllCreditCards() {clickOn(getShopAllCreditCards());
    }

    @FindBy(xpath = "//a[@id='home_4051255~AX~en_US']")
    WebElement applyNow;

    public WebElement getApplyNow() {
        return applyNow;
    }
    public void ApplyNow(){clickOn(getApplyNow());}

    @FindBy(xpath = "//a[@id='manageCreditCardAccount']")
    WebElement manageCreditCardAccount;

    public WebElement getManageCreditCardAccount() {
        return manageCreditCardAccount;
    }
    public void ManageCreditCardAccount() {clickOn(getManageCreditCardAccount());
    }

    @FindBy(xpath = "//div[@id='engagementContentWrapperDesktop']//a[@id='EnrollNowDesktop']")
    WebElement enrollToday;

    public WebElement getEnrollToday() {
        return enrollToday;
    }
    public void EnrollToday(){clickOn(getEnrollToday());}


   @FindBy(xpath = "//a[@id='respondToMailOffer']")
    WebElement respondToMailOffer;

    public WebElement getRespondToMailOffer() {
        return respondToMailOffer;
    }
    public void RespondToMailOffer(){clickOn(getRespondToMailOffer());
    }

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[2]/div[1]/section[3]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]")
    WebElement signatureServices;

    public WebElement getSignatureServices() {
        return signatureServices;
    }
    public void SignatureServices(){clickOn(getSignatureServices());}

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[13]/span[1]")
    WebElement exploreEstateService;

    public WebElement getExploreEstateService() {
        return exploreEstateService;
    }
    public void ExploreEstateService(){clickOn(getExploreEstateService());}

    @FindBy(xpath = "//a[@id='noButton']")
    WebElement noButton;

    public WebElement getNoButton() {
        return noButton;
    }
    public void NoButton(){clickOn(getNoButton());}

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[14]/span[1]")
    WebElement exploreMedallionService;

    public WebElement getExploreMedallionService() {
        return exploreMedallionService;
    }
    public void ExploreMedallionService(){clickOn(getExploreMedallionService());}

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/section[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/a[1]")
    WebElement commonQuestions;

    public WebElement getCommonQuestions() {
        return commonQuestions;
    }
    public void CommonQuestions(){clickOn(getCommonQuestions());}

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/section[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/a[1]")
    WebElement additionalResource;

    public WebElement getAdditionalResource() {
        return additionalResource;
    }
    public void AdditionalResource() {clickOn(getAdditionalResource());}

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[15]/span[1]")
    WebElement exploreElderFinanciatCare;

    public WebElement getExploreElderFinanciatCare() {
        return exploreElderFinanciatCare;
    }
    public void ExploreElderFinanciatCare(){clickOn(getExploreElderFinanciatCare());}

    @FindBy(xpath = "//a[@id='lesTabsNavOverview']")
    WebElement overView;

    public WebElement getOverView() {
        return overView;
    }
    public void OverView(){clickOn(getOverView());}

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[16]/span[1]")
    WebElement exploreNotaryService;

    public WebElement getExploreNotaryService() {
        return exploreNotaryService;
    }
    public void ExploreNotaryService(){clickOn(getExploreNotaryService());}

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[17]/span[1]")
    WebElement changeAccount;

    public WebElement getChangeAccount() {
        return changeAccount;
    }
    public void ChangeAccount(){clickOn(getChangeAccount());}

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[18]/span[1]")
    WebElement powerOfAttorny;

    public WebElement getPowerOfAttorny() {
        return powerOfAttorny;
    }
    public void PowerOfAttorny(){clickOn(getPowerOfAttorny());}

    @FindBy(xpath = "//a[@id='cashRewardsCards']")
    WebElement cashBack;

    public WebElement getCashBack() {
        return cashBack;
    }
    public void CashBack(){clickOn(getCashBack());}

    @FindBy(xpath = "//a[@id='checkForOffers']")
    WebElement checkOffer;

    public WebElement getCheckOffer() {
        return checkOffer;
    }
    public void CheckOffer(){clickOn(getCheckOffer());}

    @FindBy(xpath = "//a[@id='travelRewardsCards']")
    WebElement travelRewords;

    public WebElement getTravelRewords() {
        return travelRewords;
    }
    public void TravelRewords(){clickOn(getTravelRewords());}

    @FindBy(xpath = "//a[@id='lowerInterestRateCards']")
    WebElement lowInterestRate;

    public WebElement getLowInterestRate() {
        return lowInterestRate;
    }
    public void LowInterestRate(){clickOn(getLowInterestRate());}

    @FindBy(xpath = "//a[@id='pointsRewardsCards']")
    WebElement pointsRewards;

    public WebElement getPointsRewards() {
        return pointsRewards;
    }
    public void PointsRewards(){clickOn(getPointsRewards());
    }

    @FindBy(xpath = "//a[@id='buildCreditCards']")
    WebElement cardToBuild;

    public WebElement getCardToBuild() {
        return cardToBuild;
    }
    public void CardToBuild() {clickOn(getCardToBuild());}

    @FindBy(xpath = "//a[@id='cardsForStudents']")
    WebElement cardsForStudents;

    public WebElement getCardsForStudents() {
        return cardsForStudents;
    }
    public void CardsForStudents(){clickOn(getCardsForStudents());}

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[18]/span[1]")
    WebElement explorePowerOfAtorny;

    public WebElement getExplorePowerOfAtorny() {
        return explorePowerOfAtorny;
    }
    public void ExplorePowerOfAtorny(){clickOn(getExplorePowerOfAtorny());}

    @FindBy(xpath = "//a[@id='intro-show-more']")
    WebElement seeMore;

    public WebElement getSeeMore() {
        return seeMore;
    }
    public void SeeMore(){clickOn(getSeeMore());}

    @FindBy(xpath = "//a[@id='cash-category']")
    WebElement cashCategory;

    public WebElement getCashCategory() {
        return cashCategory;
    }
    public void CashCategory(){clickOn(getCashCategory());}

    @FindBy(xpath = "//a[@id='travel-category']")
    WebElement travelCategory;

    public WebElement getTravelCategory() {
        return travelCategory;
    }
    public void TravelCategory(){clickOn(getTravelCategory());}

    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/section[2]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[4]/div[2]/div[3]/div[1]/div[1]/div[1]/label[1]")
    WebElement addToCompare;

    public WebElement getAddToCompare() {
        return addToCompare;
    }
    public void AddToCompare(){clickOn(getAddToCompare());}

    @FindBy(xpath = "//a[@id='more-categories']")
    WebElement moreCategory;

    public WebElement getMoreCategory() {
        return moreCategory;
    }
    public void MoreCategory(){clickOn(getMoreCategory());}

    @FindBy(xpath = "//a[@id='airline-category']")
    WebElement airlineCategory;

    public WebElement getAirlineCategory() {
        return airlineCategory;
    }
    public void AirlineCategory(){clickOn(getAirlineCategory());}
}
