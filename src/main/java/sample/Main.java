package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        /*
        CustomControl customControl = new CustomControl();
        customControl.setText("Hello!");

        HBox hbox = new HBox();
        CustomControl customControl = new CustomControl();
        customControl.setText("Hello World!");
        hbox.getChildren().add(customControl);
*/
        /*
        ControllerBase base = new ControllerBase();
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(base));
        primaryStage.setWidth(300);
        primaryStage.setHeight(200);
        primaryStage.show();*/

        //init base fxml
        Parent root = FXMLLoader.load( getClass().getResource("/fxml/mainScene.fxml"));

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
