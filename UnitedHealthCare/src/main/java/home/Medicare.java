package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Medicare extends CommonAPI {
    //Test 11:
    @FindBy(xpath = "//h1[contains(text(),'UnitedHealthcare Medicare insurance plans')]")
    WebElement medicare;
    WebElement unitedHealthcareMedicareInsurancePlans;
    public WebElement getMedicare() {return medicare;}
    public WebElement getUnitedHealthcareMedicareInsurancePlans() {return unitedHealthcareMedicareInsurancePlans;}
    public void medicare() {clickOn(getMedicare());}
    public void unitedHealthcareMedicareInsurancePlans() {clickOn(getUnitedHealthcareMedicareInsurancePlans());}

    //Test 2:
    @FindBy(xpath = "//body/div[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[1]/ul[1]/li[1]/a[2]")
    WebElement understandingMedicare;
    public WebElement getUnderstandingMedicare() {return understandingMedicare;}
    public void UnderstandingMedicare () {getUnderstandingMedicare();}


}




