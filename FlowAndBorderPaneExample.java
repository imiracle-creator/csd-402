// Isaiah Miracle Module 11 FlowAndBorderPlaneExample.Java 05/25/2025
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class FlowAndBorderPaneExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create the root BorderPane
        BorderPane borderPane = new BorderPane();

        // ----- Top: Toolbar -----
        ToolBar toolBar = new ToolBar(new Label("Toolbar"));
        borderPane.setTop(toolBar);

        // ----- Bottom: Status Bar -----
        HBox statusBar = new HBox(new Label("Status: Ready"));
        statusBar.setPadding(new Insets(5));
        statusBar.setStyle("-fx-background-color: #E0E0E0;");
        borderPane.setBottom(statusBar);

        // ----- Center: FlowPane -----
        FlowPane imagePane = new FlowPane();
        imagePane.setHgap(10); // Horizontal gap between nodes
        imagePane.setVgap(10); // Vertical gap between nodes
        imagePane.setPadding(new Insets(10));
        imagePane.setPrefWrapLength(300); // Wrap at 300px width
        imagePane.setAlignment(Pos.TOP_LEFT);

        // Populate FlowPane with sample images (using online placeholders)
        for (int i = 1; i <= 8; i++) {
            Image image = new Image("https://via.placeholder.com/80x80.png?text=Img" + i);
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(80);
            imageView.setFitHeight(80);
            imagePane.getChildren().add(imageView);
        }

        // Set the FlowPane in the center of the BorderPane
        borderPane.setCenter(imagePane);

        // Set up the Scene and Stage
        Scene scene = new Scene(borderPane, 500, 400);
        primaryStage.setTitle("JavaFX FlowPane and BorderPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
