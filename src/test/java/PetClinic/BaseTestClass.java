package PetClinic;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Step;
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

    public WebDriver driver;

    @BeforeClass
    public void setUp() {

        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setUpDriver() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }

     //private static WebDriverWait wait = new WebDriverWait(driver,4);
    private static final String url = "http://139.59.149.247:8000/petclinic";

    //copy paste
    protected WebDriverWait waitFor() {

        return new WebDriverWait(driver, 5);
    }

    public void goToUrl(String url) {

        driver.get(url);
    }
    @Step("Go to New Veterinarian page")
    public  NewVeterinarianPageObject goToNewVeterinarian() {

        goToUrl(url + "/vets/add");
        waitFor().until(ExpectedConditions.titleIs("SpringPetclinicAngular"));
        return new NewVeterinarianPageObject(driver);
    }
    @Step("Go to New Owner page")
    public  AddNewOwnerPageObject goToNewOwner() {

        goToUrl(url + "/owners/add");
        waitFor().until(ExpectedConditions.titleIs("SpringPetclinicAngular"));
        return new AddNewOwnerPageObject(driver);
    }
    @Step ("Go to Pet Types page")
    public void goToPetTypes() {

        goToUrl(url + "/pettypes");
        waitFor().until(ExpectedConditions.titleIs("SpringPetclinicAngular"));
//        return new PetTypesPageObject(driver);
    }
    @Step("Go to Speciality page")
    public void goToSpeciality() {

        goToUrl(url + "/specialties");
        //waitFor().until(ExpectedConditions.titleIs("specialties"));
        waitFor().until(ExpectedConditions.titleIs("SpringPetclinicAngular"));
//        return new SpecialtiesPageObject(driver);
    }

    //code below is modified and
    /*
    public void setNameOntoFirstNameField(String name) {

        WebElement setFirstName = driver.findElement(By.id("firstName"));
        setFirstName.clear();
        setFirstName.sendKeys(name);
    }

    public  void setLastnameOntoLastnameField(String lastname) {

        WebElement lastNameField = driver.findElement(By.cssSelector("#lastName"));
        lastNameField.clear();
        lastNameField.sendKeys(lastname);
    }

    public  void setInvalidLastnameOntoLastnameField(String lastname) {

        WebElement lastNameField = driver.findElement(By.cssSelector("#lastName"));
        lastNameField.clear();
        lastNameField.sendKeys(lastname);
    }

    //new veterinarian
    public void chooseSpecialties(String specialties) {

        WebElement dropdown = driver.findElement(By.id("specialties"));
        Select select = new Select(dropdown);
        select.selectByVisibleText(specialties);
    }

    public void saveProfileOfVeterinarian() {

        WebElement saveVetButton = driver.findElement(By.xpath("//*[text()='Save Vet']"));
        saveVetButton.click();
    }
    //petClinic

    public void setAddressOntoAddressField(String addressOfPet) {

        WebElement adress = driver.findElement(By.id("address"));
        adress.clear();
        adress.sendKeys(addressOfPet);
    }

    public void setCityOntoCityField(String city) {

        WebElement cityfield = driver.findElement(By.cssSelector("#city"));
        cityfield.clear();
        cityfield.sendKeys(city);
    }

    public  void setPhoneNumberOntoPhoneNumberField(String number) {

        WebElement telephone = driver.findElement(By.id("telephone"));
        telephone.clear();
        telephone.sendKeys(number);
    }

    public void clickAddOwnerButton() {

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

    public void checkAddressOrCityInvalidData(String id) {

        WebElement addressFieldInvData = driver.findElement(By.id(id));
        addressFieldInvData.clear();
        addressFieldInvData.sendKeys("a");
        addressFieldInvData.sendKeys("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b" +
                "\b\b\b\b\b\b\b\b\b\b\b");
    }

    public void checkInfMessageTelephoneField(String number) {

        WebElement telephoneFieldData = driver.findElement(By.cssSelector("#telephone"));
        telephoneFieldData.clear();
        telephoneFieldData.sendKeys(number);
    }

    public void message() {

        WebElement checkTelephoneField = driver.findElement(By.xpath("//div/span[@class='help-block']"));
        String checkTelephoneFieldText = checkTelephoneField.getText();
    }

    //pet types
    public void addNewPetTypesOpenField() {

        WebElement clickOnAddButton = driver.findElement(By.xpath("//*[normalize-space(text()) ='Add']"));
        clickOnAddButton.click();

    }

    public void addNewType(String type) {

        WebElement addTypeOfAnimal = driver.findElement(By.id("name"));
        addTypeOfAnimal.clear();
        addTypeOfAnimal.sendKeys(type);
    }

    public void clickSave() {

        WebElement clickSave = driver.findElement(By.xpath("//*[text()='Save']"));
    }

    public void clickAddButton() {

        WebElement addButton = driver.findElement(By.xpath("//*[normalize-space(text())='Add']"));
        addButton.click();
    }

    public void setNameSpeciality(String nameSpeciality) {

        WebElement nameField = driver.findElement(By.id("name"));
        WebElement homeBtn = waitFor().until(ExpectedConditions
                .visibilityOfElementLocated(By.id("name")));
        waitFor().until(ExpectedConditions.visibilityOf(nameField));
        nameField.clear();
        nameField.sendKeys(nameSpeciality);
    }

    public void clickSaveButton() {

        WebElement clickSaveButton = driver.findElement(By.xpath("//*[text()='Save']"));
        clickSaveButton.click();
    }
    */
}
