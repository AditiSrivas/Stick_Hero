package com.example.demo3;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class stickHero extends Application {

    @Override
    public void start(Stage primaryStage) {

        Pane root = new Pane();
//
//
        PillarGenerator pillarGenerator = new PillarGenerator();
        root.getChildren().addAll(pillarGenerator.getPillars());


        Image backgroundImage = new Image("2256.jpg");

            BackgroundImage backgroundImg = new BackgroundImage(
                    backgroundImage,
                    BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                    BackgroundPosition.DEFAULT,
                    new BackgroundSize(1.0, 1.0, true, true, false, false)
            );

            Background background = new Background(backgroundImg);
            root.setBackground(background);

        //StackPane root = new StackPane();
        Button btn = new Button("START");
        root.getChildren().add(btn);

        // Create the initial scene
        Scene scene = new Scene(root, 800, 600);

        // Set the initial scene to the stage
        primaryStage.setScene(scene);

        // Create the controller and set the stage
        StartScreen controller = new StartScreen();
        controller.setStage(primaryStage);

        // Set the button click event handler
        btn.setOnAction(controller::switchToNewScene);

        // Show the stage
        primaryStage.show();

            //PillarGenerator.createRectangle(60, 300, 0, 400, Color.BLACK);
        //Scene scene = new Scene(root, 800, 600);

            primaryStage.setScene(scene);
            primaryStage.setTitle("Stick Hero");
            primaryStage.show();



    }

    public static void main(String[] args) {
        launch(args);
    }

}

//    private boolean flag = true;
//
//    private Rectangle rectangle1;
//    private Rectangle rectangle2;
//
//    @Override
//    public void start(Stage primaryStage) {
//        try {
//
//            Pillar pillar1 = new Pillar();
//            int x = pillar1.getAttributeValue();
//
//            PillarDistance pdist = new PillarDistance();
//            int y = pdist.getAttributeValue();
//
//            rectangle1 = PillarGenerator.createRectangle(60, 300, 0, 400, Color.BLACK);
//            rectangle2 = PillarGenerator.createRectangle(x, 300, 60+y, 400, Color.BLACK);
//
//            // Create a layout pane
//            Pane root = new Pane();
//            root.getChildren().addAll(rectangle1, rectangle2);
//
//            // Create and play translations for the rectangles
//
//
//            //boolean flag = true;
//            Scene scene = new Scene(root, 800, 600);
//
//            scene.setOnMouseClicked(event -> handleMouseClick());
//
//
//            // Add the generated pillars to the Pane
//            root.getChildren().addAll(pillarGenerator.getPillars());
////
////
//            PillarGenerator pillarGenerator = new PillarGenerator(root);
//
//            primaryStage.setScene(scene);
//
//            // Set up event handler for mouse clicks
//            //scene.setOnMouseClicked((MouseEvent event) -> pillarGenerator.handleMouseClick(event));
//
//            // Start the animation loop
//            //pillarGenerator.startAnimationLoop();
//
//            Image backgroundImage = new Image("2256.jpg");
//
//            // Create a BackgroundImage with the background image
//            BackgroundImage backgroundImg = new BackgroundImage(
//                    backgroundImage,
//                    BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
//                    BackgroundPosition.DEFAULT,
//                    new BackgroundSize(1.0, 1.0, true, true, false, false)
//            );
//
//            // Create a Background with the BackgroundImage
//            Background background = new Background(backgroundImg);
//
//            // Set the Background to the StackPane
//            root.setBackground(background);
//            //root.getChildren().add(rectangle);
//
//            //Scene scene = new Scene(root, 400, 600);
//
//            primaryStage.setScene(scene);
//            primaryStage.setTitle("Stick Hero");
//            primaryStage.show();
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    private void handleMouseClick() {
//
//        if (!flag) return;
//        flag = false;
//        // Perform some action on mouse click
//        //System.out.println("Mouse Clicked!");
//
//        // Start a new thread for the while loop
//        new Thread(() -> {
//            // Example of a while loop (replace with your logic)
//            while (true) {
//                //System.out.println("Inside the while loop");
//                Platform.runLater(() -> {
//                            Pillar p = new Pillar();
//                            int p3w = p.getAttributeValue();
//                            PillarDistance pd2 = new PillarDistance();
//                            int p3d = pd2.getAttributeValue();
//                            Rectangle p3 = new Rectangle(p3w, 300, Color.BLACK);
//                            p3.setLayoutX(p3d);
//                            p3.setLayoutY(400);
//
//                            Platform.runLater(() -> {
//                                Pane root = (Pane) rectangle1.getParent();
//                                root.getChildren().add(p3);
//                            });
//
//                            TranslateTransition translateTransition1 = PillarGenerator.createAndPlayTranslation(rectangle1, -800);
//                            TranslateTransition translateTransition2 = PillarGenerator.createAndPlayTranslation(rectangle2, 0);
//                            TranslateTransition translateTransition3 = PillarGenerator.createAndPlayTranslation(p3, p3w + p3d);
//
//                            translateTransition1.setOnFinished(finishedEvent -> flag = true);
//                            translateTransition2.setOnFinished(finishedEvent -> flag = true);
//                            translateTransition3.setOnFinished(finishedEvent -> flag = true);
//                        });
////                translateTransition1.play();
////                translateTransition2.play();
////                translateTransition3.play();
//
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//            }
//        }).start();
//
//
//                // Perform some actions within the loop (e.g., update UI components)
//                // Be sure to use Platform.runLater for UI updates to ensure they happen on the JavaFX application thread
//                // Platform.runLater(() -> { /* Update UI components */ });
//
//    }
//
//
//
//}
