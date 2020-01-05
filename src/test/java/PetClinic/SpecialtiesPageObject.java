package PetClinic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.apache.commons.io.FileUtils.waitFor;

public class SpecialtiesPageObject {

    private WebDriver driver;

    public SpecialtiesPageObject(WebDriver driver) {

        this.driver = driver;
    }

    protected WebDriverWait waitFor() {

        return new WebDriverWait(driver, 10);
    }

    public void clickAddButton() {

        WebElement addButton = driver.findElement(By.xpath("//*[normalize-space(text())='Add']"));
        addButton.click();
    }

    public void setNameSpeciality(String nameSpeciality) {

        WebElement nameField = driver.findElement(By.id("name"));
        WebElement homeBtn = waitFor().until(ExpectedConditions
                .visibilityOfElementLocated(By.id("name")));
        waitFor().until(ExpectedConditions.visibilityOf(nameField));
        nameField.clear();
        nameField.sendKeys(nameSpeciality);
    }

    public void clickSaveButton() {

        WebElement clickSaveButton = driver.findElement(By.xpath("//*[text()='Save']"));
        clickSaveButton.click();
    }


}
