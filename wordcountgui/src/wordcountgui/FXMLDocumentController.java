/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordcountgui;

import java.io.FileReader;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.StringTokenizer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author SEU
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TextField fname;
    @FXML
    private TextArea result;
    @FXML
    private Button bcal;
    @FXML
    private Button bclear;
       
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void countWord(ActionEvent event) 
    {
        String myfname = fname.getText();
        String fcon = "";
        int wc = 0;
        
        try
        {
            FileReader fr = new FileReader(myfname);  
            int i;  
            while((i = fr.read()) != -1)
            {				
                fcon += ""+(char)i;  
            }
            fr.close(); 
        }
        catch(Exception err)
        {
            
        }
        
        StringTokenizer st = new StringTokenizer(fcon);
        while(st.hasMoreTokens())
        {
            wc++;
            st.nextToken();
        }
        
        result.setText("Total word : "+wc);
    }

    @FXML
    private void clearAll(ActionEvent event) 
    {
        fname.setText("");
        result.setText("");
    }
    
}
