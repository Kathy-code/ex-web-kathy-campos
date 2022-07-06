//package com.nttdata.stepsdefinitions;
//
//import com.nttdata.steps.CommonSteps;
//import com.nttdata.steps.RestaSteps;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.Scenario;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class CommomStepsDefs {
//
//
//    private WebDriver driver;
//    private Scenario scenario;
//
//    public CommomStepsDefs(WebDriver driver) {
//        this.driver = driver;
//    }
//
//    @Before(order = 0)
//    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\usuario\\IdeaProjects\\ex-web-kathy-campos\\drivers\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//    }
//
//    @Before(order = 1)
//    public void setScenario(Scenario scenario) {
//        this.scenario = scenario;
//    }
//
////    @After
////    public void quitDriver(){
////        driver.quit();
////    }
//
//    @Given("el usuario se encuentra en la página de Basic Calculator de testsheepnz")
//    public void el_usuario_se_encuentra_en_la_página_de_basic_calculator_de_testsheepnz() {
//        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
//        screenShot();
//    }
//
//    @And("los campos First number y Second number están limpios")
//    public void los_campos_first_number_y_second_number_están_limpios() {
//        CommonSteps commonSteps = new CommonSteps(driver);
//        commonSteps.cleanInputs();
//        screenShot();
//
//    }
//
//    @When("ingreso el First number {int} y el Second number {int}")
//    public void ingreso_el_first_number_y_el_second_number(Integer firstNumber, Integer secondNumber) {
//        CommonSteps commonSteps = new CommonSteps(driver);
//        commonSteps.typeFirstNumber(firstNumber);
//        commonSteps.typeSecondNumber(secondNumber);
//        screenShot();
//
//    }
//
//    public void screenShot() {
//        byte[] evidencia = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//        this.scenario.attach(evidencia, "image/png", "evidencias");
//    }
//
//}
