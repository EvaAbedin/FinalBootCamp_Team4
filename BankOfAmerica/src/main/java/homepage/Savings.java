package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Savings extends CommonAPI {

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]/span[3]")
    WebElement savings;
    public WebElement getSavings() {return savings;}
    public void Savings() {clickOn(getSavings());
    }

    @FindBy(xpath = "//a[@id='rewardsSavingsAccount']")
    WebElement rewardsSavingsAccount;
    public WebElement getRewardsSavingsAccount() {return rewardsSavingsAccount;}
    public void RewardsSavingsAccount() {clickOn(getRewardsSavingsAccount());
    }

    @FindBy(xpath = "//a[@id='cdAccount']")
    WebElement cdAccount;
    public WebElement getCdAccount() {return cdAccount;}
    public void CdAccount() {clickOn(getCdAccount());
    }

    @FindBy(xpath = "//a[@id='iraAccount']")
    WebElement iraAccount;
    public WebElement getIraAccount() {return iraAccount;}
    public void IraAccount() {clickOn(getIraAccount());
    }

    @FindBy(xpath = "//a[@id='navSavingsOnlineBanking']")
    WebElement onlineBanking;
    public WebElement getOnlineBanking() {return onlineBanking;}
    public void OnlineBanking() {clickOn(getOnlineBanking());
    }

    @FindBy(xpath = "//a[@id='signinOnlineBankingBtnOverview']")
    WebElement signinOnlineBanking;
    public WebElement getSigninOnlineBanking() {return signinOnlineBanking;}
    public void SigninOnlineBanking() {clickOn(getSigninOnlineBanking());
    }

    @FindBy(xpath = "//a[@id='header-enroll-in-online-banking-button']")
    WebElement enrollOnlineBanking;
    public WebElement getEnrollOnlineBanking() {return enrollOnlineBanking;}
    public void EnrollOnlineBanking() {clickOn(getEnrollOnlineBanking());
    }

    @FindBy(xpath = "//input[@id='acctNumber']")
    WebElement accountNumber;
    public WebElement getAccountNumber() {return accountNumber;}
    public void AccountNumber() {clickOn(getAccountNumber());
    }

    @FindBy(xpath = "//button[@id='cancelCustomerAccount']")
    WebElement cancle;
    public WebElement getCancle() {return cancle;}
    public void Cancle() {clickOn(getCancle());
    }

    @FindBy(xpath = "//a[@id='forgot-oid-pass']")
    WebElement IDnPassword;
    public WebElement getIDnPassword() {return IDnPassword;}
    public void IDnPassword() {clickOn(getIDnPassword());
    }

    @FindBy(xpath = "//a[@id='locations-route-to']")
    WebElement location;
    public WebElement getLocation() {return location;}
    public void Location() {clickOn(getLocation());
    }

    @FindBy(xpath = "//span[contains(text(),'Menu')]")
    WebElement menu;
    public WebElement getMenu() {return menu;}
    public void Menu() {clickOn(getMenu());
    }

   @FindBy(xpath = "//header/nav[@id='navigation']/div[3]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    WebElement mobAndOnlineFeature;
    public WebElement getMobAndOnlineFeature() {return mobAndOnlineFeature;}
    public void MobAndOnlineFeature() {clickOn(getMobAndOnlineFeature());
    }

    @FindBy(xpath = "//a[@id='header_get_app']")
    WebElement getTheApp;
    public WebElement getGetTheApp() {return getTheApp;}
    public void GetTheApp() {clickOn(getGetTheApp());
    }

    @FindBy(xpath = "//select[@id='getAppDeviceSelect']")
    WebElement selectDevice;
    public WebElement getSelectDevice() {return selectDevice;}
    public void SelectDevice() {clickOn(getSelectDevice());
    }

    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/section[2]/div[1]/div[1]/div[4]/section[1]/section[1]/div[2]/ul[1]/li[1]/a[1]/div[2]/div[1]/p[1]")
    WebElement setUpCustomAlert;
    public WebElement getSetUpCustomAlert() {return setUpCustomAlert;}
    public void SetUpCustomAlert() {clickOn(getSetUpCustomAlert());
    }

    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/section[2]/div[1]/div[1]/div[4]/section[1]/section[1]/div[2]/ul[1]/li[2]/a[1]/div[2]/div[1]/p[1]")
    WebElement securityCenter;
    public WebElement getSecurityCenter() {return securityCenter;}
    public void SecurityCenter() {clickOn(getSecurityCenter());
    }

    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/section[2]/div[1]/div[1]/div[4]/section[1]/section[1]/div[2]/ul[1]/li[3]/a[1]/div[2]/div[1]/p[1]")
    WebElement fringerprintSignin;
    public WebElement getFringerprintSignin() {return fringerprintSignin;}
    public void FringerprintSignin(){clickOn(getFringerprintSignin());
    }



    @FindBy(xpath = "//header/nav[@id='navigation']/div[3]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement mobCheckDiposit;
    public WebElement getMobCheckDiposit() {
        return mobCheckDiposit;
    }
    public void MobCheckDiposit() {clickOn(getMobCheckDiposit());
    }

    @FindBy(xpath = "//a[@id='ericaLargeLink']")
    WebElement chatWithErica;
    public WebElement getChatWithErica() {return chatWithErica;}
    public void ChatWithErica() {clickOn(getChatWithErica());
    }

    @FindBy(xpath = "//a[@id='lockUnlockDebitCardLargeLink']")
    WebElement debitCardLockUnlock;

    public WebElement getDebitCardLockUnlock() {
        return debitCardLockUnlock;}
    public void DebitCardLockUnlock() {clickOn(getDebitCardLockUnlock());
    }

    @FindBy(xpath = "//a[@id='billPayLargeLink']")
    WebElement billPay;
    public WebElement getBillPay() {
        return billPay;
    }
    public void BillPay() {clickOn(getBillPay());
    }

    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/a[1]/div[1]/img[1]")
    WebElement transferMoney;
    public WebElement getTransferMoney() {
        return transferMoney;
    }
    public void TransferMoney(){clickOn(getTransferMoney());
    }

    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/a[3]/div[2]")
    WebElement schedualAnAppoinment;

    public WebElement getSchedualAnAppoinment() {
        return schedualAnAppoinment;
    }
    public void SchedualAnAppoinment() {clickOn(getSchedualAnAppoinment());
    }

    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/a[4]/div[3]")
    WebElement orderCheck;
    public WebElement getOrderCheck() {
        return orderCheck;
    }
    public void OrderCheck(){clickOn(getOrderCheck());
    }

    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/section[1]/div[4]/div[1]/a[1]/div[3]")
    WebElement goPagerless;

    public WebElement getGoPagerless() {
        return goPagerless;
    }
    public void GoPaperless(){clickOn(getGoPagerless());
    }

    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/section[1]/div[4]/div[1]/a[2]/div[3]")
    WebElement activeACard;

    public WebElement getActiveACard() {
        return activeACard;
    }
    public void ActiveACard() {clickOn(getActiveACard());
    }

    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/section[1]/div[4]/div[1]/a[3]/div[3]")
    WebElement openANewAccount;

    public WebElement getOpenANewAccount() {
        return openANewAccount;
    }
    public void OpenANewAccount() {clickOn(getOpenANewAccount());
    }
}
