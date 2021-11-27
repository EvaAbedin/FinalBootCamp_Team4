package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoLoans extends CommonAPI {

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[5]/a[1]/span[3]")
    WebElement autoLoans;

    public WebElement getAutoLoans() {
        return autoLoans;
    }

    @FindBy(xpath = "//a[@id='autoPurchaseLoans']")
    WebElement autoPurchaseLoans;

    public WebElement getAutoPurchaseLoans() {
        return autoPurchaseLoans;
    }

    public void AutoLoans() {
        clickOn(getAutoLoans());
    }

    public void AutoPurchaseLoans() {
        clickOn(getAutoPurchaseLoans());
    }

    @FindBy(xpath = "//a[@id='checkAutoLoanRates']")
    WebElement checkAutoLoanRates;

    public WebElement getCheckAutoLoanRates() {
        return checkAutoLoanRates;
    }
    public void CheckAutoLoanRates(){clickOn(getCheckAutoLoanRates());}

    @FindBy(xpath = "//a[@id='shopForCar']")
    WebElement shopForCar;

    public WebElement getShopForCar() {
        return shopForCar;
    }
    public void ShopForCar(){clickOn(getShopForCar());}

    @FindBy(xpath = "//a[@id='EWT1L6TZ']")
    WebElement lowRate;

    public WebElement getLowRate() {
        return lowRate;
    }
    public void LowRate(){clickOn(getLowRate());}

    @FindBy(xpath = "//a[@id='auto-loans-rates-masthead1251774362-_-apply-now']")
    WebElement applyNow;

    public WebElement getApplyNow() {
        return applyNow;
    }
    public void ApplyNow() {clickOn(getApplyNow());}
}


