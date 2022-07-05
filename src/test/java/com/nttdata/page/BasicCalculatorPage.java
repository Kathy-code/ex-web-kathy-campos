package com.nttdata.page;

import org.openqa.selenium.By;

public class BasicCalculatorPage {

    //Localizadores de elementos

    public static By firstNumberInput = By.id("number1Field");
    public static By secondNumberInput = By.id("number2Field");
    public static By operationSelectDrop = By.id("selectOperationDropdown");
    public static By calculateButton = By.id("calculateButton");
    public static By answerField = By.id("numberAnswerField");
    public static By integerOnlySelect = By.id("integerSelect");
    public static By clearAnswerButton = By.id("clearButton");

    //Localizadores de elementos (operaciones)

    public static By sumaOption = By.xpath("//option[contains(text(),'Add')]");
    public static By restaOption = By.xpath("//option[contains(text(),'Subtract')]");
    public static By multiplicacionOption = By.xpath("//option[contains(text(),'Multiply')]");
    public static By divisionOption = By.xpath("//option[contains(text(),'Divide')]");
    public static By concatenarOption = By.xpath("//option[contains(text(),'Concatenate')]");




}
