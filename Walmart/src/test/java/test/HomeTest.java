package test;

    import base.CommonAPI;
    import homePage.Home;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.interactions.Actions;
    import org.openqa.selenium.support.PageFactory;
    import org.testng.annotations.Test;

public class HomeTest extends CommonAPI {

    @Test
    public void test1() throws InterruptedException {
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getDropDownDepartment();
        homePage.getGrocery();
        homePage.getChips();
        waitFor(3);}
    @Test
    public void test2() throws InterruptedException {
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getDropDownDepartment();
        homePage.getClothingShoesAccessories();
        homePage.getClothing();
        waitFor(3);}
    @Test
    public void test3() throws InterruptedException {
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getDropDownDepartment();
        homePage.getGrocery();
        homePage.getShopAll();
        homePage.getFoodGiftCandy();
        waitFor(1);}
    @Test
    public void test4() throws InterruptedException {
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getServices();
        homePage.getPharmacy();
        homePage.getHealthServices();
        waitFor(1);}
    @Test
    public void test5() throws InterruptedException {
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getFlushot();
        homePage.getCovid19vaccines();
        homePage.getRefillrx();
        waitFor(1);}
    @Test
    public void test6() throws InterruptedException {
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getBaby();
        homePage.getToysandvideogames();
        homePage.getElectronics();
        homePage.getBeauty();
        waitFor(1);}
    @Test
    public void test7() throws InterruptedException {
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getCart();
        waitFor(1);}
    @Test
    public void test8() throws InterruptedException {
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getDepartments();
        waitFor(1);}
    @Test
    public void test9() throws InterruptedException {
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getShopdeals();
        homePage.getSeetimes();
        waitFor(1);}
    @Test
    public void test10() throws InterruptedException {
        Home homePage = PageFactory.initElements(driver, Home.class);
        homePage.getPatioandgarden();
        homePage.getHomeImprovrmrnt();}
}
