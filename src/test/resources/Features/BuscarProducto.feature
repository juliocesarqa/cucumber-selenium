Feature: Buscar Producto
  Scenario: Buscar Producto de Libros para Selenium
    Given  Ingreso a la pagina web de Amazon "https://www.amazon.com/-/es/"
    When Ingreso el texto "Libros de Selenium"
    And click en botón buscar
    Then valido que me muestre el valor "Resultados"

