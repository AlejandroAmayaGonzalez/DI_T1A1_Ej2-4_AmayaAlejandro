package ieslosmontecillos.di_t1a1_ej2_4_amayaalejandro;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Login extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("JavaFX Welcome!");

        //Create a gridPane
        GridPane grid = new GridPane();

        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scene_title = new Text("Welcome");
        scene_title.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scene_title, 0, 0, 2, 1);

        //Create the fields
        Label user_name = new Label("User Name:");
        grid.add(user_name, 0, 1);

        TextField user_text = new TextField();
        grid.add(user_text, 1, 1);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        PasswordField pw_text = new PasswordField();
        grid.add(pw_text, 1, 2);

        //Create the button and its container
        Button bt = new Button("Sign in");
        HBox hb = new HBox(10);

        //Align and add to the Hbox and then to GridPane
        hb.setAlignment(Pos.BOTTOM_RIGHT);
        hb.getChildren().add(bt);
        grid.add(hb, 1, 4);

        final Text actionTarget = new Text();
        grid.add(actionTarget, 1, 6);

        //Handle an event on the button
        bt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                actionTarget.setFill(Color.FIREBRICK);
                actionTarget.setText("Sign in button pressed");
            }
        });

        //Create a scene
        Scene scene = new Scene(grid, 300, 275);
        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}