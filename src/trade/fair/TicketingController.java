/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trade.fair;

import java.net.URL;
import java.util.ResourceBundle;
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
public class TicketingController implements Initializable {

    @FXML
    private ComboBox<?> ticketTypeCombo;
    @FXML
    private TextField ticketSlTfield;
    @FXML
    private TableView<?> ticketTableView;
    @FXML
    private TableColumn<?, ?> ticketSlCol;
    @FXML
    private TableColumn<?, ?> ticketTypeCol;
    @FXML
    private TableColumn<?, ?> ticketPriceCol;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
