package mydboperation;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable 
{   
    @FXML
    private TextField tid;
    @FXML
    private TextArea tresult;
    @FXML
    private Button show;
    
    Connection con;
    Statement stm;
    ResultSet rs;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
       
    }    

    @FXML
    private void showDB(ActionEvent event) 
    {
        String id = tid.getText().trim();
        try
        {  
            Class.forName("com.mysql.jdbc.Driver");  
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/southeast","root","");  
            stm = con.createStatement();  
            rs = stm.executeQuery("select * from student where id = "+id);  
            while(rs.next())
            {
                String sid = rs.getString(1);
                String sname = rs.getString(2);
                String saddress = rs.getString(3);
                String sphone = rs.getString(4);
                
                tresult.setText(sid+"\n"+sname+"\n"+saddress+"\n"+sphone);
            }
            rs.close();
            stm.close();
            con.close();
        }
        catch(Exception e)
        { 
            System.out.println(e);
        } 
    }    
}
