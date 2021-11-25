package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

    public class LogIn extends CommonAPI{

        //Test 11:
        @FindBy(xpath = "//header/div[1]/div[4]/a[1]/i[1]")
        WebElement signInAccount;
        public WebElement getSignInAccount() {return signInAccount;}
        public void SignInAccount() {clickOn(getSignInAccount());}

        //Test 12:
        @FindBy(xpath="//button[contains(text(),'Sign in')]")
        WebElement signIn;
        public WebElement getSignIn() {return signIn;}
        public void SignIn() {clickOn((getSignIn()));}

        //Test 13:
        @FindBy(xpath="//button[contains(text(),'Create an account')]")
        WebElement createAnAccount;
        public WebElement getCreateAnAccount() {return createAnAccount;}
        public void CreateAnAccount() {clickOn(getCreateAnAccount());}

        //Test 14:
        @FindBy(xpath="//header/div[1]/div[4]/div[1]/div[1]/a[2]")
        WebElement purchaseHistory;
        public WebElement getPurchaseHistory() {return purchaseHistory;}
        public void PurchaseHistory() {clickOn(getPurchaseHistory());}

        //Test 15:
        @FindBy(xpath="//input[@id='email']")
        WebElement email;
        public WebElement getEmail() {return email;}
        public void setEmail(WebElement email) {this.email = email;}
        public void enterEmail() {
            TestLogger.log(getClass().getSimpleName() + ": " +convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getEmail().sendKeys("Zabin@Com");}

        /*Test 16:
        @FindBy(xpath=//input[@id='password']")
        WebElement p;
        public void entetrPassword() {
            TestLogger.log(getClass().getSimpleName() + ": " +convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getPassword().sendKeys("123455");
        }
        //Test 17:
        @FindBy(xpath = "//button[contains(text(),'Household Essentials')]")
        WebElement householdEssentials;
        public WebElement getHouseholdEssentials() {return householdEssentials;}
        public void householdEssentials() {clickOn(getHouseholdEssentials());}*/

        //Test 18:



    }






