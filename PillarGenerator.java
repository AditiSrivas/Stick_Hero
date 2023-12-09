package com.example.demo3;
import javafx.animation.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



//public class PillarGenerator {

//    public static Rectangle createRectangle(double width, double height, double initialX, double initialY, Color color) {
//        Rectangle rectangle = new Rectangle(width, height, color);
//        rectangle.setLayoutX(initialX);
//        rectangle.setLayoutY(initialY);
//        return rectangle;
//    }
//
//    public static TranslateTransition createAndPlayTranslation(Rectangle rectangle, double toX) {
//        TranslateTransition translateTransition = PillarGenerator.createTranslateTransition(rectangle, toX);
//        translateTransition.play();
//        return translateTransition;
//    }
//
//    public static TranslateTransition createTranslateTransition(Rectangle rectangle, double distance) {
//        TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(2), rectangle);
//        translateTransition.setToX(distance);
//        translateTransition.setAutoReverse(true);
//        translateTransition.setCycleCount(TranslateTransition.INDEFINITE);
//        return translateTransition;
//    }

//    boolean flag = true;
//    private static final int pillarHeight = 300;

//    int[] width = {60, 70, 50, 28, 15, 30, 80, 45, 20};
//        Random random = new Random();
//        int randomIndex = random.nextInt(width.length);
//        int pillar_width = width[randomIndex];
//
//    int[] distance = {60, 70, 50, 28, 15, 30, 80, 45, 20};
//        Random random2 = new Random();
//        int randomIndex2 = random2.nextInt(distance.length);
//        int pillar_distance = distance[randomIndex2];

//    public void createPillars(){
//        Pillar pillar2 = new Pillar();
//        PillarDistance pd = new PillarDistance();
//
//        Rectangle p1 = new Rectangle(60, pillarHeight);
//        p1.setLayoutX(0);
//        p1.setLayoutY(400);
//
//        Rectangle p2 = new Rectangle(pillar2.getAttributeValue(), pillarHeight);
//        p1.setLayoutY(400);
//        p1.setLayoutX(pd.getAttributeValue()+60);
//
//        while(flag){
//            Pillar p = new Pillar();
//            int p3w = p.getAttributeValue();
//            PillarDistance pd2 = new PillarDistance();
//            int p3d = pd2.getAttributeValue();
//            Rectangle p3 = new Rectangle(p3w, pillarHeight);
//            p3.setLayoutX(p3d);
//            p3.setLayoutY(400);
//
//            createTranslateTransition(p1,-800);
//            createTranslateTransition(p2, 0);
//            createTranslateTransition(p3, p3w+ p3d);
//
//
//            };









//    private static final int PILLAR_HEIGHT = 300;
//    private static final int PILLAR_WIDTH1 = 60;
//
//    private Pane root;
//    private Rectangle pillar1;
//    private Rectangle pillar2;
//    private Rectangle pillar3;
//    private Random random;
//    private Timeline animationLoop;
//
//    private int[] pillarWidths = {60, 80, 100}; // Example widths
//    private int[] distances = {100, 120, 150}; // Example distances
//
//    public PillarGenerator(Pane root) {
//        this.root = root;
//        this.random = new Random();
//        createPillars();
//        createAnimationLoop();
//    }
//    private void createPillars() {
//        pillar1 = new Rectangle(PILLAR_WIDTH1, PILLAR_HEIGHT, Color.BLACK);
//        pillar1.setLayoutX(0);
//        pillar1.setLayoutY(400);
//
//        pillar2 = createNewPillar();
//        pillar3 = createNewPillar();
//        root.getChildren().addAll(pillar1, pillar2, pillar3);
//    }
//
//    private void createAnimationLoop() {
//        animationLoop = new Timeline(
//                new KeyFrame(Duration.seconds(1),
//                        new KeyValue(pillar1.layoutXProperty(), -PILLAR_WIDTH1),
//                        new KeyValue(pillar2.layoutXProperty(), -PILLAR_WIDTH),
//                        new KeyValue(pillar3.layoutXProperty(), -PILLAR_WIDTH1)
//                )
//        );
//        animationLoop.setCycleCount(Timeline.INDEFINITE);
//    }
//
//    public void startAnimationLoop() {
//        animationLoop.play();
//    }
//
//    public void stopAnimationLoop() {
//        animationLoop.stop();
//    }
//
//    public void handleMouseClick(MouseEvent event) {
//        generateNewPillar();
//    }
//
//    private void generateNewPillar() {
//        Rectangle newPillar = createNewPillar();
//        root.getChildren().add(newPillar);
//
//        // Move all pillars together
//        animationLoop.stop();
//        animationLoop.play();
//
//        // Update pillar3 to the new pillar
//        pillar3 = newPillar;
//    }
//
//    private Rectangle createNewPillar() {
//        int randomWidth = getRandomWidth();
//        Rectangle newPillar = new Rectangle(randomWidth, PILLAR_HEIGHT, Color.GREEN);
//
//        // Random distance between pillars
//        double randomDistance = distances[random.nextInt(distances.length)];
//        newPillar.setLayoutX(pillar3.getLayoutX() + PILLAR_WIDTH1 + randomDistance);
//        newPillar.setLayoutY(400);
//
//        return newPillar;
//    }
//
//    private int getRandomWidth() {
//        return pillarWidths[random.nextInt(pillarWidths.length)];
//    }
//}


//import javafx.animation.TranslateTransition;
//import javafx.scene.input.MouseEvent;
//import javafx.scene.layout.Pane;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Rectangle;
//import javafx.util.Duration;
//
//import java.util.Random;
//
//public class PillarGenerator {
//
//    private static final int PILLAR_HEIGHT = 300;
//    private static final int PILLAR_WIDTH = 60;
//
//    private Pane root;
//    private Rectangle pillar1;
//    private Rectangle pillar2;
//    private Random random;
//    private TranslateTransition pillar1Transition;
//    private TranslateTransition pillar2Transition;
//
//    private int[] pillarWidths = {60, 80, 100}; // Example widths
//    private int[] distances = {100, 120, 150}; // Example distances
//
//    public PillarGenerator(Pane root) {
//        this.root = root;
//        this.random = new Random();
//        createPillars();
//        createTransitions();
//    }
//
//    private void createPillars() {
//        pillar1 = new Rectangle(PILLAR_WIDTH, PILLAR_HEIGHT, Color.BLUE);
//        pillar1.setLayoutX(0);
//        pillar1.setLayoutY(400);
//
//        pillar2 = new Rectangle(getRandomWidth(), PILLAR_HEIGHT, Color.RED);
//        pillar2.setLayoutX(PILLAR_WIDTH);
//        pillar2.setLayoutY(400);
//
//        root.getChildren().addAll(pillar1, pillar2);
//    }
//
//    private void createTransitions() {
//        pillar1Transition = createTransition(pillar1, -PILLAR_WIDTH, 0);
//        pillar2Transition = createTransition(pillar2, -PILLAR_WIDTH, 0);
//    }
//
//    private TranslateTransition createTransition(Rectangle pillar, double toX, double toY) {
//        TranslateTransition transition = new TranslateTransition(Duration.seconds(1), pillar);
//        transition.setToX(toX);
//        transition.setToY(toY);
//        return transition;
//    }
//
//    public void handleMouseClick(MouseEvent event) {
//        pillar1Transition.stop();
//        pillar2Transition.stop();
//
//        pillar1Transition.play();
//        pillar2Transition.play();
//
//        pillar2Transition.setOnFinished(e -> handleTransitionFinished());
//    }
//
//    private void handleTransitionFinished() {
//        root.getChildren().remove(pillar1);
//
//        pillar1 = pillar2;
//        root.getChildren().remove(pillar2);
//
//        pillar2 = createNewPillar();
//        root.getChildren().add(pillar2);
//
//        pillar2.setLayoutX(PILLAR_WIDTH);
//        pillar2.setLayoutY(400);
//
//        createTransitions();
//    }
//
//    private Rectangle createNewPillar() {
//        int randomWidth = getRandomWidth();
//        Rectangle newPillar = new Rectangle(randomWidth, PILLAR_HEIGHT, Color.GREEN);
//
//        // Random distance between pillars
//        double randomDistance = distances[random.nextInt(distances.length)];
//        newPillar.setLayoutX(800 + randomDistance);
//
//        return newPillar;
//    }
//
//    private int getRandomWidth() {
//        return pillarWidths[random.nextInt(pillarWidths.length)];
//    }
//
//    public void startAnimation() {
//        pillar1Transition.play();
//        pillar2Transition.play();
//    }
//
//
//}



//
//import javafx.animation.TranslateTransition;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Rectangle;
//import javafx.util.Duration;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
public class PillarGenerator {

    private static final double PILLAR_HEIGHT = 300.0;
    private final List<Rectangle> pillars;
    //private final List<TranslateTransition> transitions;

    public PillarGenerator() {
        this.pillars = generatePillars();
        //this.transitions = createTransitions();
    }

    public List<Rectangle> getPillars() {
        return pillars;
    }

    private List<Rectangle> generatePillars() {
        List<Rectangle> pillars = new ArrayList<>();

        int[] width = {60, 70, 50, 28, 15, 30, 80, 45, 20};
        Random random = new Random();
        int randomIndex = random.nextInt(width.length);
        int pillar_width = width[randomIndex];

        int[] distance = {60, 70, 50, 28, 15, 30, 80, 45, 20};
        Random random2 = new Random();
        int randomIndex2 = random2.nextInt(distance.length);
        int pillar_distance = distance[randomIndex2];

//        Pillar pillar = new Pillar();
//        int x = pillar.getAttributeValue();
//
//        Pillar pillar2 = new Pillar();
//        int z = pillar2.getAttributeValue();
//
//        PillarDistance plat = new PillarDistance();
//        int y = plat.getAttributeValue();

        Rectangle rect = new Rectangle(60, PILLAR_HEIGHT, Color.BLACK);
        Rectangle rect2 = new Rectangle(pillar_width, PILLAR_HEIGHT, Color.BLACK);

        // Set initial positions
        rect.setLayoutY(400);
        rect2.setLayoutX(60+pillar_width);
        rect2.setLayoutY(400);

        pillars.add(rect);
        pillars.add(rect2);

        return pillars;
    }}
//
////    private void createTransitions() {
////        //List<TranslateTransition> transitions = new ArrayList<>();
////
////
////            TranslateTransition transition = new TranslateTransition(Duration.seconds(5), pillar);
////            transition.setToX(-(400)); // Move to the left side of the scene
////            transitions.add(transition);
////
////
////
////        return transitions;
////    }
////
//
//    private List<TranslateTransition> createTransitions() {
//        List<TranslateTransition> transitions = new ArrayList<>();
//
//        for (Rectangle pillar : pillars) {
//            TranslateTransition transition = new TranslateTransition(Duration.seconds(5), pillar);
//            transition.setToX(-(400)); // Move to the left side of the scene
//            transitions.add(transition);
//        }
//
//        return transitions;
//    }
//
//    public void startAnimation() {
//        for (TranslateTransition transition : transitions) {
//            transition.play();
//        }
//    }
//}
