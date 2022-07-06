package com.nttdata.steps;

import com.nttdata.page.BasicCalculatorPage;
import org.openqa.selenium.WebDriver;

public class ConcatenacionSteps {
    private WebDriver driver;

    //Constructor
    public ConcatenacionSteps(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Seleccionar la operación: concatenación
     */
    public void selectConcatenate() {
        this.driver.findElement(BasicCalculatorPage.operationSelectDrop).click();
        this.driver.findElement(BasicCalculatorPage.concatenarOption).click();
        this.driver.findElement(BasicCalculatorPage.concatenarOption).isSelected();
    }
}
