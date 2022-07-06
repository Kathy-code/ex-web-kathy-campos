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

//    /**
//     * Limpiar los campos
//     */
//    public void cleanInputs(){
//        this.driver.findElement(BasicCalculatorPage.firstNumberInput).clear();
//        this.driver.findElement(BasicCalculatorPage.secondNumberInput).clear();
//    }

    /**
     * Seleccionar la operación: resta
     */
    public void selectSubtract() {
        this.driver.findElement(BasicCalculatorPage.operationSelectDrop).click();
        this.driver.findElement(BasicCalculatorPage.restaOption).click();
        this.driver.findElement(BasicCalculatorPage.restaOption).isSelected();
    }

//    /**
//     * Escribir el primer número
//     * @param firstNumber el primer número de la resta
//     */
//    public void typeFirstNumber(Integer firstNumber){
//        WebElement firstNumberElement = driver.findElement(BasicCalculatorPage.firstNumberInput);
//        firstNumberElement.sendKeys(String.valueOf(firstNumber));
//        System.out.println(firstNumberElement);
//    }
//
//    /**
//     * Escribir el segundo número
//     * @param secondNumber el segundo número de la resta
//     */
//    public void typeSecondNumber(Integer secondNumber){
//        WebElement firstNumberElement = driver.findElement(BasicCalculatorPage.secondNumberInput);
//        firstNumberElement.sendKeys(String.valueOf(secondNumber));
//        System.out.println(firstNumberElement);
//    }
//
//    /**
//     * Hacer click en el botón login
//     */
//    public void calculate(){
//        this.driver.findElement(BasicCalculatorPage.calculateButton).click();
//    }
//
//    /**
//     * Mostrar el resultado de la operación
//     * @return el valor de la suma
//     */
//    public String getResta(){
//        String valorResta = this.driver.findElement(BasicCalculatorPage.answerField).getText();
//        System.out.println(valorResta);
//        return valorResta;
//    }
}
