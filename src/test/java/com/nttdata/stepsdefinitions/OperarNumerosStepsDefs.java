package com.nttdata.stepsdefinitions;

import com.nttdata.steps.CommonSteps;

import com.nttdata.steps.MultiplicacionSteps;
import com.nttdata.steps.RestaSteps;
import com.nttdata.steps.SumaSteps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OperarNumerosStepsDefs {

    private WebDriver driver;
    private Scenario scenario;

    @Before(order = 0)
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\usuario\\IdeaProjects\\ex-web-kathy-campos\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Before(order = 1)
    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    @After
    public void quitDriver() {
        driver.quit();
    }

    @Given("el usuario se encuentra en la página de Basic Calculator de testsheepnz")
    public void el_usuario_se_encuentra_en_la_página_de_basic_calculator_de_testsheepnz() {
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        screenShot();
    }

    @And("los campos First number y Second number están limpios")
    public void los_campos_first_number_y_second_number_están_limpios() {
        CommonSteps commonSteps = new CommonSteps(driver);
        commonSteps.cleanInputs();
        screenShot();
    }

    @When("ingreso el First number {int} y el Second number {int}")
    public void ingreso_el_first_number_y_el_second_number(Integer firstNumber, Integer secondNumber) {
        CommonSteps commonSteps = new CommonSteps(driver);
        commonSteps.typeFirstNumber(firstNumber);
        commonSteps.typeSecondNumber(secondNumber);
        screenShot();
    }

    /**
     * operación: SUMA
     */
    @And("seleciono la operacion Add para sumar")
    public void seleciono_la_operacion_add_para_sumar() {
        SumaSteps sumaSteps = new SumaSteps(driver);
        sumaSteps.selectAdd();
        screenShot();
    }
    @And("hago clic en el boton Calculate")
    public void hago_clic_en_el_boton_calculate() {
        CommonSteps commonSteps = new CommonSteps(driver);
        commonSteps.calculate();
    }
    @Then("se me mostrará el resultado en el text box Answer")
    public void se_me_mostrará_el_resultado_en_el_text_box_answer() {
        CommonSteps commonSteps = new CommonSteps(driver);
        commonSteps.getResult();
        screenShot();
    }

    /**
     * operación: RESTA
     */
    @And("seleciono la operacion Subtract para restar")
    public void seleciono_la_operacion_subtract_para_restar() {
        RestaSteps restaSteps = new RestaSteps(driver);
        restaSteps.selectSubtract();
        screenShot();
    }

    /**
     * operación: MULTIPLICACIÓN
     */
    @And("seleciono la operacion Multiply para multiplicar")
    public void seleciono_la_operacion_subtract_para_multiplicar() {
        MultiplicacionSteps multiplicacionSteps = new MultiplicacionSteps(driver);
        multiplicacionSteps.selectMultiply();
        screenShot();
    }

    /**
     * operación: DIVISIÓN
     */
    @And("seleciono la operacion Divide para dividir")
    public void seleciono_la_operacion_divide_para_dividir() {
        MultiplicacionSteps multiplicacionSteps = new MultiplicacionSteps(driver);
        multiplicacionSteps.selectMultiply();
        screenShot();
    }

    /**
     * operación: CONCATENACIÓN
     */
    @And("seleciono la operacion Concatenate para concatenar")
    public void seleciono_la_operacion_concatenate_para_concatenar() {
        MultiplicacionSteps multiplicacionSteps = new MultiplicacionSteps(driver);
        multiplicacionSteps.selectMultiply();
        screenShot();
    }

    public void screenShot() {
        byte[] evidencia = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        this.scenario.attach(evidencia, "image/png", "evidencias");
    }

}
