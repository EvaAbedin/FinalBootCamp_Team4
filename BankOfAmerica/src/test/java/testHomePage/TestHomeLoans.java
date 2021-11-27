package testHomePage;

import base.CommonAPI;
import homepage.CreditCards;
import homepage.HomeLoans;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomeLoans extends CommonAPI {

    @Test
    public void test71() throws InterruptedException {
        HomeLoans homepage = PageFactory.initElements(driver, HomeLoans.class);
        homepage.HomeLoan();
        waitFor(1);
    }

    @Test
    public void test72() throws InterruptedException {
        HomeLoans homepage = PageFactory.initElements(driver, HomeLoans.class);
        homepage.HomeLoan();
        homepage.Mortgages();
        waitFor(1);
    }

    @Test
    public void test73() throws InterruptedException {
        HomeLoans homepage = PageFactory.initElements(driver, HomeLoans.class);
        homepage.HomeLoan();
        homepage.Mortgages();
        homepage.ApplyNow();
        waitFor(1);
    }

    @Test
    public void test74() throws InterruptedException {
        HomeLoans homepage = PageFactory.initElements(driver, HomeLoans.class);
        homepage.HomeLoan();
        homepage.Mortgages();
        homepage.GetEstimateOfCost();
        waitFor(1);
    }

    @Test
    public void test75() throws InterruptedException {
        HomeLoans homepage = PageFactory.initElements(driver, HomeLoans.class);
        homepage.HomeLoan();
        homepage.Mortgages();
        homepage.Prequalification();
        waitFor(1);
    }

    @Test
    public void test76() throws InterruptedException {
        HomeLoans homepage = PageFactory.initElements(driver, HomeLoans.class);
        homepage.HomeLoan();
        homepage.Mortgages();
        homepage.Prequalification();
        homepage.SignInAsGuest();
                waitFor(1);
    }

    @Test
    public void test77() throws InterruptedException {
        HomeLoans homepage = PageFactory.initElements(driver, HomeLoans.class);
        homepage.HomeLoan();
        homepage.Mortgages();
        homepage.Update();
        waitFor(1);
    }

    @Test
    public void test78() throws InterruptedException {
        HomeLoans homepage = PageFactory.initElements(driver, HomeLoans.class);
        homepage.HomeLoan();
        homepage.Mortgages();
        homepage.Update();
        homepage.FindAHome();
        waitFor(1);
    }

    @Test
    public void test79() throws InterruptedException {
        HomeLoans homepage = PageFactory.initElements(driver, HomeLoans.class);
        homepage.HomeLoan();
        homepage.Refinance();
        waitFor(1);
    }

    @Test
    public void test80() throws InterruptedException {
        HomeLoans homepage = PageFactory.initElements(driver, HomeLoans.class);
        homepage.HomeLoan();
        homepage.Refinance();
        homepage.RefinanceCalculator();
        waitFor(1);
    }

    @Test
    public void test81() throws InterruptedException {
        HomeLoans homepage = PageFactory.initElements(driver, HomeLoans.class);
        homepage.HomeLoan();
        homepage.HomeEquity();
        waitFor(1);
    }

    @Test
    public void test82() throws InterruptedException {
        HomeLoans homepage = PageFactory.initElements(driver, HomeLoans.class);
        homepage.HomeLoan();
        homepage.HomeEquity();
        homepage.SelectState();
        waitFor(1);
    }

    @Test
    public void test83() throws InterruptedException {
        HomeLoans homepage = PageFactory.initElements(driver, HomeLoans.class);
        homepage.HomeLoan();
        homepage.HomeEquity();
        waitFor(1);
    }

    @Test
    public void test84() throws InterruptedException {
        HomeLoans homepage = PageFactory.initElements(driver, HomeLoans.class);
        homepage.HomeLoan();
        homepage.Mortgages();
        waitFor(1);
    }

    @Test
    public void test85() throws InterruptedException {
        HomeLoans homepage = PageFactory.initElements(driver, HomeLoans.class);
        homepage.HomeLoan();
        homepage.Refinance();
        waitFor(1);
    }


}
