package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent telaLogin = FXMLLoader.load(getClass().getResource("/telas/TelaLogin.fxml"));
        stage.setTitle("BilheteFácil");
        
        Scene scene = new Scene(telaLogin);
        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}