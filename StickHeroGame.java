//package com.example.demo3;
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.image.*;
//import javafx.scene.layout.*;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Rectangle;
//import javafx.stage.Stage;
//
//public class StickHero extends Application {
//    private StickMan stickMan;
//
//    @Override
//    public void start(Stage primaryStage) {
//        try {
//            Rectangle rectangle = new Rectangle(50, 50, 100, 80);
//            rectangle.setFill(Color.BLUE);
//
//            //stickManNode = new Rectangle(xPosition, 500, 30, 50);
//            //stickManNode.setFill(Color.BLUE);
//
//            // Create a StackPane and add the rectangle to it
//            StackPane root = new StackPane();
//
//            Image backgroundImage = new Image("background.jpg");
//            // Create a BackgroundImage with the background image
//            BackgroundImage backgroundImg = new BackgroundImage(
//                    backgroundImage,
//                    BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
//                    BackgroundPosition.DEFAULT,
//                    new BackgroundSize(1.0, 1.0, true, true, false, false)
//            );
//
//            Image stickManImage = new Image("stickman.png");
//            ImageView stickManImageView = new ImageView(stickManImage);
//            stickManImageView.setFitWidth(10);
//            stickManImageView.setPreserveRatio(true);
//
//            // Create a Background with the BackgroundImage
//            Background background = new Background(backgroundImg);
//
//            // Set the Background to the StackPane
//            root.setBackground(background);
//
//            //root.setBackground().add(loader);
//            root.getChildren().addAll(rectangle, stickManImageView);
//
//            Scene scene = new Scene(root, 800, 600);
//
//            stickMan = new StickMan(rectangle, stickManImageView);
//            scene.setOnMouseClicked(event -> stickMan.translateStickMan());
//            primaryStage.setScene(scene);
//            primaryStage.setTitle("Stick Hero");
//            primaryStage.show();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}