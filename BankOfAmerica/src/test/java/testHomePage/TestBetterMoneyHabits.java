package testHomePage;

import base.CommonAPI;
import homepage.BetterMoneyHabits;
import homepage.Investing;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestBetterMoneyHabits extends CommonAPI {


    @Test
    public void test96() throws InterruptedException {
        BetterMoneyHabits homepage = PageFactory.initElements(driver, BetterMoneyHabits.class);
        homepage.Bettermoneyhabits();
        homepage.CreditCard();
        waitFor(5);
    }

    @Test
    public void test97() throws InterruptedException {
        BetterMoneyHabits homepage = PageFactory.initElements(driver, BetterMoneyHabits.class);
        homepage.Bettermoneyhabits();
        homepage.VisitBetterMoneyHabits();
        waitFor(5);
    }

    @Test
    public void test98() throws InterruptedException {
        BetterMoneyHabits homepage = PageFactory.initElements(driver, BetterMoneyHabits.class);
        homepage.Bettermoneyhabits();
        homepage.HomeOwnership();
        waitFor(5);
    }

    @Test
    public void test99() throws InterruptedException {
        BetterMoneyHabits homepage = PageFactory.initElements(driver, BetterMoneyHabits.class);
        homepage.Bettermoneyhabits();
        homepage.College();
        waitFor(5);
    }

    @Test
    public void test100() throws InterruptedException {
        BetterMoneyHabits homepage = PageFactory.initElements(driver, BetterMoneyHabits.class);
        homepage.Bettermoneyhabits();
        homepage.TaxesAndIncome();
        waitFor(5);
    }
    @Test
    public void test101() throws InterruptedException {
        BetterMoneyHabits homepage = PageFactory.initElements(driver, BetterMoneyHabits.class);
        homepage.Bettermoneyhabits();
        homepage.PersonalBanking();
        waitFor(5);
    }

    @Test
    public void test102() throws InterruptedException {
        BetterMoneyHabits homepage = PageFactory.initElements(driver, BetterMoneyHabits.class);
        homepage.Bettermoneyhabits();
        homepage.Retirement();
        homepage.StartingOut();
        waitFor(5);
    }

    @Test
    public void test107() throws InterruptedException {
        BetterMoneyHabits homepage = PageFactory.initElements(driver, BetterMoneyHabits.class);
    }


    }




