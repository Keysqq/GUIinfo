package com.example.guiinfo;
//Dev:Justin Fredericks
//Date: 2/6/2022
//Class: 171

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public  void  start(Stage primaryStage){

        TilePane hb = new TilePane(Orientation.HORIZONTAL); // used TilePane in attempt to have two nodes appear to occupy one column
        GridPane pane = new GridPane(); // used GRidPane in order to apply r/c positioning of image and Title label
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(5, 5, 5, 5));

        //Left in this original image creation so to have as a reference later
        //ImageView image = new ImageView("Capturezz.PNG");
        // image.setFitHeight(300);
        // image.setFitWidth(300);
        // GridPane.setHalignment(image, HPos.CENTER);
        //test
        Image image = new Image("Capturezz.PNG");

        Circle circle = new Circle(200); // testing out shapes as a container for image
        ImagePattern pattern = new ImagePattern(image);
        circle.setFill(pattern);
        GridPane.setHalignment(circle, HPos.CENTER);

        //set label and label fields
        Label label1 = new Label("Image Gallery");
        label1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 24));
        label1.setTextFill(Color.BLACK);
        GridPane.setHalignment(label1, HPos.CENTER);

        Button btn1 = new Button("Like");
        TextField txtField1 = new TextField();

        hb.getChildren().addAll(btn1,txtField1); // add the two nodes to the TitlePane

        pane.add(label1,0,0);
        pane.add(circle,0,1);
        pane.add(hb,0,2);
        //pane.add(image,0,1);

        pane.setHgap(5);
        pane.setVgap(5);

        Scene scene = new Scene(pane,500,500);
        primaryStage.setTitle("Poster Depot");
        primaryStage.setScene(scene);
        primaryStage.show();
    }//start

    public static void main(String[] args) {

        launch();
    }//main

}//class
