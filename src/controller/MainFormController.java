package src.controller;

import com.jfoenix.controls.JFXRippler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import src.utill.Navigator;

import java.io.IOException;
import java.net.URL;

public class MainFormController {
    public JFXRippler rplAddNewStudent;
    public JFXRippler rplSearchStudent;
    public HBox hboxAddNewStudent;
    public HBox hboxSearchStudents;

    public void initialize() {

        rplAddNewStudent.setFocusTraversable(true);
        rplSearchStudent.setFocusTraversable(true);
    }

    public void rplSearchStudent_onKeyPress(KeyEvent keyEvent) throws IOException {
        if(keyEvent.getCode() == KeyCode.ENTER||keyEvent.getCode() == KeyCode.SPACE){
            rplSearchStudent.createManualRipple().run();
            new Navigator(keyEvent, "Search Student", "../view/SearchStudentsForm.fxml");
        }
    }

    public void rplAddNewStudent_onKeyPress(KeyEvent keyEvent) throws IOException {
        if(keyEvent.getCode() == KeyCode.ENTER||keyEvent.getCode() == KeyCode.SPACE){
            rplAddNewStudent.createManualRipple().run();
            new Navigator(keyEvent,"Add New Student", "../view/AddStudentForm.fxml");

        }
    }


    public void rplSearchStudent_onClicked(MouseEvent mouseEvent) throws IOException {
        new Navigator(mouseEvent, "Search Student", "../view/SearchStudentsForm.fxml");
    }

    public void rplAddNewStudent_oClicked(MouseEvent mouseEvent) throws IOException {
        new Navigator(mouseEvent,"Add New Student", "../view/AddStudentForm.fxml");
    }
}
