Feature: Compra SWAGLABS

  Scenario Outline: Compra exitosa por parte de un User SWAGLABS
    Given El usuario se loguea con user "<user>" and password "<password>"
    When Selecciona el producto con el menor precio
    Then Realiza la orden de manera exitosa

    Examples:
      |     user      |   password   |
      | standard_user | secret_sauce |