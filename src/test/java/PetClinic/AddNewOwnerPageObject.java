package PetClinic;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertEquals;

public class AddNewOwnerPageObject {

    private WebDriver driver;
    private By firstNameField = By.id("firstName");
    private By lastNameFieldId  = By.id("lastName");
    private By adressField = By.id("address");
    private By cityField = By.cssSelector("#city");
    private By telephoneField = By.id("telephone");

    public AddNewOwnerPageObject(WebDriver driver) {
        this.driver = driver;
    }

    //example how to write locators Which can be used a lot of time in a code
    private WebElement getFirstNameField() {
        return driver.findElement(By.id("firstName"));
    }

    @Step("Set first name onto First Name field")
    public void setNameOntoFirstNameField(String name) {

        WebElement setFirstName =getFirstNameField();
        setFirstName.clear();
        setFirstName.sendKeys(name);
    }
    //set one letter on the "Name" field

    @Step("Set invalid first name onto First Name field")
    public void setInvalidNameOntoFirstNameField(String name) {

        WebElement setFirstName = driver.findElement(firstNameField);
        setFirstName.clear();
        setFirstName.sendKeys(name);

        WebElement checkTextOfFirstnameField = driver.findElement(By.xpath("//div/span[@class='help-block']"));
        String checkTextOfFirstnameFieldText =  checkTextOfFirstnameField.getText();

        assertEquals(checkTextOfFirstnameFieldText,"First name must be at least 2 characters long");

    }

    @Step("Set last name onto Last Name field")
    public void setLastnameOntoLastnameField(String lastname) {

        WebElement lastNameField = driver.findElement(lastNameFieldId);
        lastNameField.clear();
        lastNameField.sendKeys(lastname);
    }

    @Step("Set invalid last name onto Last Name field")
    public  void setInvalidLastnameOntoLastnameField(String lastname) {

        WebElement lastNameField = driver.findElement(lastNameFieldId);
        lastNameField.clear();
        lastNameField.sendKeys(lastname);

        WebElement checkTextofLastnameField = driver.findElement(By.xpath("//div/span[@class='help-block']"));
        String checkTextofLastnameFieldText = checkTextofLastnameField.getText();

        assertEquals(checkTextofLastnameFieldText,"Last name must be at least 2 characters long");
    }

    @Step("Set address onto Address field")
    public void setAddressOntoAddressField(String addressOfPet) {

        WebElement adress = driver.findElement(adressField);
        adress.clear();
        adress.sendKeys(addressOfPet);
    }

    @Step("Set invalid address onto Address field")
    public void setInvalidAddressOntoAddressField(String addressOfPet) {

        WebElement addressFieldInvData = driver.findElement(adressField);
        addressFieldInvData.clear();
        addressFieldInvData.sendKeys(addressOfPet);
        addressFieldInvData.sendKeys("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b" +
                "\b\b\b\b\b\b\b\b\b\b\b");

        WebElement checkOfInfMessage = driver.findElement(By.xpath("//div/span[@class='help-block']"));
        String checkOfInfMessageText = checkOfInfMessage.getText();

        assertEquals(checkOfInfMessageText,"Address is required");
    }
    // set one letter onto the field

    @Step("Set invalid city onto City field")
    public void setInvalidCityOntoAddressField(String city) {

        WebElement addressFieldInvData = driver.findElement(cityField);
        addressFieldInvData.clear();
        addressFieldInvData.sendKeys(city);
        addressFieldInvData.sendKeys("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b" +
                "\b\b\b\b\b\b\b\b\b\b\b");

        WebElement checkOfInfMessage = driver.findElement(By.xpath("//div/span[@class='help-block']"));
        String checkOfInfMessageText = checkOfInfMessage.getText();

        assertEquals(checkOfInfMessageText,"City is required");
    }

    @Step("Set city onto City field")
    public void setCityOntoCityField(String city) {

        WebElement cityfield = driver.findElement(cityField);
        cityfield.clear();
        cityfield.sendKeys(city);
    }
    @Step("Set phone number onto Phone Number field")
    public void setPhoneNumberOntoPhoneNumberField(String number) {

        WebElement telephone = driver.findElement(telephoneField);
        telephone.clear();
        telephone.sendKeys(number);
    }

    @Step("Set invalid phone number onto Phone Number field")
    public void setInvalidPhoneNumberOntoPhoneNumberField(String number) {

        WebElement telephone = driver.findElement(telephoneField);
        telephone.clear();
        telephone.sendKeys(number);

        WebElement checkTelephoneField = driver.findElement(By.xpath("//div/span[@class='help-block']"));
        String checkTelephoneFieldText = checkTelephoneField.getText();

        assertEquals(checkTelephoneFieldText,"Phone number only accept digits");
    }
    @Step("Add new owner")
    public void clickAddOwnerButton() {

        WebElement addOwnerButton = driver.findElement(By.xpath("//*[text()='Add Owner']"));
        addOwnerButton.click();
    }
}
