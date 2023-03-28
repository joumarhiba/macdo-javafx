package com.simplon.macdo;

import com.simplon.macdo.model.MenuItem;
import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class HelloApplication extends Application {




    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("McDonald's Menu");

    }

    public static void main(String[] args) {
        launch();
    }
}