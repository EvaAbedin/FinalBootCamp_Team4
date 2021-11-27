package homePage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Home extends CommonAPI {

     @FindBy(xpath = "//input[@type='search']")
     WebElement searchItems;
     @FindBy(xpath = "//span[@class='mr2']")
     WebElement clickOnItem;
     public WebElement getSearchItems() {return searchItems;}
     public WebElement getClickOnItem() {return clickOnItem;}
     public void searchItems(String str) {typeEnter(getSearchItems(), str);}
     public void ClickOnItem() {clickOn(getClickOnItem());}

     @FindBy(xpath = "//a[@link-identifier='Departments']")
     WebElement dropDownDepartment;
     public WebElement getDropDownDepartment() { return dropDownDepartment; }
     public void DropDownDepartment() { clickOn(getDropDownDepartment());}

     @FindBy(xpath = "//button[normalize-space()='Grocery']")
     WebElement grocery;
     public WebElement getGrocery() { return grocery; }
     public void Grocery() { clickOn(getGrocery()); }

     @FindBy(xpath = "//button[@aria-label='Add to cart - Smart50 Sea Salt Popcorn, 5 Oz.']")
     WebElement chips;
     public WebElement getChips() { return chips;}
     public void CliclonItems() { clickOn(getChips()); }

     @FindBy(xpath = "//button[normalize-space()='Clothing, Shoes & Accessories']")
     WebElement clothingShoesAccessories;
     @FindBy(xpath = "//a[@link-identifier='Clothing']")
     WebElement clothing;
     @FindBy(xpath = "//a[@link-identifier='634469524']")
     WebElement scootJacket;
     @FindBy(xpath = "//button[normalize-space()='Add to list']")
     WebElement addtoList;
     public WebElement getClothingShoesAccessories() { return clothingShoesAccessories; }
     public WebElement getClothing() { return clothing; }
     public WebElement getScootJacket() { return scootJacket; }
     public WebElement getAddtoList() { return addtoList; }
     public void ClothingShoesAccessories() { clickOn(getClothingShoesAccessories());}
     public void Clothing() { clickOn(getClothing());}
     public void ScootJacket() { clickOn(getScootJacket());}
     public void AddtoList7() {clickOn(getAddtoList());}

     @FindBy(xpath = "//a[@link-identifier='Shop All ']")
     WebElement shopAll;
     @FindBy(xpath = "//button[@aria-label='Food Gifts & Candy']")
     WebElement foodGiftCandy;
     public WebElement getShopAll() { return shopAll; }
     public WebElement getFoodGiftCandy() { return foodGiftCandy; }
     public void ShopAll() { clickOn(getShopAll()); }
     public void FoodGiftCandy() { clickOn(getFoodGiftCandy()); }

    @FindBy(xpath = "//a[@link-identifier='Services']")
     WebElement services;
     @FindBy(xpath = "//button[contains(text(),'Health Services')]")
     WebElement healthServices;
     @FindBy(xpath = "//header/div[1]/div[2]/div[1]/div[1]/div[1]")
     WebElement pharmacy;
     public WebElement getServices() {return services;}
     public WebElement getHealthServices() {return healthServices;}
     public WebElement getPharmacy() {return pharmacy;}
     public void Services() { clickOn(getServices()); }
     public void HealthServices() {clickOn(getHealthServices());}
     public void Pharmacy() {clickOn(getPharmacy());}

     @FindBy(xpath = "//button[contains(text(),'Flu shot')]")
     WebElement flushot;
     @FindBy(xpath = "//button[contains(text(),'COVID-19 vaccines')]")
     WebElement covid19vaccines;
     @FindBy(xpath = "//button[contains(text(),'Refill Rx')]")
     WebElement refillrx;
     public WebElement getFlushot() {return flushot;}
     public WebElement getCovid19vaccines() {return covid19vaccines;}
     public WebElement getRefillrx() {return refillrx;}
     public void Flushot() {clickOn(getFlushot());}
     public void Covid10Vaciine () {clickOn(getCovid19vaccines());}
     public void RefillRx () {clickOn(getRefillrx());}

     @FindBy(xpath = "//button[contains(text(),'Baby')]")
     WebElement baby;
     @FindBy(xpath = "//button[contains(text(),'Toys & Video Games')]")
     WebElement toysandvideogames;
     @FindBy(xpath = "//button[contains(text(),'Electronics')]")
     WebElement electronics;
     @FindBy(xpath = "//button[contains(text(),'Beauty')]")
     WebElement beauty;
     public WebElement getBaby() {return baby;}
     public WebElement getToysandvideogames() {return toysandvideogames;}
     public WebElement getElectronics() {return electronics;}
     public WebElement getBeauty() {return beauty;}
     public void Baby() {clickOn(getBaby());}
     public void Toysandvideogames () {clickOn(getToysandvideogames());}
     public void Electronics () {clickOn(getElectronics());}
     public void Beauty() {clickOn(getBeauty());}

     @FindBy(xpath = ("//header/div[1]/div[5]/button[1]/i[1]"))
     WebElement cart;
     public WebElement getCart() {return cart;}
     public void Cart() {clickOn(getCart());}

     @FindBy(xpath = ("//a[@Link-identifier='Departments']"))
     WebElement departments;
     public WebElement getDepartments() {return departments;}
     public void hoverOver(WebDriver driver, WebElement element){
         Actions action = new Actions(driver);
         action.moveToElement(departments).build().perform();
         driver.findElement(By.xpath("//header/div[1]/div[1]/a[1]"));}

     @FindBy(xpath = ("//a[contains(text(),'Shop deals')]"))
     WebElement  shopdeals;
     @FindBy(xpath = ("//button[contains(text(),'See times')]"))
     WebElement seetimes;
     public WebElement getShopdeals() {return shopdeals;}
     public WebElement getSeetimes() {return seetimes;}
     public void Shopdeals() {clickOn(getShopdeals());}
     public void seetimes() {clickOn(getSeetimes());}

     @FindBy(xpath = ("//button[contains(text(),'Patio & Garden')]"))
     WebElement patioandgarden;
     @FindBy(xpath = ("//button[contains(text(),'Home Improvement')]"))
     WebElement homeImprovrmrnt;
     public WebElement getPatioandgarden() {return patioandgarden;}
     public WebElement getHomeImprovrmrnt() {return homeImprovrmrnt;}
     public void Patioandgarden() {clickOn(getPatioandgarden());}
     public void HomeImprovement() {clickOn(getHomeImprovrmrnt());}

    @FindBy(xpath = "//header/div[1]/div[3]/div[1]/div[1]/a[3]")
    WebElement registries;public WebElement getRegistries() {return registries;}
    public void registries(){clickOn(getRegistries());}

 }













