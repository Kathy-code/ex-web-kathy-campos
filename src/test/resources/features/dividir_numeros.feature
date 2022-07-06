Feature: Dividir números
  Como usuario
  Quiero dividir dos números
  Para obtener el resultado

  Background:
    Given el usuario se encuentra en la página de Basic Calculator de testsheepnz
    And los campos First number y Second number están limpios
    When ingreso el First number 8 y el Second number 2

  @test4
  Scenario: Dividir números enteros
    And seleciono la operacion Divide para dividir
    And hago clic en el boton Calculate
    Then se me mostrará el resultado en el text box Answer