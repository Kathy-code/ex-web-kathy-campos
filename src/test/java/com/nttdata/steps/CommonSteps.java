package com.nttdata.steps;

import com.nttdata.page.BasicCalculatorPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonSteps {
    public WebDriver driver;

    //Constructor
    public CommonSteps(WebDriver driver) {
        this.driver = driver;
    }


    /**
     * Limpiar los campos
     */
    public void cleanInputs() {
        this.driver.findElement(BasicCalculatorPage.firstNumberInput).clear();
        this.driver.findElement(BasicCalculatorPage.secondNumberInput).clear();
    }

    /**
     * Escribir el primer número
     *
     * @param firstNumber el primer número de la operacion
     */
    public void typeFirstNumber(Integer firstNumber) {
        WebElement firstNumberElement = driver.findElement(BasicCalculatorPage.firstNumberInput);
        firstNumberElement.sendKeys(String.valueOf(firstNumber));
        System.out.println(firstNumberElement);
    }

    /**
     * Escribir el segundo número
     *
     * @param secondNumber el segundo número de la operacion
     */
    public void typeSecondNumber(Integer secondNumber) {
        WebElement firstNumberElement = driver.findElement(BasicCalculatorPage.secondNumberInput);
        firstNumberElement.sendKeys(String.valueOf(secondNumber));
        System.out.println(firstNumberElement);
    }

    /**
     * Hacer click en el botón calculate
     */
    public void calculate() {
        this.driver.findElement(BasicCalculatorPage.calculateButton).click();
    }

    /**
     * Mostrar el resultado de la operación
     *
     * @return el resultado de la operacion
     */
    public String getResult() {
        String resultado = this.driver.findElement(BasicCalculatorPage.answerField).getText();
        System.out.println(resultado);
        return resultado;
    }
}
