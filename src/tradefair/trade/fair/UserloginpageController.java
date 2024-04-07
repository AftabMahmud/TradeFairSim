/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradefair.trade.fair;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author aftab
 */
public class UserloginpageController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField passTextField;
    @FXML
    private ComboBox<?> dessigComboBox;
    @FXML
    private TextField idTextField;
    @FXML
    private Label wrong;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void userLogin(ActionEvent event) {
    }
    
}
