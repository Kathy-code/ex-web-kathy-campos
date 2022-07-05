Feature: Sumar números
  Como usuario
  Quiero calcular la suma de dos números
  Para obtener el resultado

  @test
  Scenario: Sumar números enteros
    Given el usuario se encuentra en la página de Basic Calculator de testsheepnz
    And los campos First number y Second number están limpios
    When seleciono la operacion Add para sumar
    And ingreso el First number 8 y el Second number 6
    And hago clic en el boton Calculate
    Then se me mostrará el resultado de la operacion en el text box Answer