package testHomePage;

import base.CommonAPI;
import homepage.Checking;
import homepage.SignIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestSignIn extends CommonAPI {


    @Test
    public void test11() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SignIn homepage = PageFactory.initElements(driver, SignIn.class);
        homepage.getOnlineID();
        homepage.enterOnlineID();
        waitFor(1);
    }

    @Test
    public void test12() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SignIn homepage = PageFactory.initElements(driver, SignIn.class);
        homepage.enterOnlineID();
        homepage.enterPassword();
        waitFor(1);
    }

    @Test
    public void test13() throws InterruptedException {
        SignIn homepage = PageFactory.initElements(driver, SignIn.class);
        homepage.enterOnlineID();
        homepage.enterPassword();
        homepage.SaveOnlineID();
        waitFor(1);

    }

    @Test
    public void test14() throws InterruptedException {
        SignIn homepage = PageFactory.initElements(driver, SignIn.class);
        homepage.enterOnlineID();
        homepage.enterPassword();
        homepage.SaveOnlineID();
        homepage.SignUp();
        waitFor(1);
    }

    @Test
    public void test15() throws InterruptedException {
        SignIn homepage = PageFactory.initElements(driver, SignIn.class);
        homepage.enterOnlineID();
        homepage.ForgetPasswor();
        waitFor(1);
    }

    @Test
    public void test16() throws InterruptedException {
        SignIn  homepage = PageFactory.initElements(driver, SignIn.class);
        homepage.enterOnlineID();
        homepage.enterPassword();
        homepage.SecurityAndHelp();
    }

    @Test
    public void test17() throws InterruptedException {
        SignIn  homepage = PageFactory.initElements(driver, SignIn.class);
        homepage.enterOnlineID();
        homepage.enterPassword();
        homepage.Enroll();
    }

    @Test
    public void test18() throws InterruptedException {
        SignIn homepage = PageFactory.initElements(driver, SignIn.class);
        homepage.enterOnlineID();
        homepage.enterPassword();
        homepage.OpenAnAccount();
    }

    @Test
    public  void test106() throws InterruptedException {
        SignIn homepage = PageFactory.initElements(driver, SignIn.class);
        homepage.Getcheckingwiththerightfeature();
        waitFor(1);
    }

    @Test
    public  void test108() throws InterruptedException {
        SignIn homepage = PageFactory.initElements(driver, SignIn.class);
        homepage.DealsAllDAy();
        waitFor(1);
    }



}
