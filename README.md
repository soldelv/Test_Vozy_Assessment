# Test_Vozy_Assessment

# Challenge **QA Automation**

- 🧰 **Requisitos**
    
    Para desarrollar la prueba técnica es importante que se cumplan las siguientes condiciones:
    
    - Disponibilidad de tiempo
    - Full acceso a internet
    - Configuraciones previas para proyectos `Maven` o `Gradle (Java)`
        - `Cucumber`
        - `Selenium`
        - `Serenity BDD`
        - `Screenplay`
        - `GitLab`
    
- **📝 Descripción de prueba**
    
    A continuación, se presenta el caso de prueba a desarrollar
    
    ```gherkin
    Feature: Compra SWAGLABS
    
        Compra exitosa por parte de un User en SWAGLABS
    
        Scenario: Compra exitos 
           Given Que un user ingresa sus credenciales en "https://www.saucedemo.com/"
            When Seleccione el producto con el menor precio
            Then realizara la orden/pedido de manera exitosa
    ```
    
- 🤓 **Pasos a cumplir**
    1. Realizar login con (**User:** standard_user / **Password:** secret_sauce)
        
        
    
    1. Crear la lógica (Interactions) para seleccionar el producto con menor precio y Agregarlo al carrito de compra: 
        
    
    - Seleccionar el botón de carrito de compra
        
        
    
    1. Dar click en el botón Checkout
                
    
    1. Diligenciar los campos del formulario
        
        
    2. Dar click en el botón CONTINUE
        
        
    1. Dar click en el botón FINISH
        
        
    2. Validar el mensaje final “**THANK YOU FOR YOUR ORDER**”
                
- ⏱️ **Tiempo de entrega**
    
    **3 horas partiendo del inicio.** 
    
    Por favor, avisar previamente la ventana de tiempo disponible para enviar la prueba y contabilizar de manera correcta el tiempo
