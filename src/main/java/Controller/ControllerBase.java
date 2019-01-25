package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class ControllerBase {


    @FXML
    public Label labelText;
    @FXML
    public Button buttonClick;

    public ControllerBase() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(
                "/fxml/mainScene.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    @FXML
    public void changeText(ActionEvent actionEvent) {
        labelText.setText("AHOJ");
    }
}
