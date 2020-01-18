package PetClinic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PetClinicTestPageObject extends BaseTestClass {
    //exmple how to write class one time instead of a lot
//    private AddNewOwnerPageObject addNewOwnerPageObject;
//    private NewVeterinarianPageObject newVeterinarianPageObject;
//    private PetTypesPageObject petTypesPageObject;
//    private SpecialtiesPageObject specialtiesPageObject;

    @BeforeMethod
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

    @Test
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

    @Test
    public void firstNameFieldCheckInfMessage(){

        AddNewOwnerPageObject addNewOwnerPageObject =goToNewOwner();

        addNewOwnerPageObject.setInvalidNameOntoFirstNameField("1");
    }

    @Test
    public void lastNameFieldCheckInfMessage(){

        AddNewOwnerPageObject addNewOwnerPageObject =goToNewOwner();

        addNewOwnerPageObject.setInvalidLastnameOntoLastnameField("D");
    }

    @Test
    public void addressFieldCheckInfMessage(){

        AddNewOwnerPageObject addNewOwnerPageObject =goToNewOwner();

        addNewOwnerPageObject.setInvalidAddressOntoAddressField("Ab");
    }

    @Test
    public void cityFieldCheckInfMessage(){

        AddNewOwnerPageObject addNewOwnerPageObject =goToNewOwner();

        addNewOwnerPageObject.setInvalidCityOntoAddressField("Z");
    }

    @Test
    public void telephoneFieldCheckInfMessage(){

        AddNewOwnerPageObject addNewOwnerPageObject =goToNewOwner();

        addNewOwnerPageObject.setInvalidPhoneNumberOntoPhoneNumberField("df");
    }

    //positive addNewVeterinarian
    @Test
    public void addNewVeterinarian(){
    NewVeterinarianPageObject newVeterinarianPageObject= goToNewVeterinarian();

        goToNewVeterinarian();
        newVeterinarianPageObject.setNameOntoFirstNameField("Dmitriy");
        newVeterinarianPageObject.setLastnameOntoLastnameField("Harris");
        newVeterinarianPageObject.chooseSpecialties(" dentistry ");
        newVeterinarianPageObject.saveProfileOfVeterinarian();
    }

    //negative addNewVeterinarian

    @Test
    public void checkInfMessageFirstName(){
        NewVeterinarianPageObject newVeterinarianPageObject= goToNewVeterinarian();
        newVeterinarianPageObject.setInvalidNameOntoFirstNameField("P");
    }

    @Test
    public void checkInfMessageLastName(){
        NewVeterinarianPageObject newVeterinarianPageObject= goToNewVeterinarian();
        goToNewVeterinarian();
        newVeterinarianPageObject.setInvalidLastnameOntoLastnameField("h");
    }

    //positive PetTypes
    @Test
    public void addNewPetTypeToList (){
        PetTypesPageObject petTypesPageObject= goToPetTypes();

        goToPetTypes();
        petTypesPageObject.addNewPetTypesOpenField();
        petTypesPageObject.addNewType("guinea pig");
        petTypesPageObject.clickSave();
    }

    //positive Specialties
    @Test
    public void addSpecialty  (){
        SpecialtiesPageObject specialtiesPageObject =goToSpeciality();

        goToSpeciality();
        specialtiesPageObject.clickAddButton();
        specialtiesPageObject.setNameSpeciality("tough man");
        specialtiesPageObject.clickSaveButton();
    }
}
