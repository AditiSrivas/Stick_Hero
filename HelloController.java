package com.example.demo3;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Rectangle platform;

    @FXML
    private Rectangle stick;

    private static final double PILLAR_WIDTH_MIN = 50.0;
    private static final double PILLAR_WIDTH_MAX = 150.0;
    private static final double PILLAR_HEIGHT = 300.0;
    private double totalHeight = 0.0;

    private double stickLength = 10.0;
    private boolean isExtending = false;


    public class YourGameClass {
        private Pane contentPane = new Pane();
        private double totalHeight = 0.0;

        private static final double PILLAR_WIDTH_MIN = 50.0;
        private static final double PILLAR_WIDTH_MAX = 150.0;
        private static final double PILLAR_HEIGHT = 300.0;

        public void main(String[] args) {
            // Your game initialization logic here
            YourGameClass game = new YourGameClass();
            //game.generatePillars(5);  // Or any other number
        }

//        private void generatePillars(int count) {
//            for (int i = 0; i < count; i++) {
//                double pillarWidth = Math.random() * (PILLAR_WIDTH_MAX - PILLAR_WIDTH_MIN) + PILLAR_WIDTH_MIN;
//                double pillarHeight = PILLAR_HEIGHT;
//
//                Rectangle pillar = new Rectangle(pillarWidth, pillarHeight);
//                pillar.setFill(Color.GREEN);
//
//                // Position the pillar vertically (along the y-axis)
//                pillar.setLayoutY(totalHeight);
//                totalHeight += pillarHeight;  // Increment totalHeight
//
//                // Add the pillar to the content pane
//                contentPane.getChildren().add(pillar);
//            }
//        }
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Set initial position of the platform and stick
        // (Omitted for brevity, you may set them as per your requirements)

        // Setup game loop
        // (Omitted for brevity, you may set up the game loop as per your requirements)
    }

    private void extendStick() {
        stickLength += 1.0;
        stick.setWidth(stickLength);
    }

    @FXML
    public void handleKeyPress(KeyEvent event) {
        if (event.getCode() == KeyCode.SPACE) {
            isExtending = true;
        }
    }

    @FXML
    public void handleKeyRelease(KeyEvent event) {
        if (event.getCode() == KeyCode.SPACE) {
            isExtending = false;
            checkCollision();
        }
    }

    private void checkCollision() {
        // Check if the stick reaches the platform
        // (Omitted for brevity, you may implement collision detection as per your requirements)
    }
}

