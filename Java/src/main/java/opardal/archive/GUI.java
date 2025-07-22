package opardal.archive;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Finalmente funcionou!");
        label.setStyle("-fx-font-size: 50px;");
        StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 1000, 800);

        primaryStage.setTitle("oPardal's Archives");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
