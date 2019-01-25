package Controller.creating;

import Model.Element;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

public class CreateElementController {
    public ToggleButton percentTopLeftToggleButton;
    public ToggleGroup positionTopLeftCorner;
    public ToggleButton pxHeightToggleButton;
    public ToggleGroup positionHeight;
    public ToggleButton percentHeightToggleButton;
    public ToggleButton pxLenghtToggleButton;
    public ToggleGroup positionLenght;
    public ToggleButton percentLenghtToggleButton;
    public ToggleButton pxTopLeftToggleButton;
    public ImageView pomImage;
    public Button saveButton;
    public Button loadImageBtn;
    public ChoiceBox pomChoiceBox;
    public ToggleButton selectorIdToggleBtn;
    public ToggleButton selectorPartialIdToggleBtn;
    public ToggleButton selectorTextToggleBtn;
    public ToggleButton selectorXpathToggleBtn;
    public ToggleButton seleniumDriverToggleBtn;
    public ToggleButton appiumDriverToggleBtn;
    public ToggleButton hasTextAbilityToggleButton;
    public ToggleButton clickableAbilityToggleButton;
    public ToggleButton redirectsAbilityToggleButton;
    public ChoiceBox pomRedirectionChoiceBox;
    public TextField elementNameTextField;
    public Label errorLabel;
    public TextField selectorPathTextArea;


    public void saveElementEvent(ActionEvent actionEvent) {
        if(elementNameTextField.getText().equals("")){
            errorLabel.setText("Missing name!");
            return;
        }

        if(selectorPathTextArea.getText().equals("")){
            
        }


        Element element = new Element();


    }
}
