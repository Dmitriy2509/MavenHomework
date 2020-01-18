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

public class PetClinicTest extends BaseTestClass {
/*
    //positive test case Add new owner
    @Test
    public void AddNewOwnerValidData(){

        //Set valid data onto fields
//        String urlOwnerForm = ("http://139.59.149.247:8000/petclinic/owners/add");
//        driver.get(urlOwnerForm);
        goToNewOwner();

//        WebElement firstNameField = driver.findElement(By.id("firstName"));
//        firstNameField.clear();
//        firstNameField.sendKeys("Dmitriy");
        setNameOntoFirstNameField("Dmitriy");

//        WebElement lastNameField = driver.findElement(By.cssSelector("#lastName"));
////        lastNameField.clear();
////        lastNameField.sendKeys("Nobody)");
        setLastnameOntoLastnameField("D");

//        WebElement adress = driver.findElement(By.id("address"));
//        adress.clear();
//        adress.sendKeys("flat 42");
        setAddressOntoAddressField("flat 20");

//        WebElement city = driver.findElement(By.cssSelector("#city"));
//        city.clear();
//        city.sendKeys("Dnipro");
        setCityOntoCityField("Dnipro");

//        WebElement telephone = driver.findElement(By.id("telephone"));
//        telephone.clear();
//        telephone.sendKeys("380997258137");
        setPhoneNumberOntoPhoneNumberField("380994595271");

//       WebElement  addOwnerButton = driver.findElement(By.xpath("//*[text()='Add Owner']"));
//       addOwnerButton.click();
        clickAddOwnerButton();
    }

    //Negative test
    //Enter name Which lenght is one symbol and check the inforamtion message
    @Test
    public void firstNameFieldCheckInfMessage(){

//        String urlOwnerForm = ("http://139.59.149.247:8000/petclinic/owners/add");
//        driver.get(urlOwnerForm);
        goToNewOwner();

//        WebElement firstNameFieldInvalData = driver.findElement(By.id("firstName"));
//        firstNameFieldInvalData.clear();
//        firstNameFieldInvalData.sendKeys("1");
        setNameOntoFirstNameField("1");

        WebElement checkTextOfFirstnameField = driver.findElement(By.xpath("//div/span[@class='help-block']"));
        String checkTextOfFirstnameFieldText =  checkTextOfFirstnameField.getText();

        assertEquals(checkTextOfFirstnameFieldText,"First name must be at least 2 characters long");
    }

    //enter one symbol to check appeared information message
    @Test
    public void lastNameFieldCheckInfMessage(){

//        String urlOwnerForm = ("http://139.59.149.247:8000/petclinic/owners/add");
//        driver.get(urlOwnerForm);
        goToNewOwner();

//        WebElement lastNameFieldInvalData = driver.findElement(By.id("lastName"));
//        lastNameFieldInvalData.clear();
//        lastNameFieldInvalData.sendKeys("5");
        setLastnameOntoLastnameField("5");

        WebElement checkTextofLastnameField = driver.findElement(By.xpath("//div/span[@class='help-block']"));
        String checkTextofLastnameFieldText = checkTextofLastnameField.getText();

        assertEquals(checkTextofLastnameFieldText,"Last name must be at least 2 characters long");
    }

    @Test
    public void addressFieldCheckInfMessage(){

//        String urlOwnerForm = ("http://139.59.149.247:8000/petclinic/owners/add");
//        driver.get(urlOwnerForm);
        goToNewOwner();

//        WebElement addressFieldInvData = driver.findElement(By.id("address"));
//        addressFieldInvData.clear();
//        addressFieldInvData.sendKeys("a");
//        addressFieldInvData.sendKeys("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b" +
//         "\b\b\b\b\b\b\b\b\b\b\b");
        checkAddressOrCityInvalidData("address");

        WebElement checkOfInfMessage = driver.findElement(By.xpath("//div/span[@class='help-block']"));
        String checkOfInfMessageText = checkOfInfMessage.getText();

        assertEquals(checkOfInfMessageText,"Address is required");
    }

    //negative case
    @Test
    public void cityFieldCheckInfMessage(){

//        String urlOwnerForm = ("http://139.59.149.247:8000/petclinic/owners/add");
//        driver.get(urlOwnerForm);
        goToNewOwner();

//        WebElement cityField =driver.findElement(By.id("city"));
//        cityField.clear();
//        cityField.sendKeys("q");
//        cityField.sendKeys("\b\b\b\b\b\b\b\b\b\b\b\b");
        checkAddressOrCityInvalidData("city");

        WebElement cityFieldInvData  = driver.findElement(By.xpath("//div/span[@class='help-block']"));
        String cityFieldInvDataText = cityFieldInvData.getText();
//
        assertEquals(cityFieldInvDataText,"City is required");
    }

    //enter letters instead of numbers to check appeared information message
    @Test
    public void telephoneFieldCheckInfMessage(){

//        String urlOwnerForm = ("http://139.59.149.247:8000/petclinic/owners/add");
//        driver.get(urlOwnerForm);
        goToNewOwner();

//        WebElement telephoneFieldData = driver.findElement(By.cssSelector("#telephone"));
//        telephoneFieldData.clear();
//        telephoneFieldData.sendKeys("gr");
        checkInfMessageTelephoneField("dsf");

       WebElement checkTelephoneField = driver.findElement(By.xpath("//div/span[@class='help-block']"));
       String checkTelephoneFieldText = checkTelephoneField.getText();

        assertEquals(checkTelephoneFieldText,"Phone number only accept digits");
    }


*/
}
