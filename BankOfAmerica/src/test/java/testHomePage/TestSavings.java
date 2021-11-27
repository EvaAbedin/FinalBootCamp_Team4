package testHomePage;

import base.CommonAPI;
import homepage.Savings;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSavings extends CommonAPI {

   @Test
    public void test19() throws InterruptedException {
        Savings homepage = PageFactory.initElements(driver, Savings.class);
        homepage.Savings();
        waitFor(1);
    }

    @Test
    public void test20() throws InterruptedException {
        Savings homepage = PageFactory.initElements(driver, Savings.class);
        homepage.Savings();
        homepage.RewardsSavingsAccount();
        waitFor(1);
    }

    @Test
    public void test21() throws InterruptedException {
        Savings homepage = PageFactory.initElements(driver, Savings.class);
        homepage.Savings();
        homepage.CdAccount();
        waitFor(1);
    }

    @Test
    public void test22() throws InterruptedException {
        Savings homepage = PageFactory.initElements(driver, Savings.class);
        homepage.Savings();
        homepage.IraAccount();
        waitFor(1);
    }

    @Test
    public void test23() throws InterruptedException {
        Savings homepage = PageFactory.initElements(driver, Savings.class);
        homepage.Savings();
        homepage.OnlineBanking();
        waitFor(1);
    }

    @Test
    public void test24() throws InterruptedException {
        Savings homepage = PageFactory.initElements(driver, Savings.class);
        homepage.Savings();
        homepage.OnlineBanking();
        homepage.SigninOnlineBanking();
        waitFor(1);
    }

    @Test
    public void test25() throws InterruptedException {
        Savings homepage = PageFactory.initElements(driver, Savings.class);
        homepage.Savings();
        homepage.OnlineBanking();
        homepage.SigninOnlineBanking();
        homepage.EnrollOnlineBanking();
        waitFor(1);
    }

    @Test
    public void test26() throws InterruptedException {
        Savings homepage = PageFactory.initElements(driver, Savings.class);
        homepage.Savings();
        homepage.OnlineBanking();
        homepage.SigninOnlineBanking();
        homepage.EnrollOnlineBanking();
        homepage.AccountNumber();

    }

    @Test
    public void test27() throws InterruptedException {
        Savings homepage = PageFactory.initElements(driver, Savings.class);
        homepage.Savings();
        homepage.OnlineBanking();
        homepage.SigninOnlineBanking();
        homepage.EnrollOnlineBanking();
        homepage.Cancle();
    }

    @Test
    public void test28() throws InterruptedException {
        Savings homepage = PageFactory.initElements(driver, Savings.class);
        homepage.Savings();
        homepage.OnlineBanking();
        homepage.SigninOnlineBanking();
        homepage.EnrollOnlineBanking();
    }

    @Test
    public void test29() throws InterruptedException {
        Savings homepage = PageFactory.initElements(driver, Savings.class);
        homepage.Savings();
        homepage.OnlineBanking();
        homepage.SigninOnlineBanking();
        homepage.Location();
    }

    @Test
    public void test30() throws InterruptedException {
        Savings homepage = PageFactory.initElements(driver, Savings.class);
        homepage.Savings();
        homepage.OnlineBanking();
        homepage.SigninOnlineBanking();
        homepage.Menu();
    }

    @Test
    public void test31() throws InterruptedException {
        Savings homepage = PageFactory.initElements(driver, Savings.class);
        homepage.Savings();
        homepage.OnlineBanking();
        homepage.SigninOnlineBanking();
        homepage.Menu();
        homepage.MobAndOnlineFeature();
    }

    @Test
    public void test32() throws InterruptedException {
        Savings homepage = PageFactory.initElements(driver, Savings.class);
        homepage.Savings();
        homepage.OnlineBanking();
        homepage.SigninOnlineBanking();
        homepage.Menu();
        homepage.MobAndOnlineFeature();
        homepage.GetTheApp();
    }

    @Test
    public void test33() throws InterruptedException {
        Savings homepage = PageFactory.initElements(driver, Savings.class);
        homepage.Savings();
        homepage.OnlineBanking();
        homepage.SigninOnlineBanking();
        homepage.Menu();
        homepage.MobAndOnlineFeature();
        homepage.GetTheApp();
        homepage.SelectDevice();
    }

    @Test
    public void test34() throws InterruptedException {
        Savings homepage = PageFactory.initElements(driver, Savings.class);
        homepage.Savings();
        homepage.OnlineBanking();
        homepage.SigninOnlineBanking();
        homepage.Menu();
       waitFor(5);

    }

    @Test
    public void test35() throws InterruptedException {
        Savings homepage = PageFactory.initElements(driver, Savings.class);
        homepage.Savings();
        homepage.OnlineBanking();
        homepage.SigninOnlineBanking();
        homepage.Menu();
        homepage.MobAndOnlineFeature();
        homepage.SecurityCenter();
    }

    @Test
    public void test36() throws InterruptedException {
        Savings homepage = PageFactory.initElements(driver, Savings.class);
        homepage.Savings();
        homepage.OnlineBanking();
        homepage.SigninOnlineBanking();
        homepage.Menu();
        homepage.MobAndOnlineFeature();
        homepage.FringerprintSignin();
    }

    @Test
    public void test37() throws InterruptedException {
        Savings homepage = PageFactory.initElements(driver, Savings.class);
        homepage.Savings();
        homepage.OnlineBanking();
        homepage.SigninOnlineBanking();
        homepage.Menu();
        homepage.MobCheckDiposit();
    }

    @Test
    public void test103() throws InterruptedException {
        Savings homepage = PageFactory.initElements(driver, Savings.class);
        homepage.Savings();
        homepage.OnlineBanking();
        homepage.SigninOnlineBanking();
        homepage.Menu();
        homepage.MobCheckDiposit();
        homepage.ChatWithErica();
    }

    @Test
    public void test38() throws InterruptedException {
        Savings homepage = PageFactory.initElements(driver, Savings.class);
        homepage.Savings();
        homepage.OnlineBanking();
        homepage.SigninOnlineBanking();
        homepage.Menu();
        homepage.MobCheckDiposit();
        homepage.DebitCardLockUnlock();
    }

    @Test
    public void test39() throws InterruptedException {
        Savings homepage = PageFactory.initElements(driver, Savings.class);
        homepage.Savings();
        homepage.OnlineBanking();
        homepage.SigninOnlineBanking();
        homepage.Menu();
        homepage.MobCheckDiposit();
        homepage.BillPay();
    }

    @Test
    public void test40() throws InterruptedException {
        Savings homepage = PageFactory.initElements(driver, Savings.class);
        homepage.Savings();
        homepage.OnlineBanking();
        homepage.SigninOnlineBanking();
        homepage.TransferMoney();
    }

    @Test
    public void test41() throws InterruptedException {
        Savings homepage = PageFactory.initElements(driver, Savings.class);
        homepage.Savings();
        homepage.OnlineBanking();
        homepage.SigninOnlineBanking();
        homepage.SchedualAnAppoinment();
    }

    @Test
    public void test42() throws InterruptedException {
        Savings homepage = PageFactory.initElements(driver, Savings.class);
        homepage.Savings();
        homepage.OnlineBanking();
        homepage.SigninOnlineBanking();
        homepage.OrderCheck();
    }

    @Test
    public void test43() throws InterruptedException {
        Savings homepage = PageFactory.initElements(driver, Savings.class);
        homepage.Savings();
        homepage.OnlineBanking();
        homepage.SigninOnlineBanking();
        homepage.GoPaperless();
    }

    @Test
    public void test44() throws InterruptedException {
        Savings homepage = PageFactory.initElements(driver, Savings.class);
        homepage.Savings();
        homepage.OnlineBanking();
        homepage.SigninOnlineBanking();
        homepage.ActiveACard();
    }


    @Test
    public void test45() throws InterruptedException {
        Savings homepage = PageFactory.initElements(driver, Savings.class);
        homepage.Savings();
        homepage.OnlineBanking();
        homepage.SigninOnlineBanking();
        homepage.OpenANewAccount();
    }



}
