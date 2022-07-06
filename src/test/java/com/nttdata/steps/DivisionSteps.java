package com.nttdata.steps;

import com.nttdata.page.BasicCalculatorPage;
import org.openqa.selenium.WebDriver;

public class DivisionSteps {
    private WebDriver driver;

    //Constructor
    public DivisionSteps(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Seleccionar la operación: división
     */
    public void selectDivide() {
        this.driver.findElement(BasicCalculatorPage.operationSelectDrop).click();
        this.driver.findElement(BasicCalculatorPage.divisionOption).click();
        this.driver.findElement(BasicCalculatorPage.divisionOption).isSelected();
    }
}
