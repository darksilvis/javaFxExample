package Presentation;

import Data.Photo;
import Data.PhotoRepository;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.List;

public class HelloApplication extends Application {



    @Override
    public void start(Stage primaryStage) {
        MainScreen mainScreen = new MainScreen();
       primaryStage.setScene(new MainScreen().getScene());
       primaryStage.setTitle("Change Photo");
       primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
