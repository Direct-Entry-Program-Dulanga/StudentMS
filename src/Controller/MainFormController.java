package Controller;

import com.jfoenix.controls.JFXRippler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

public class MainFormController {
    public JFXRippler rplAddStudent;
    public AnchorPane apeAddStudent;


    public void initialize(){
        rplAddStudent.setControl(apeAddStudent);
        apeAddStudent.setFocusTraversable(true);
    }

    public void pneAddNew_OnKeyPress(KeyEvent keyEvent) {

        if(keyEvent.getCode() == KeyCode.ENTER || keyEvent.getCode() == KeyCode.SPACE){
            rplAddStudent.createManualRipple().run();
        }
    }
}
