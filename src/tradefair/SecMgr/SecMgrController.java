/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradefair.SecMgr;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author CITS_2
 */
public class SecMgrController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void AssetProtection(ActionEvent event) throws Exception{
        Parent mainSceneParent;
        mainSceneParent = FXMLLoader.load(getClass().getResource("AssetProtection.fxml"));
        Scene scene1= new Scene (mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();   

    }

    @FXML
    private void AttendeeList(ActionEvent event) throws Exception{
        Parent mainSceneParent;
        mainSceneParent = FXMLLoader.load(getClass().getResource("AttendeeList.fxml"));
        Scene scene1= new Scene (mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();   

    }

    @FXML
    private void Communication(ActionEvent event) throws Exception{
        Parent mainSceneParent;
        mainSceneParent = FXMLLoader.load(getClass().getResource("Communication.fxml"));
        Scene scene1= new Scene (mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();   

    }

    @FXML
    private void Credential(ActionEvent event) throws Exception{
        Parent mainSceneParent;
        mainSceneParent = FXMLLoader.load(getClass().getResource("Credential.fxml"));
        Scene scene1= new Scene (mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();   

    }

    @FXML
    private void CrowdControl(ActionEvent event) throws Exception{
        Parent mainSceneParent;
        mainSceneParent = FXMLLoader.load(getClass().getResource("CrowdControl.fxml"));
        Scene scene1= new Scene (mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();   

    }

    @FXML
    private void Emergency(ActionEvent event) throws Exception{
        Parent mainSceneParent;
        mainSceneParent = FXMLLoader.load(getClass().getResource("Emergency.fxml"));
        Scene scene1= new Scene (mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();   

    }

    @FXML
    private void Surveillance(ActionEvent event) throws Exception{
        Parent mainSceneParent;
        mainSceneParent = FXMLLoader.load(getClass().getResource("Surveillance.fxml"));
        Scene scene1= new Scene (mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();   

    }

    @FXML
    private void Training(ActionEvent event) throws Exception{
        Parent mainSceneParent;
        mainSceneParent = FXMLLoader.load(getClass().getResource("Training.fxml"));
        Scene scene1= new Scene (mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();   

    }
    
}
