Feature: Concatenar números
  Como usuario
  Quiero concatenar dos números
  Para obtener una cadena

  Background:
    Given el usuario se encuentra en la página de Basic Calculator de testsheepnz
    And los campos First number y Second number están limpios
    When ingreso el First number 8 y el Second number 2

  @test5
  Scenario: Multiplicar números enteros
    And seleciono la operacion Concatenate para concatenar
    And hago clic en el boton Calculate
    Then se me mostrará el resultado en el text box Answer