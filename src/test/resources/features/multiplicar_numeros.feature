Feature: Multiplicar números
  Como usuario
  Quiero multiplicar dos números
  Para obtener el resultado

  Background:
    Given el usuario se encuentra en la página de Basic Calculator de testsheepnz
    And los campos First number y Second number están limpios
    When ingreso el First number 8 y el Second number 2

  @test3
  Scenario: Multiplicar números enteros
    And seleciono la operacion Multiply para multiplicar
    And hago clic en el boton Calculate
    Then se me mostrará el resultado en el text box Answer