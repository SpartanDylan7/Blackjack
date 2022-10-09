package com.sd7.blackjack;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("BlackJack");
        stage.setScene(scene);
        stage.setMaxWidth(814);
        stage.setMaxHeight(640);
        stage.setMinWidth(814);
        stage.setMinHeight(640);
        stage.show();
    }

    public static void main(String[] args) {


        launch();




    }
}