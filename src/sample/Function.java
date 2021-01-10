package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class Function {
    @FXML
    private TextField t1;
    @FXML
    private TextField t2;
    @FXML
    private TextField t3;

    public void addition(ActionEvent event){
        int a,b,c;

        a=Integer.parseInt(t1.getText());
        b=Integer.parseInt(t1.getText());
        c=a+b;
        t3.setText(Integer.toString(c));


    }

}
