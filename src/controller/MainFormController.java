package src.controller;

import com.jfoenix.controls.JFXRippler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import src.utill.Navigator;

import java.io.IOException;
import java.net.URL;

public class MainFormController {

    public HBox hboxAddNewStudent;
    public HBox hboxSearchStudents;
    public VBox baseBox;

    public void initialize() {
        hboxAddNewStudent.requestFocus();
        hboxAddNewStudent.setFocusTraversable(true);
        hboxSearchStudents.setFocusTraversable(true);
        JFXRippler ripplerAddNewStudent = new JFXRippler(hboxAddNewStudent);
        JFXRippler ripplerSearchStudents = new JFXRippler(hboxSearchStudents);
        ripplerAddNewStudent.setRipplerFill(Color.valueOf("#6200ee"));
        ripplerSearchStudents.setRipplerFill(Color.valueOf("#6200ee"));
        baseBox.getChildren().addAll(ripplerAddNewStudent,ripplerSearchStudents);
    }

    public void hboxSearchStudents_onKeyPress(KeyEvent keyEvent) throws IOException {
        if(keyEvent.getCode() == KeyCode.ENTER||keyEvent.getCode() == KeyCode.SPACE){
            new Navigator(keyEvent, "Search Student", "../view/SearchStudentsForm.fxml");
        }
    }

    public void hboxAddNewStudent_onKeyPress(KeyEvent keyEvent) throws IOException {
        if(keyEvent.getCode() == KeyCode.ENTER||keyEvent.getCode() == KeyCode.SPACE){
            new Navigator(keyEvent,"Add New Student", "../view/AddStudentForm.fxml");

        }
    }


    public void hboxSearchStudents_onClicked(MouseEvent mouseEvent) throws IOException {
        new Navigator(mouseEvent, "Search Student", "../view/SearchStudentsForm.fxml");
    }

    public void hboxAddNewStudent_oClicked(MouseEvent mouseEvent) throws IOException {
        new Navigator(mouseEvent,"Add New Student", "../view/AddStudentForm.fxml");
    }
}
