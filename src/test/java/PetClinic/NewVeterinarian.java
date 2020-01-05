package PetClinic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class NewVeterinarian extends BaseTestClass {

    @Test
    //positive case
    public void addNewVeterinarian(){

//       String url = ("http://139.59.149.247:8000/petclinic/vets/add");
//       driver.get(url);
//        goToUrl("http://139.59.149.247:8000/petclinic/vets/add");
        goToNewVeterinarian();

//        WebElement setFirstName = driver.findElement(By.id("firstName"));
//        setFirstName.clear();
//        setFirstName.sendKeys("Dmitriy");
        setNameOntoFirstNameField("Dmitriy");

//        WebElement setLastName = driver.findElement(By.id("lastName"));
//        setLastName.clear();
//        setLastName.sendKeys("Bond");
        setLastnameOntoLastnameField("Tiger");

//        WebElement divClick = driver.findElement(By.xpath("//div/select"));
//        divClick.click();

//        WebElement dropdown = driver.findElement(By.id("specialties"));
//        Select select = new Select (dropdown);
//        select.selectByVisibleText(" dentistry ");
        chooseSpecialties(" dentistry ");

//        WebElement saveVetButton = driver.findElement(By.xpath("//*[text()='Save Vet']"));
//        saveVetButton.click();
        saveProfileOfVeterinarian();
    }

    //negative
    @Test
    public  void checkInfMessageFirstName(){

//        String url = ("http://139.59.149.247:8000/petclinic/vets/add");
//        driver.get(url);
        goToNewVeterinarian();

//        WebElement firstName = driver.findElement(By.id("firstName"));
//        firstName.clear();
//        firstName.sendKeys("D");
        setNameOntoFirstNameField("f");

        WebElement checkInfMessage = driver.findElement(By.xpath("//div/span[@class='help-block']"));
        String checkInfMessageText = checkInfMessage.getText();

        assertEquals(checkInfMessageText,"First name must be at least 2 characters long");
    }

    @Test
    public void checkInfMessageLastName(){

//        String url = ("http://139.59.149.247:8000/petclinic/vets/add");
//        driver.get(url);
        goToNewVeterinarian();

//        WebElement lastName = driver.findElement(By.id("lastName"));
//        lastName.clear();
//        lastName.sendKeys("D");
        setLastnameOntoLastnameField("D");

        WebElement lastNameInfMessage = driver.findElement(By.xpath("//div/span[@class='help-block']"));
        String lastNameInfMessageText = lastNameInfMessage.getText();

        assertEquals(lastNameInfMessageText,"Last name must be at least 2 characters long");
    }


}
