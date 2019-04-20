package mycalculator;

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
    private TextField display;
    @FXML
    private Button b0;
    @FXML
    private Button bdot;
    @FXML
    private Button bequal;
    @FXML
    private Button badd;
    @FXML
    private Button b1;
    @FXML
    private Button b2;
    @FXML
    private Button b3;
    @FXML
    private Button bsub;
    @FXML
    private Button b4;
    @FXML
    private Button b5;
    @FXML
    private Button b6;
    @FXML
    private Button bmultiply;
    @FXML
    private Button b7;
    @FXML
    private Button b8;
    @FXML
    private Button b9;
    @FXML
    private Button bdiv;
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        text = "0";
        display.setText(text);
    }   

    String text = "";
    String operation = "";
    int x;
    int y;
    int z;
    
    @FXML
    private void doDisplay(ActionEvent event) 
    {
        text += ((Button)event.getSource()).getText();
        display.setText(text);
    }

    @FXML
    private void showResult(ActionEvent event)
    {
        y = Integer.parseInt(display.getText());
        
        if(operation.compareTo("+") == 0) z = x + y;
        if(operation.compareTo("-") == 0) z = x - y;
        if(operation.compareTo("*") == 0) z = x * y;
        if(operation.compareTo("/") == 0) z = x / y;
        
        text = ""+z;
        display.setText(text);        
    }  

    @FXML
    private void doOperation(ActionEvent event) 
    {
        operation = ((Button)event.getSource()).getText();
        x = Integer.parseInt(display.getText());
        text = "";
        display.setText(text);
    }
}
