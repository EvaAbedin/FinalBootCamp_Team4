package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

    public class LogIn extends CommonAPI {

        @FindBy(xpath = "//header/div[1]/div[4]/a[1]/i[1]")
        WebElement signInAccount;
        public WebElement getSignInAccount() {return signInAccount;}
        public void SignInAccount() {clickOn(getSignInAccount());}

        @FindBy(xpath = "//button[contains(text(),'Sign in')]")
        WebElement signIn;public WebElement getSignIn() {return signIn;}
        public void SignIn() {clickOn((getSignIn()));}

        @FindBy(xpath = "//button[contains(text(),'Create an account')]")
        WebElement createAnAccount;
        public WebElement getCreateAnAccount() {return createAnAccount;}
        public void CreateAnAccount() {clickOn(getCreateAnAccount());}

        @FindBy(xpath = "//header/div[1]/div[4]/div[1]/div[1]/a[2]")
        WebElement purchaseHistory;
        public WebElement getPurchaseHistory() {return purchaseHistory;}
        public void PurchaseHistory() {clickOn(getPurchaseHistory());}

        @FindBy(id = "//input[@id='email']")
        public WebElement email;
        public WebElement getEmail() {
            return email;
        }
        public void setEmail(WebElement email) {
            this.email = email;
        }
        public void enterEmail() {TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            getEmail().sendKeys("zabin@com");}

        @FindBy(id = "//input[@id='password']")
        public WebElement password;
        public WebElement getPassword() {
            return password;
        }
        public void setPassword(WebElement password) {
            this.password = password;
        }
        public void enterPassword() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            getPassword().sendKeys("abc123");}

        @FindBy(xpath = "//body/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/button[1]")
        WebElement forgotPassword;
        public WebElement getforgotPassword() {return forgotPassword;}
        public void forgotPassword() {clickOn(getforgotPassword());}

        @FindBy(xpath = "//body/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/button[1]")
        WebElement showPassword;
        public WebElement getshowPassword() {return showPassword;}
        public void showPassword() {clickOn(getshowPassword());}

        @FindBy(id = "//body/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/button[1]")
        public WebElement enterSignIn;
        public WebElement getenterSignIn() {return enterSignIn;}
        public WebElement getEnterSignIn() {return enterSignIn;}
        public void enterSignIn(WebElement enterSignIn) {this.enterSignIn = enterSignIn;}

        @FindBy(xpath = "//body/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/button[1]")
        WebElement moreoption;
        public WebElement getMoreoption() {return moreoption;}
        public void moreOption() {clickOn(getMoreoption());}


    }








        /*//Test 17:
        @FindBy(xpath = "//button[contains(text(),'Household Essentials')]")
        WebElement householdEssentials;
        public WebElement getHouseholdEssentials() {return householdEssentials;}
        public void householdEssentials() {clickOn(getHouseholdEssentials());}*/












