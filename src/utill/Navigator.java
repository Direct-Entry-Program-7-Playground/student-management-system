package src.utill;

import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;

public class Navigator {
    public Navigator(Event event, String title, String location) throws IOException {
        this((Stage) (((Node) event.getSource()).getScene().getWindow()), title, location);
    }

    public Navigator(Stage stage, String title, String location) throws IOException {
        URL root = getClass().getResource(location);
        Parent load = FXMLLoader.load(root);
        Scene scene = new Scene(load);

        if(!stage.getStyle().equals(StageStyle.UNDECORATED)){
            stage.initStyle(StageStyle.UNDECORATED);
        }
        stage.setScene(scene);
        stage.setTitle(title);
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.show();
    }
}
