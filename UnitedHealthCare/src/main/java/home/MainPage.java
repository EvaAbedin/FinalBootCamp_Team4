package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MainPage extends CommonAPI {

        //Test 1:
        @FindBy(xpath = "//header/a[1]/picture[1]/img[1]")
        WebElement UnitedHealthCareLogo;
        @FindBy(xpath = "//a[contains(text(),'Individual')]")
        WebElement Individual;
    public WebElement getUnitedHealthCareLogo() {return UnitedHealthCareLogo;}
    public WebElement getIndividual() {return Individual;}
    public void UnitedHealthCareLogo() {clickOn(getUnitedHealthCareLogo());}
    public void Individual() {clickOn(getIndividual());}

         //Test 2:
         @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
         WebElement Medicare;
    public WebElement getMedicare() {return Medicare;}
    public void medicare() {clickOn(getMedicare());}

        //Test 3:
        @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
        WebElement forProviders;
    public WebElement getForProviders() {return forProviders;}
    public void forProviders () {clickOn((getForProviders()));}
}



