Feature: Compra SWAGLABS
  Compra exitosa por parte de un User en SWAGLABS

  Scenario: Compra exitosa por parte de un User SWAGLABS
    Given El user ingresa sus credenciales en el sitio
    When Selecciona el producto con el menor precio
    Then Realiza la orden de manera exitosa
