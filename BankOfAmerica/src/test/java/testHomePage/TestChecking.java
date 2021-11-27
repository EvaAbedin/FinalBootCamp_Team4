package testHomePage;

import base.CommonAPI;
import homepage.Checking;
import homepage.Investing;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestChecking extends CommonAPI {



        @Test
        public void test1() throws InterruptedException {
                Checking homepage = PageFactory.initElements(driver, Checking.class);
                homepage.Checking();
                homepage.ExploreCheckingSolutions();
                waitFor(1);
        }

        @Test
        public void test2() throws InterruptedException {
        Checking homepage = PageFactory.initElements(driver,Checking.class);
        homepage.Checking();
        homepage.AdventageBanking();
        waitFor(1);
        }

        @Test
        public void test3() throws InterruptedException {
        Checking homepage = PageFactory.initElements(driver,Checking.class);
        homepage.Checking();
        homepage.StudentBanking();
        waitFor(1);

        }

        @Test
        public void test4() throws InterruptedException {
        Checking homepage = PageFactory.initElements(driver,Checking.class);
        homepage.Checking();
        homepage.BusinessChecking();
        waitFor(1);
        }

        @Test
        public void test5() throws InterruptedException {
                Checking homepage = PageFactory.initElements(driver,Checking.class);
                homepage.Checking();
                homepage.BusinessChecking();
                homepage.Zipcode();
                waitFor(1);
        }

        @Test
        public void test6() { TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Checking homepage = PageFactory.initElements(driver,Checking.class);
        homepage.Checking();
        homepage.BusinessChecking();
        homepage.Zipcode();
        homepage.enterZipCodeInput();
        waitFor(1);
        }

        @Test
        public void test7() throws InterruptedException {
                Checking homepage = PageFactory.initElements(driver,Checking.class);
                homepage.Checking();
                homepage.BusinessChecking();
                homepage.Zipcode();
                homepage.enterZipCodeInput();
                homepage.GoButton();
        }

        @Test
        public void test8() throws InterruptedException {
                Checking homepage = PageFactory.initElements(driver, Checking.class);
                homepage.Checking();
                homepage.BusinessChecking();
                homepage.enterZipCodeInput();
                homepage.GoButton();

        }

        @Test
        public void test9() throws InterruptedException {
                Checking homepage = PageFactory.initElements(driver, Checking.class);
                homepage.Checking();
                homepage.BusinessChecking();
                homepage.enterZipCodeInput();
                homepage.GoButton();
        }

        @Test
        public void test10() throws InterruptedException {
                Checking homepage = PageFactory.initElements(driver, Checking.class);
                homepage.Checking();
                homepage.BusinessChecking();
                homepage.enterZipCodeInput();
                homepage.GoButton();
               waitFor(1);
        }

        @Test
        public void test105() throws InterruptedException {
            Checking homepage = PageFactory.initElements(driver, Checking.class);
            homepage.Checking();
            homepage.BusinessChecking();
            homepage.enterZipCodeInput();
            homepage.GoButton();

        }

        @Test
        public void test104() throws InterruptedException {
                Investing homepage = PageFactory.initElements(driver, Investing.class);
                homepage.Investing();
                homepage.BuildYourOwnPortfolio();
                homepage.OpenAnAccount();
                homepage.HelpMeGetStated();
                waitFor(1);
        }
}


