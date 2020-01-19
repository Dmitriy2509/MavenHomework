package PetClinic;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.testng.Assert.assertEquals;

public class NewVeterinarianPageObject {

    private  WebDriver driver;

    public NewVeterinarianPageObject(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Set name onto First name field")
    public  void setNameOntoFirstNameField(String name) {

        WebElement setFirstName = driver.findElement(By.id("firstName"));
        setFirstName.clear();
        setFirstName.sendKeys(name);
    }
    //enter one letter

    @Step("Set invalid name onto First name field")
    public  void setInvalidNameOntoFirstNameField(String name) {

        WebElement setFirstName = driver.findElement(By.id("firstName"));
        setFirstName.clear();
        setFirstName.sendKeys(name);

        WebElement checkInfMessage = driver.findElement(By.xpath("//div/span[@class='help-block']"));
        String checkInfMessageText = checkInfMessage.getText();

        assertEquals(checkInfMessageText,"First name must be at least 2 characters long");
    }

    //enter one letter
    @Step("Set last name onto Last Name field")
    public  void setLastnameOntoLastnameField(String lastname) {

        WebElement lastNameField = driver.findElement(By.cssSelector("#lastName"));
        lastNameField.clear();
        lastNameField.sendKeys(lastname);
    }

    @Step("Set invalid last name onto Last Name field")
    public  void setInvalidLastnameOntoLastnameField(String lastname) {

        WebElement lastNameField = driver.findElement(By.cssSelector("#lastName"));
        lastNameField.clear();
        lastNameField.sendKeys(lastname);

        WebElement lastNameInfMessage = driver.findElement(By.xpath("//div/span[@class='help-block']"));
        String lastNameInfMessageText = lastNameInfMessage.getText();

        assertEquals(lastNameInfMessageText,"Last name must be at least 2 characters long");
    }

    @Step("Choose specialty from dropdown menu")
    public void chooseSpecialties(String specialties) {

        WebElement dropdown = driver.findElement(By.id("specialties"));
        Select select = new Select(dropdown);
        select.selectByVisibleText(specialties);
    }

    @Step("Add new veterinarian")
    public void saveProfileOfVeterinarian() {

        WebElement saveVetButton = driver.findElement(By.xpath("//*[text()='Save Vet']"));
        saveVetButton.click();
    }


}
