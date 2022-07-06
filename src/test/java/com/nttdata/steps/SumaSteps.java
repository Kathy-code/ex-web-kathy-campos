package com.nttdata.steps;

import com.nttdata.page.BasicCalculatorPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SumaSteps {

    private WebDriver driver;

    //Constructor
    public SumaSteps(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Seleccionar la operación: suma
     */
    public void selectAdd() {
        this.driver.findElement(BasicCalculatorPage.operationSelectDrop).click();
        this.driver.findElement(BasicCalculatorPage.sumaOption).click();
        this.driver.findElement(BasicCalculatorPage.sumaOption).isSelected();
    }
}
