package com.nttdata.steps;

import com.nttdata.page.BasicCalculatorPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RestaSteps {

    private WebDriver driver;

    //Constructor
    public RestaSteps(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Seleccionar la operación: resta
     */
    public void selectSubtract() {
        this.driver.findElement(BasicCalculatorPage.operationSelectDrop).click();
        this.driver.findElement(BasicCalculatorPage.restaOption).click();
        this.driver.findElement(BasicCalculatorPage.restaOption).isSelected();
    }
}
