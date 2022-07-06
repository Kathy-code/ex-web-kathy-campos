package com.nttdata.stepsdefinitions;

//import com.nttdata.steps.CommonSteps;

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

public class SumarNumerosStepsDefs {

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
        SumaSteps sumaSteps = new SumaSteps(driver);
        sumaSteps.cleanInputs();
        screenShot();

    }

    @When("ingreso el First number {int} y el Second number {int}")
    public void ingreso_el_first_number_y_el_second_number(Integer firstNumber, Integer secondNumber) {
        SumaSteps sumaSteps = new SumaSteps(driver);
        sumaSteps.typeFirstNumber(firstNumber);
        sumaSteps.typeSecondNumber(secondNumber);
        screenShot();

    }

    @And("seleciono la operacion Add para sumar")
    public void seleciono_la_operacion_add_para_sumar() {
        SumaSteps sumaSteps = new SumaSteps(driver);
        sumaSteps.selectAdd();
        screenShot();

    }

    @And("hago clic en el boton Calculate para sumar")
    public void hago_clic_en_el_boton_calculate() {
        SumaSteps sumaSteps = new SumaSteps(driver);
        sumaSteps.calculate();
        screenShot();
    }

    @Then("se me mostrará el resultado de la suma en el text box Answer")
    public void se_me_mostrará_el_resultado_de_la_operacion_en_el_text_box_answer() {
        SumaSteps sumaSteps = new SumaSteps(driver);
        sumaSteps.getSuma();
        screenShot();
    }

    public void screenShot() {
        byte[] evidencia = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        this.scenario.attach(evidencia, "image/png", "evidencias");
    }

}
