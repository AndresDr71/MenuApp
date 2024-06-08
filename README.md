# Menú en JavaFX

Este código JavaFX crea una ventana con un menú "Archivo" que tiene las opciones "Nuevo", "Abrir", "Guardar" y "Salir". Al hacer clic en "Salir", la aplicación se cierra.

## Funcionamiento del Código

El programa JavaFX está estructurado en una clase principal llamada `MenuApp`. Aquí está el resumen de cómo funciona:

1. **Creación de la Interfaz Gráfica de Usuario (GUI)**:
   - Se crea una barra de menú (`MenuBar`) que contendrá el menú "Archivo".
   - Se crea un menú "Archivo" (`Menu`) con varias opciones (`MenuItem`) como "Nuevo", "Abrir", "Guardar" y "Salir".

2. **Acciones del Menú**:
   - Se define una acción para el elemento "Salir" del menú "Archivo" que finaliza la aplicación cuando se hace clic en él.

3. **Configuración de la Escena y la Ventana**:
   - Se configura un layout (`BorderPane`) para organizar la barra de menú en la parte superior de la ventana.
   - Se crea una escena (`Scene`) que contiene el layout.
   - Se configura la ventana principal (`Stage`) con la escena y se muestra al usuario.

4. **Ejecución de la Aplicación**:
   - El método `main()` inicia la aplicación JavaFX llamando al método `launch()` con los argumentos recibidos.

## Ejecución del Código

Para ejecutar este código, asegúrate de tener JavaFX configurado en tu entorno de desarrollo. Puedes compilar y ejecutar el código desde tu IDE o desde la línea de comandos.
![Captura de funcionamiento del codigo](https://github.com/AndresDr71/MenuApp/assets/104042777/4075d40e-c255-4a88-b3e8-5853786a1a58)
```bash
# Compilación del código

javac MenuApp.java

# Ejecución del código
java MenuApp

