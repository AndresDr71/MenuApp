package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Crear la barra de menú
        MenuBar menuBar = new MenuBar();

        // Crear el menú "Archivo" y sus elementos
        Menu archivoMenu = new Menu("Archivo");
        MenuItem nuevoItem = new MenuItem("Nuevo");
        MenuItem abrirItem = new MenuItem("Abrir");
        MenuItem guardarItem = new MenuItem("Guardar");
        MenuItem salirItem = new MenuItem("Salir");
        archivoMenu.getItems().addAll(nuevoItem, abrirItem, guardarItem, salirItem);

        // Acciones para los elementos del menú "Archivo"
        salirItem.setOnAction(e -> System.exit(0));

        // Agregar el menú "Archivo" a la barra de menú
        menuBar.getMenus().add(archivoMenu);

        // Configurar el layout
        BorderPane root = new BorderPane();
        root.setTop(menuBar);

        // Configurar la escena
        Scene scene = new Scene(root, 400, 300);

        // Configurar la ventana principal
        primaryStage.setScene(scene);
        primaryStage.setTitle("Menú en JavaFX");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
