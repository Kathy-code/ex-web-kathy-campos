Feature: Operar números enteros
  Como usuario
  Quiero operar dos números enteros
  Para obtener el resultado

  Background:
    Given el usuario se encuentra en la página de Basic Calculator de testsheepnz
    And los campos First number y Second number están limpios
    When ingreso el First number 8 y el Second number 2

  @test
  Scenario: Sumar números enteros
    And seleciono la operacion Add para sumar
    And hago clic en el boton Calculate para sumar
    Then se me mostrará el resultado de la suma en el text box Answer
#
#  @test2
#  Scenario: Restar números enteros
#    And seleciono la operacion Subtract para restar
#    And hago clic en el boton Calculate para restar
#    Then se me mostrará el resultado de la resta en el text box Answer
#
#  @test3
#  Scenario: Multiplicar números enteros
#    And seleciono la operacion Multiply para multiplicar
#    And hago clic en el boton Calculate para multiplicar
#    Then se me mostrará el resultado de la multiplicación en el text box Answer