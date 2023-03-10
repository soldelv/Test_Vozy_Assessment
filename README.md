# Test_Vozy_Assessment

# Challenge **QA Automation**

- 馃О聽**Requisitos**
    
    Para desarrollar la prueba t茅cnica es importante que se cumplan las siguientes condiciones:
    
    - Disponibilidad de tiempo
    - Full acceso a internet
    - Configuraciones previas para proyectos `Maven` o `Gradle (Java)`
        - `Cucumber`
        - `Selenium`
        - `Serenity BDD`
        - `Screenplay`
        - `GitLab`
    
- **馃摑聽Descripci贸n de prueba**
    
    A continuaci贸n, se presenta el caso de prueba a desarrollar
    
    ```gherkin
    Feature: Compra SWAGLABS
    
        Compra exitosa por parte de un User en SWAGLABS
    
        Scenario: Compra exitos 
           Given Que un user ingresa sus credenciales en "https://www.saucedemo.com/"
            When Seleccione el producto con el menor precio
            Then realizara la orden/pedido de manera exitosa
    ```
    
- 馃聽**Pasos a cumplir**
    1. Realizar login con (**User:** standard_user / **Password:** secret_sauce)
        
        
    
    1. Crear la l贸gica (Interactions) para seleccionar el producto con menor precio y Agregarlo al carrito de compra: 
        
    
    - Seleccionar el bot贸n de carrito de compra
        
        
    
    1. Dar click en el bot贸n Checkout
                
    
    1. Diligenciar los campos del formulario
        
        
    2. Dar click en el bot贸n CONTINUE
        
        
    1. Dar click en el bot贸n FINISH
        
        
    2. Validar el mensaje final 鈥?**THANK YOU FOR YOUR ORDER**鈥?
                
- 鈴憋笍聽**Tiempo de entrega**
    
    **3 horas partiendo del inicio.** 
    
    Por favor, avisar previamente la ventana de tiempo disponible para enviar la prueba y contabilizar de manera correcta el tiempo
