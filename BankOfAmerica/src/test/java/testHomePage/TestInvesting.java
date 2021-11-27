package testHomePage;

import base.CommonAPI;
import homepage.AutoLoans;
import homepage.Investing;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestInvesting extends CommonAPI {


    @Test
    public void test88() throws InterruptedException {
        Investing homepage = PageFactory.initElements(driver, Investing.class);
        homepage.Investing();
        homepage.GetStarted();
        waitFor(5);
    }

    @Test
    public void test89() throws InterruptedException {
        Investing homepage = PageFactory.initElements(driver, Investing.class);
        homepage.Investing();
        homepage.BuildYourOwnPortfolio();
        waitFor(5);
    }


    @Test
    public void test90() throws InterruptedException {
        Investing homepage = PageFactory.initElements(driver, Investing.class);
        homepage.Investing();
        homepage.BuildYourOwnPortfolio();
        homepage.OpenAnAccount();
        waitFor(5);
    }

    @Test
    public void test91() throws InterruptedException {
        Investing homepage = PageFactory.initElements(driver, Investing.class);
        homepage.Investing();
        homepage.BuildYourOwnPortfolio();
        homepage.OpenAnAccount();
        homepage.HelpMeGetStated();
        waitFor(5);
    }

    @Test
    public void test92() throws InterruptedException {
        Investing homepage = PageFactory.initElements(driver, Investing.class);
        homepage.Investing();
        homepage.BuildYourOwnPortfolio();
        homepage.OpenAnAccount();
        homepage.HelpMeGetStated();
        homepage.GeneralInvesting();
        waitFor(5);
    }

    @Test
    public void test93() throws InterruptedException {
        Investing homepage = PageFactory.initElements(driver, Investing.class);
        homepage.Investing();
        homepage.BuildYourOwnPortfolio();
        homepage.OpenAnAccount();
        homepage.HelpMeGetStated();
        homepage.GeneralInvesting();
        waitFor(5);
    }

    @Test
    public void test94() throws InterruptedException {
        Investing homepage = PageFactory.initElements(driver, Investing.class);
        homepage.Investing();
        homepage.BuildYourOwnPortfolio();
        homepage.OpenAnAccount();
        homepage.HelpMeGetStated();
        homepage.GeneralInvesting();
        homepage.IwillSelectMyOwnInvestment();
        waitFor(5);
    }

    @Test
    public void test95() throws InterruptedException {
        Investing homepage = PageFactory.initElements(driver, Investing.class);
        homepage.Investing();
        homepage.BuildYourOwnPortfolio();
        homepage.OpenAnAccount();
        waitFor(1);
    }
}

//    @Test
//    public void test109() throws InterruptedException {
//        Investing homepage = PageFactory.initElements(driver, Investing.class);
//        homepage.Investing();
//        homepage.BuildYourOwnPortfolio();
//        homepage.OpenAnAccount();
//        homepage.HelpMeGetStated();
//        homepage.Retirement();
//        waitFor(2);
//    }
//
//    @Test
//    public void test110() throws InterruptedException {
//        Investing homepage = PageFactory.initElements(driver, Investing.class);
//        homepage.Investing();
//        homepage.BuildYourOwnPortfolio();
//        homepage.HelpMeGetStated();
//        homepage.Retirement();
//        homepage.IamMovingAssets();
//        waitFor(1);
//    }
//
//    @Test
//    public void test111() throws InterruptedException {
//        Investing homepage = PageFactory.initElements(driver, Investing.class);
//        homepage.Investing();
//        homepage.BuildYourOwnPortfolio();
//        homepage.OpenAnAccount();
//        homepage.HelpMeGetStated();
//        homepage.Retirement();
//        homepage.IamOpeningAnewRetirementAccount();
//        waitFor(2);
//    }
//
//    public void test112() throws InterruptedException {
//        Investing homepage = PageFactory.initElements(driver, Investing.class);
//        homepage.Investing();
//        homepage.BuildYourOwnPortfolio();
//        homepage.OpenAnAccount();
//        homepage.HelpMeGetStated();
//        homepage.GeneralInvesting();
//        homepage.IPreferedAPortfolio();
//        waitFor(2);
//    }
//
//    public void test113() throws InterruptedException {
//        Investing homepage = PageFactory.initElements(driver, Investing.class);
//        homepage.Investing();
//        homepage.BuildYourOwnPortfolio();
//        homepage.OpenAnAccount();
//        homepage.HelpMeGetStated();
//        homepage.Education();
//        waitFor(1);
//    }
//
//    public void test114() throws InterruptedException {
//        Investing homepage = PageFactory.initElements(driver, Investing.class);
//        homepage.Investing();
//        homepage.BuildYourOwnPortfolio();
//        homepage.OpenAnAccount();
//        homepage.HelpMeGetStated();
//        homepage.Education();
//        homepage.EducationRelatedExpence();
//        waitFor(1);
//    }
//
//    public void test115() throws InterruptedException {
//        Investing homepage = PageFactory.initElements(driver, Investing.class);
//        homepage.Investing();
//        homepage.BuildYourOwnPortfolio();
//        homepage.OpenAnAccount();
//        homepage.HelpMeGetStated();
//        homepage.Education();
//        homepage.FundsForOtherExpence();
//        waitFor(1);
//    }
//}
