package Presentation;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MyApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        MyCustomBorderPane root = new MyCustomBorderPane();

        Scene scene = new Scene(root, 800, 600);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Custom BorderPane Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
