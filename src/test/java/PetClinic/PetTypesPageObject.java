package PetClinic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PetTypesPageObject {

    private WebDriver driver;

    public PetTypesPageObject(WebDriver driver) {
        this.driver = driver;
    }


    public void addNewPetTypesOpenField() {

        WebElement clickOnAddButton = driver.findElement(By.xpath("//*[normalize-space(text()) ='Add']"));
        clickOnAddButton.click();

    }

    public void addNewType(String type) {

        WebElement addTypeOfAnimal = driver.findElement(By.id("name"));
        addTypeOfAnimal.clear();
        addTypeOfAnimal.sendKeys(type);
    }

    public void clickSave() {

        WebElement clickSave = driver.findElement(By.xpath("//*[text()='Save']"));
    }
}
