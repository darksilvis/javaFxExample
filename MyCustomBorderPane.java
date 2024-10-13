package Presentation;

import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MyCustomBorderPane extends BorderPane {

    public MyCustomBorderPane() {
        Label topLabel = new Label("Top Label");
        Button centerButton = new Button("Center Button");

        this.setTop(topLabel);
        this.setCenter(centerButton);
}
}