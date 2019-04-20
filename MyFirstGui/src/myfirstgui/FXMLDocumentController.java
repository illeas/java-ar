package myfirstgui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable 
{   
    @FXML
    private Label l1;
    @FXML
    private Label l2;
    @FXML
    private TextField t1;
    @FXML
    private TextField t2;
    @FXML
    private Button b1;
    @FXML
    private Button b2;
    @FXML
    private Button b3;
    @FXML
    private Button b4;
    @FXML
    private Button b5;
    @FXML
    private Label l3;
    @FXML
    private TextField t3;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
    }   

    @FXML
    private void doAdd(ActionEvent event) 
    {    
        int x = Integer.parseInt(t1.getText().trim());
        int y = Integer.parseInt(t2.getText().trim());
        int z = x + y;
        t3.setText(""+z);
    }

    @FXML
    private void doSub(ActionEvent event) 
    {
        int x = Integer.parseInt(t1.getText().trim());
        int y = Integer.parseInt(t2.getText().trim());
        int z = x - y;
        t3.setText(""+z);
    }

    @FXML
    private void doDiv(ActionEvent event) 
    {
        int x = Integer.parseInt(t1.getText().trim());
        int y = Integer.parseInt(t2.getText().trim());
        int z = x / y;
        t3.setText(""+z);
    }

    @FXML
    private void doMultiply(ActionEvent event) 
    {
        int x = Integer.parseInt(t1.getText().trim());
        int y = Integer.parseInt(t2.getText().trim());
        int z = x * y;
        t3.setText(""+z);
    }

    @FXML
    private void doClear(ActionEvent event) 
    {
       t1.setText(""); 
       t2.setText(""); 
       t3.setText(""); 
    }
}