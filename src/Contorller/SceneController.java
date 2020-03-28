package Contorller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SceneController {

    @FXML
    private Button testButton;

    @FXML
    void testAction(ActionEvent event) {
        System.out.println("点击了一下QAQ");

    }


}
