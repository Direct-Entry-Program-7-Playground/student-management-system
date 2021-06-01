package src.controller;

import com.jfoenix.controls.JFXHamburger;
import javafx.scene.input.MouseEvent;
import src.utill.Navigator;

import java.io.IOException;

public class AddStudentFormController {
    public JFXHamburger btnMainMenu;

    public void btnMainMenu_OnClicked(MouseEvent mouseEvent) throws IOException {

        new Navigator(mouseEvent, "Student Management System", "../view/MainForm.fxml");

    }
}
