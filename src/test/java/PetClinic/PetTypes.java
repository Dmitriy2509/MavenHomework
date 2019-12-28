package PetClinic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PetTypes extends BaseTestClass {

    @Test
    public void addNewPetTypeToList (){

        goToPetTypes();
        addNewPetTypesOpenField();
        addNewType("guinea pig");
        clickSave();

    }

    



}
