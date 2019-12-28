package PetClinic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Specialties extends BaseTestClass {

    @Test
    public void addSpecialty (){

        goToSpeciality();
        clickAddButton();
        setNameSpeciality("tough man");
        clickSaveButton();
    }


}
