/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trade.fair;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author CITS_2
 */
public class RegStaffController implements Initializable {

    @FXML
    private TableView<?> staffTableview;
    @FXML
    private TableColumn<?, ?> staffIdCol;
    @FXML
    private TableColumn<?, ?> staffnameCol;
    @FXML
    private TableColumn<?, ?> staffPosCol;
    @FXML
    private TextField staffNameTfield;
    @FXML
    private TextField staffIdTfield;
    @FXML
    private ComboBox<?> staffPostCombo;
    @FXML
    private Button staffRegSubmitB;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void regstaffsubmit(ActionEvent event) {
    }
    
}
