package controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import javafx.scene.image.ImageView;
public class MainSceneController {

    @FXML
    private TextField tfTitle;
    @FXML
    public ImageView plant;
    @FXML
    private Button plantbutton;
    @FXML
    void btnOKClicked(ActionEvent event) {
        Stage mainWidows = (Stage) tfTitle.getScene().getWindow();
        String title = tfTitle.getText();
        mainWidows.setTitle(title);
    }
    @FXML
    public void handleChangeImage(ActionEvent event) {
        Image newImage = new Image(getClass().getResourceAsStream("/sun.png")); 
        plant.setImage(newImage);
    }
}
