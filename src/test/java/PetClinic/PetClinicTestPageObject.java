package PetClinic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PetClinicTestPageObject extends BaseTestClass {

    @Test
    public void AddNewOwnerValidData(){
         AddNewOwnerPageObject addNewOwnerPageObject = new AddNewOwnerPageObject(driver);
       goToNewOwner();
       addNewOwnerPageObject.setNameOntoFirstNameField("Dmitriy");
       addNewOwnerPageObject.setLastnameOntoLastnameField("Harris");
       addNewOwnerPageObject.setAddressOntoAddressField("flat 20");
       addNewOwnerPageObject.setCityOntoCityField("Dnipro");
       addNewOwnerPageObject.setPhoneNumberOntoPhoneNumberField("380994595271");
       addNewOwnerPageObject.clickAddOwnerButton();
    }
    //negative test case

    @Test
    public void firstNameFieldCheckInfMessage(){
        AddNewOwnerPageObject addNewOwnerPageObject = new AddNewOwnerPageObject(driver);

        goToNewOwner();
        addNewOwnerPageObject.setInvalidNameOntoFirstNameField("1");
    }

    @Test
    public void lastNameFieldCheckInfMessage(){
        AddNewOwnerPageObject addNewOwnerPageObject = new AddNewOwnerPageObject(driver);

        goToNewOwner();
        addNewOwnerPageObject.setInvalidLastnameOntoLastnameField("D");
    }

    @Test
    public void addressFieldCheckInfMessage(){
        AddNewOwnerPageObject addNewOwnerPageObject = new AddNewOwnerPageObject(driver);

        goToNewOwner();
        addNewOwnerPageObject.setInvalidAddressOntoAddressField("Ab");

    }

    @Test
    public void cityFieldCheckInfMessage(){
        AddNewOwnerPageObject addNewOwnerPageObject = new AddNewOwnerPageObject(driver);

        goToNewOwner();
        addNewOwnerPageObject.setInvalidCityOntoAddressField("Z");
    }

    @Test
    public void telephoneFieldCheckInfMessage(){
        AddNewOwnerPageObject addNewOwnerPageObject = new AddNewOwnerPageObject(driver);

        goToNewOwner();
        addNewOwnerPageObject.setInvalidPhoneNumberOntoPhoneNumberField("df");
    }

    //positive addNewVeterinarian
    @Test
    public void addNewVeterinarian(){
        NewVeterinarianPageObject newVeterinarianPageObject = new NewVeterinarianPageObject(driver);

        goToNewVeterinarian();
        newVeterinarianPageObject.setNameOntoFirstNameField("Dmitriy");
        newVeterinarianPageObject.setLastnameOntoLastnameField("Harris");
        newVeterinarianPageObject.chooseSpecialties(" dentistry ");
        newVeterinarianPageObject.saveProfileOfVeterinarian();
    }

    //negative addNewVeterinarian

    @Test
    public void checkInfMessageFirstName(){
        NewVeterinarianPageObject newVeterinarianPageObject = new NewVeterinarianPageObject(driver);

        goToNewVeterinarian();
        newVeterinarianPageObject.setInvalidNameOntoFirstNameField("P");
    }

    @Test
    public void checkInfMessageLastName(){
        NewVeterinarianPageObject newVeterinarianPageObject = new NewVeterinarianPageObject(driver);

        goToNewVeterinarian();
        newVeterinarianPageObject.setInvalidLastnameOntoLastnameField("h");
    }

    //positive PetTypes
    @Test
    public void addNewPetTypeToList (){
        PetTypesPageObject petTypesPageObject = new PetTypesPageObject(driver);

        goToPetTypes();
        petTypesPageObject.addNewPetTypesOpenField();
        petTypesPageObject.addNewType("guinea pig");
        petTypesPageObject.clickSave();
    }

    //positive Specialties
    @Test
    public void addSpecialty  (){
        SpecialtiesPageObject specialtiesPageObject = new SpecialtiesPageObject(driver);

        goToSpeciality();
        specialtiesPageObject.clickAddButton();
        specialtiesPageObject.setNameSpeciality("tough man");
        specialtiesPageObject.clickSaveButton();
    }
}
