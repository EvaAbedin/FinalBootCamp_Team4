package testhome;

import base.CommonAPI;
import home.MainPage;
import home.Medicare;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class TestMedicare extends CommonAPI {
    @Test
    public void test11() throws InterruptedException {
        Medicare home = PageFactory.initElements(driver, Medicare.class);
        home.getMedicare();
        home.getUnitedHealthcareMedicareInsurancePlans();
        waitFor(1);
    }

    @Test
    public void test12() throws InterruptedException {
        Medicare home = PageFactory.initElements(driver, Medicare.class);
        home.getMedicare();
        home.getUnderstandingMedicare();
        waitFor(3);
    }
}




