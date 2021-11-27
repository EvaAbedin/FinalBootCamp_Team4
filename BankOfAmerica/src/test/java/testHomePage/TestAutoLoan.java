package testHomePage;

import base.CommonAPI;
import homepage.AutoLoans;
import homepage.Checking;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestAutoLoan extends CommonAPI {

    @Test
    public void test86() throws InterruptedException {
        AutoLoans homepage = PageFactory.initElements(driver, AutoLoans.class);
        homepage.AutoLoans();
        homepage.AutoPurchaseLoans();
        waitFor(3);
    }

    @Test
    public void test87() throws InterruptedException {
        AutoLoans homepage = PageFactory.initElements(driver, AutoLoans.class);
        homepage.AutoLoans();
        homepage.CheckAutoLoanRates();
        waitFor(3);
    }


}
