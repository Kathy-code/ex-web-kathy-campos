package com.nttdata.steps;

import com.nttdata.page.BasicCalculatorPage;
import org.openqa.selenium.WebDriver;

public class MultiplicacionSteps {
    private WebDriver driver;

    //Constructor
    public MultiplicacionSteps(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Seleccionar la operación: multiplicación
     */
    public void selectMultiply() {
        this.driver.findElement(BasicCalculatorPage.operationSelectDrop).click();
        this.driver.findElement(BasicCalculatorPage.multiplicacionOption).click();
        this.driver.findElement(BasicCalculatorPage.multiplicacionOption).isSelected();
    }
}
