package com.example.demo3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StartScreen extends Application {

    private Stage stage;


    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        

        Image backgroundImage = new Image("2256.jpg");

        BackgroundImage backgroundImg = new BackgroundImage(
                backgroundImage,
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                new BackgroundSize(1.0, 1.0, true, true, false, false)
        );

        Background background = new Background(backgroundImg);
        root.setBackground(background);

        Image image = new Image("stickman.png");
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(100);
        imageView.setPreserveRatio(true);

        Rectangle bottomRectangle = new Rectangle(80, 150);
        bottomRectangle.setFill(Color.BLACK);
        root.setBottom(bottomRectangle);
        root.setAlignment(bottomRectangle, Pos.BOTTOM_CENTER);

        StackPane centerStackPane = new StackPane();

        VBox titleVBox = new VBox();
        titleVBox.setAlignment(Pos.TOP_CENTER);
        titleVBox.setSpacing(100);

        Text titleText = new Text("STICK HERO");
        titleText.setFont(Font.font("HELVETICA", FontWeight.BOLD, 60));
        titleText.setFill(Color.WHITE);
        titleVBox.getChildren().add(titleText);

        centerStackPane.getChildren().add(titleVBox);

        VBox startButtonVBox = new VBox();
        startButtonVBox.setAlignment(Pos.CENTER);

        Circle startCircle = new Circle(65);
        startCircle.setFill(Color.WHITE);

        Text startText = new Text("PLAY");
        startText.setFont(Font.font("Helvetica", FontWeight.BOLD, 24));
        startText.setFill(Color.BLACK);

        StackPane circleWithText = new StackPane(startCircle, startText);


        circleWithText.setOnMouseClicked(event -> {
            System.out.println("Button Clicked!");
            switchToNewScene(new ActionEvent());
            //this button will switch to next screen in final project

        });

        startButtonVBox.getChildren().add(circleWithText);
        centerStackPane.getChildren().add(startButtonVBox);
        centerStackPane.getChildren().add(imageView);

        StackPane.setAlignment(imageView, Pos.BOTTOM_CENTER);
        root.setCenter(centerStackPane);


        Scene scene = new Scene(root, 800, 600);
        primaryStage.setTitle("Stick Hero Start Screen");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void switchToNewScene(ActionEvent event) {

        // Create the content for the new scene
        StackPane newLayout = new StackPane();
        newLayout.getChildren().add(new Button("START"));

        // Create the new scene
        Scene newScene = new Scene(newLayout, 800, 600);

        // Set the new scene to the stage
        stage.setScene(newScene);}

    public static void main(String[] args) {
        launch(args);
    }
}