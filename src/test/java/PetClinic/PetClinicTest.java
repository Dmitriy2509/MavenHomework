package PetClinic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class PetClinicTest {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {

        WebDriverManager.chromedriver().setup();


    }

    @BeforeMethod
    public void setUpDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    //positive test case Add new owner
    @Test
    public void AddNewOwnerValidData(){

        String urlOwnerForm = ("http://139.59.149.247:8000/petclinic/owners/add");
        driver.get(urlOwnerForm);

        //Set valid data onto fields

        WebElement firstNameField = driver.findElement(By.id("firstName"));
        firstNameField.clear();
        firstNameField.sendKeys("Dmitriy");

        WebElement lastNameField = driver.findElement(By.cssSelector("#lastName"));
        lastNameField.clear();
        lastNameField.sendKeys("Nobody)");

        WebElement adress = driver.findElement(By.id("address"));
        adress.clear();
        adress.sendKeys("flat 42");

        WebElement city = driver.findElement(By.cssSelector("#city"));
        city.clear();
        city.sendKeys("Dnipro");

        WebElement telephone = driver.findElement(By.id("telephone"));
        telephone.clear();
        telephone.sendKeys("380997258137");

//        WebElement  addOwnerButton = driver.findElement(By.name("Add Owner"));
//        addOwnerButton.click();

    }

    //Negative test

    //Enter name Which lenght is one symbol and check the inforamtion message
    @Test
    public void firstNameFieldCheckInfMessage(){

        String urlOwnerForm = ("http://139.59.149.247:8000/petclinic/owners/add");
        driver.get(urlOwnerForm);

        WebElement firstNameFieldInvalData = driver.findElement(By.id("firstName"));
        firstNameFieldInvalData.clear();
        firstNameFieldInvalData.sendKeys("1");

        WebElement checkTextOfFirstnameField = driver.findElement(By.xpath("//div/span[@class='help-block']"));
        String checkTextOfFirstnameFieldText =  checkTextOfFirstnameField.getText();

        assertEquals(checkTextOfFirstnameFieldText,"First name must be at least 2 characters long");

    }

    //enter one symbol to check appeared information message
    @Test
    public void lastNameFieldCheckInfMessage(){

        String urlOwnerForm = ("http://139.59.149.247:8000/petclinic/owners/add");
        driver.get(urlOwnerForm);

        WebElement lastNameFieldInvalData = driver.findElement(By.id("lastName"));
        lastNameFieldInvalData.clear();
        lastNameFieldInvalData.sendKeys("5");

        WebElement checkTextofLastnameField = driver.findElement(By.xpath("//*[text()='Last name must be at least 2 characters long']"));
        String checkTextofLastnameFieldText = checkTextofLastnameField.getText();

        assertEquals(checkTextofLastnameFieldText,"Last name must be at least 2 characters long");

    }

    //enter letters instead of numbers to check appeared information message
    @Test

    public void telephoneFieldCheckInfMessage(){

        String urlOwnerForm = ("http://139.59.149.247:8000/petclinic/owners/add");
        driver.get(urlOwnerForm);

        WebElement telephoneFieldData = driver.findElement(By.cssSelector("#telephone"));
        telephoneFieldData.clear();
        telephoneFieldData.sendKeys("gr");

        WebElement checkTelephoneField = driver.findElement(By.xpath("//*[text()='Phone number only accept digits']"));
        String checkTelephoneFieldText = checkTelephoneField.getText();

        assertEquals(checkTelephoneFieldText,"Phone number only accept digits");

    }



}
