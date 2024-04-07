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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author CITS_2
 */
public class RegBoothController implements Initializable {

    @FXML
    private ComboBox<String> boothSizeCombo;
    @FXML
    private TextField BoothNoTfield;
    @FXML
    private TextField boothLocTfield;
    @FXML
    private TableView<?> boothTableview;
    @FXML
    private TableColumn<?, ?> boothNoCol;
    @FXML
    private TableColumn<?, ?> boothSizeCol;
    @FXML
    private TableColumn<?, ?> boothLocCol;
    @FXML
    private TableColumn<?, ?> boothAssignCol;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void boothSubmitB(ActionEvent event) {
    }
    
}
