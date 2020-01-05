package PetClinic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertEquals;

public class AddNewOwnerPageObject {

    private WebDriver driver;

    public AddNewOwnerPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void setNameOntoFirstNameField(String name) {

        WebElement setFirstName = driver.findElement(By.id("firstName"));
        setFirstName.clear();
        setFirstName.sendKeys(name);
    }
    //set one letter on the "Name" field
    public void setInvalidNameOntoFirstNameField(String name) {

        WebElement setFirstName = driver.findElement(By.id("firstName"));
        setFirstName.clear();
        setFirstName.sendKeys(name);

        WebElement checkTextOfFirstnameField = driver.findElement(By.xpath("//div/span[@class='help-block']"));
        String checkTextOfFirstnameFieldText =  checkTextOfFirstnameField.getText();

        assertEquals(checkTextOfFirstnameFieldText,"First name must be at least 2 characters long");

    }

    public void setLastnameOntoLastnameField(String lastname) {

        WebElement lastNameField = driver.findElement(By.cssSelector("#lastName"));
        lastNameField.clear();
        lastNameField.sendKeys(lastname);
    }

    public  void setInvalidLastnameOntoLastnameField(String lastname) {

        WebElement lastNameField = driver.findElement(By.cssSelector("#lastName"));
        lastNameField.clear();
        lastNameField.sendKeys(lastname);

        WebElement checkTextofLastnameField = driver.findElement(By.xpath("//div/span[@class='help-block']"));
        String checkTextofLastnameFieldText = checkTextofLastnameField.getText();

        assertEquals(checkTextofLastnameFieldText,"Last name must be at least 2 characters long");
    }

    public void setAddressOntoAddressField(String addressOfPet) {

        WebElement adress = driver.findElement(By.id("address"));
        adress.clear();
        adress.sendKeys(addressOfPet);
    }

    public void setInvalidAddressOntoAddressField(String addressOfPet) {


        WebElement addressFieldInvData = driver.findElement(By.id("address"));
        addressFieldInvData.clear();
        addressFieldInvData.sendKeys(addressOfPet);
        addressFieldInvData.sendKeys("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b" +
                "\b\b\b\b\b\b\b\b\b\b\b");

        WebElement checkOfInfMessage = driver.findElement(By.xpath("//div/span[@class='help-block']"));
        String checkOfInfMessageText = checkOfInfMessage.getText();

        assertEquals(checkOfInfMessageText,"Address is required");
    }
    // set one letter onto the field
    public void setInvalidCityOntoAddressField(String city) {


        WebElement addressFieldInvData = driver.findElement(By.id("city"));
        addressFieldInvData.clear();
        addressFieldInvData.sendKeys(city);
        addressFieldInvData.sendKeys("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b" +
                "\b\b\b\b\b\b\b\b\b\b\b");

        WebElement checkOfInfMessage = driver.findElement(By.xpath("//div/span[@class='help-block']"));
        String checkOfInfMessageText = checkOfInfMessage.getText();

        assertEquals(checkOfInfMessageText,"City is required");
    }


    public void setCityOntoCityField(String city) {

        WebElement cityfield = driver.findElement(By.cssSelector("#city"));
        cityfield.clear();
        cityfield.sendKeys(city);
    }

    public void setPhoneNumberOntoPhoneNumberField(String number) {

        WebElement telephone = driver.findElement(By.id("telephone"));
        telephone.clear();
        telephone.sendKeys(number);
    }

    public void setInvalidPhoneNumberOntoPhoneNumberField(String number) {

        WebElement telephone = driver.findElement(By.id("telephone"));
        telephone.clear();
        telephone.sendKeys(number);

        WebElement checkTelephoneField = driver.findElement(By.xpath("//div/span[@class='help-block']"));
        String checkTelephoneFieldText = checkTelephoneField.getText();

        assertEquals(checkTelephoneFieldText,"Phone number only accept digits");
    }

    public void clickAddOwnerButton() {

        WebElement addOwnerButton = driver.findElement(By.xpath("//*[text()='Add Owner']"));
        addOwnerButton.click();
    }
}
