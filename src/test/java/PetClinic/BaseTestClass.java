package PetClinic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class BaseTestClass {

    public static WebDriver driver;

    @BeforeClass
    public void setUp() {

        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setUpDriver() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }

     //private static WebDriverWait wait = new WebDriverWait(driver,4);
    private static final String url = "http://139.59.149.247:8000/petclinic/";

    //copy paste
    protected static WebDriverWait waitFor() {

        return new WebDriverWait(driver, 4);
    }

    public static void goToUrl(String url) {

        driver.get(url);
    }

    public static void goToNewVeterinarian() {

        goToUrl(url + "vets/add");
        waitFor().until(ExpectedConditions.titleIs("SpringPetclinicAngular"));
    }

    public static void goToNewOwner() {

        goToUrl(url + "owners/add");
        waitFor().until(ExpectedConditions.titleIs("SpringPetclinicAngular"));
    }

    public static void goToPetTypes() {

        goToUrl(url + "pettypes");
        waitFor().until(ExpectedConditions.titleIs("SpringPetclinicAngular"));
    }

    public static void goToSpeciality() {

        goToUrl(url + "specialties");
        //waitFor().until(ExpectedConditions.titleIs("specialties"));
        waitFor().until(ExpectedConditions.titleIs("SpringPetclinicAngular"));
    }

    public static void setNameOntoFirstNameField(String name) {

        WebElement setFirstName = driver.findElement(By.id("firstName"));
        setFirstName.clear();
        setFirstName.sendKeys(name);
    }

    public static void setLastnameOntoLastnameField(String lastname) {

        WebElement lastNameField = driver.findElement(By.cssSelector("#lastName"));
        lastNameField.clear();
        lastNameField.sendKeys(lastname);
    }

    //new veterinarian
    public static void chooseSpecialties(String specialties) {

        WebElement dropdown = driver.findElement(By.id("specialties"));
        Select select = new Select(dropdown);
        select.selectByVisibleText(specialties);
    }

    public static void saveProfileOfVeterinarian() {

        WebElement saveVetButton = driver.findElement(By.xpath("//*[text()='Save Vet']"));
        saveVetButton.click();
    }
    //petClinic

    public static void setAddressOntoAddressField(String addressOfPet) {

        WebElement adress = driver.findElement(By.id("address"));
        adress.clear();
        adress.sendKeys(addressOfPet);
    }

    public static void setCityOntoCityField() {

        WebElement city = driver.findElement(By.cssSelector("#city"));
        city.clear();
        city.sendKeys("Dnipro");
    }

    public static void setPhoneNumberOntoPhoneNumberField() {

        WebElement telephone = driver.findElement(By.id("telephone"));
        telephone.clear();
        telephone.sendKeys("380997258137");
    }

    public static void clickAddOwnerButton() {

        WebElement addOwnerButton = driver.findElement(By.xpath("//*[text()='Add Owner']"));
        addOwnerButton.click();
    }

//    public static void addressFieldInvData() {
//
//        WebElement addressFieldInvData = driver.findElement(By.id("address"));
//        addressFieldInvData.clear();
//        addressFieldInvData.sendKeys("a");
//        addressFieldInvData.sendKeys("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b" +
//                "\b\b\b\b\b\b\b\b\b\b\b");
//    }
//
//    public static void cityFieldInvData() {
//
//        WebElement cityField = driver.findElement(By.id("city"));
//        cityField.clear();
//        cityField.sendKeys("q");
//        cityField.sendKeys("\b\b\b\b\b\b\b\b\b\b\b\b");
//    }

    public static void checkAddressOrCityInvalidData(String id) {

        WebElement addressFieldInvData = driver.findElement(By.id(id));
        addressFieldInvData.clear();
        addressFieldInvData.sendKeys("a");
        addressFieldInvData.sendKeys("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b" +
                "\b\b\b\b\b\b\b\b\b\b\b");
    }

    public static void checkInfMessageTelephoneField() {

        WebElement telephoneFieldData = driver.findElement(By.cssSelector("#telephone"));
        telephoneFieldData.clear();
        telephoneFieldData.sendKeys("gr");
    }

    public static void message() {

        WebElement checkTelephoneField = driver.findElement(By.xpath("//div/span[@class='help-block']"));
        String checkTelephoneFieldText = checkTelephoneField.getText();
    }

    //pet types
    public static void addNewPetTypesOpenField() {

        WebElement clickOnAddButton = driver.findElement(By.xpath("//*[normalize-space(text()) ='Add']"));
        clickOnAddButton.click();

    }

    public static void addNewType(String type) {

        WebElement addTypeOfAnimal = driver.findElement(By.id("name"));
        addTypeOfAnimal.clear();
        addTypeOfAnimal.sendKeys(type);
    }

    public static void clickSave() {

        WebElement clickSave = driver.findElement(By.xpath("//*[text()='Save']"));
    }

    public static void clickAddButton() {

        WebElement addButton = driver.findElement(By.xpath("//*[normalize-space(text())='Add']"));
        addButton.click();
    }

    public static void setNameSpeciality(String nameSpeciality) {

        WebElement nameField = driver.findElement(By.id("name"));
        WebElement homeBtn = waitFor().until(ExpectedConditions
                .visibilityOfElementLocated(By.id("name")));
        waitFor().until(ExpectedConditions.visibilityOf(nameField));
        nameField.clear();
        nameField.sendKeys(nameSpeciality);
    }

    public static void clickSaveButton() {

        WebElement clickSaveButton = driver.findElement(By.xpath("//*[text()='Save']"));
        clickSaveButton.click();
    }

}
