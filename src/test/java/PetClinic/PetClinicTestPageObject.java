package PetClinic;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Epic("Petclicnic")
@Feature("Owner")
public class PetClinicTestPageObject extends BaseTestClass {
    //exmple how to write class one time instead of a lot
//    private AddNewOwnerPageObject addNewOwnerPageObject;
//    private NewVeterinarianPageObject newVeterinarianPageObject;
//    private PetTypesPageObject petTypesPageObject;
//    private SpecialtiesPageObject specialtiesPageObject;

//    @BeforeMethod
//    public void gotopage() {
//        addNewOwnerPageObject = goToNewOwner();
//    }
//
//    public void goToPetTypesPage(){
//
//        petTypesPageObject = goToPetTypes();
//    }
//
//    public void goToVeterinarian(){
//
//        newVeterinarianPageObject = goToNewVeterinarian();
//    }
//    public void goTospecialityPageObject(){
//        specialtiesPageObject= goToSpeciality();
//    }
    @Story("Create Owner")
    @Severity(SeverityLevel.BLOCKER)
    @Test(description = "Add new valid Owner test")
    public void AddNewOwnerValidData(){

        AddNewOwnerPageObject addNewOwnerPageObject =goToNewOwner();

       addNewOwnerPageObject.setNameOntoFirstNameField("Dmitriy");
       addNewOwnerPageObject.setLastnameOntoLastnameField("Harris");
       addNewOwnerPageObject.setAddressOntoAddressField("flat 20");
       addNewOwnerPageObject.setCityOntoCityField("Dnipro");
       addNewOwnerPageObject.setPhoneNumberOntoPhoneNumberField("380994595271");
       addNewOwnerPageObject.clickAddOwnerButton();
    }
    //negative test case
    @Story("Information message about invalid first name")
    @Severity(SeverityLevel.NORMAL)
    @Test(description = "Enter invalid name onto first name field")
    public void firstNameFieldCheckInfMessage(){

        AddNewOwnerPageObject addNewOwnerPageObject =goToNewOwner();

        addNewOwnerPageObject.setInvalidNameOntoFirstNameField("1");
    }

    @Story("Information message about invalid last name")
    @Severity(SeverityLevel.NORMAL)
    @Test(description = "Enter invalid last name onto last name field")
    public void lastNameFieldCheckInfMessage(){

        AddNewOwnerPageObject addNewOwnerPageObject =goToNewOwner();

        addNewOwnerPageObject.setInvalidLastnameOntoLastnameField("D");
    }

    @Story("Information message about invalid address")
    @Severity(SeverityLevel.NORMAL)
    @Test (description = "Enter invalid address onto address field")
    public void addressFieldCheckInfMessage(){

        AddNewOwnerPageObject addNewOwnerPageObject =goToNewOwner();

        addNewOwnerPageObject.setInvalidAddressOntoAddressField("Ab");
    }

    @Story("Information message about invalid city")
    @Severity(SeverityLevel.NORMAL)
    @Test (description = "Enter invalid city onto city field")
    public void cityFieldCheckInfMessage(){

        AddNewOwnerPageObject addNewOwnerPageObject =goToNewOwner();

        addNewOwnerPageObject.setInvalidCityOntoAddressField("Z");
    }

    @Story("Information message about invalid telephone")
    @Severity(SeverityLevel.NORMAL)
    @Test (description = "Enter invalid telephone number onto telephone field")
    public void telephoneFieldCheckInfMessage(){

        AddNewOwnerPageObject addNewOwnerPageObject =goToNewOwner();

        addNewOwnerPageObject.setInvalidPhoneNumberOntoPhoneNumberField("df");
    }

    //positive addNewVeterinarian
    @Feature("Veterinarian")
    @Story("Create Veterinarian")
    @Severity(SeverityLevel.BLOCKER)
    @Test(description = "Create Veterinarian")
    public void addNewVeterinarian(){
        NewVeterinarianPageObject newVeterinarianPageObject= goToNewVeterinarian();

        newVeterinarianPageObject.setNameOntoFirstNameField("Dmitriy");
        newVeterinarianPageObject.setLastnameOntoLastnameField("Harris");
        newVeterinarianPageObject.chooseSpecialties(" dentistry ");
        newVeterinarianPageObject.saveProfileOfVeterinarian();
    }

    //negative addNewVeterinarian
    @Story("Information message about invalid first name")
    @Severity(SeverityLevel.NORMAL)
    @Test (description = "Enter invalid first name onto first name field")
    public void checkInfMessageFirstName(){
        NewVeterinarianPageObject newVeterinarianPageObject= goToNewVeterinarian();

        newVeterinarianPageObject.setInvalidNameOntoFirstNameField("P");
    }

    @Story("Information message about invalid last name")
    @Severity(SeverityLevel.NORMAL)
    @Test (description = "Enter invalid last name onto last name field")
    public void checkInfMessageLastName(){
        NewVeterinarianPageObject newVeterinarianPageObject= goToNewVeterinarian();

        newVeterinarianPageObject.setInvalidLastnameOntoLastnameField("h");
    }

    //positive PetTypes
    @Feature("Add Pet Type")
    @Story("Add PetType")
    @Severity(SeverityLevel.BLOCKER)
    @Test(description = "Create PetType")
    public void addNewPetTypeToList (){
        PetTypesPageObject petTypesPageObject= new PetTypesPageObject(driver) ;
        goToPetTypes();
        petTypesPageObject.addNewPetTypesOpenField();
        petTypesPageObject.addNewType("guinea pig");
        petTypesPageObject.clickSave();
    }

    //positive Specialties
    @Feature("Add Specialty")
    @Story("Add Specialty")
    @Severity(SeverityLevel.BLOCKER)
    @Test(description = "Create Specialty")
    public void addSpecialty  (){
        SpecialtiesPageObject specialtiesPageObject = new SpecialtiesPageObject(driver);
        goToSpeciality();
        specialtiesPageObject.clickAddButton();
        specialtiesPageObject.setNameSpeciality("tough man");
        specialtiesPageObject.clickSaveButton();
    }
}
