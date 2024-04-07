/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user56;

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
 * @author Rafid Bapi
 */
public class LoginpageController implements Initializable {

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
    @FXML
    private Label WellcomeLabel1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loginButtonOnClick(ActionEvent event) {
    }
    
}
