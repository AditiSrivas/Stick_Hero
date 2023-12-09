//package com.example.demo3;
//import javafx.animation.TranslateTransition;
//import javafx.scene.image.ImageView;
//import javafx.util.Duration;
//import javafx.scene.shape.Rectangle;
//
//public class StickMan implements User{
//    private int xPosition;
//    private final int yPosition = 400; //constant
//    private Bridge bridge = new Bridge();
//    private Pillar currentPillar;
//    private PillarDistance currentPlatform;
//    private Rectangle stickManNode;
//
//    public StickMan(Rectangle stickManNode, ImageView stickManImageView) {
//        this.stickManNode = stickManNode;
//
//    }
//
//    @Override
//    public void reviveStickMan() {
//    }
//
//    public void setCurrentPillar(Pillar currentPillar) {
//        this.currentPillar = currentPillar;
//    }
//    public void setCurrentPlatform(Platform currentPlatform) {
//        this.currentPlatform = currentPlatform;
//    }
//
//    public Pillar getCurrentPillar(){
//        return this.currentPillar;
//    }
//    public Platform getCurrentPlatform(){
//        return this.currentPlatform;
//    }
//
//    public void translateStickMan() {
//        TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(1), stickManNode);
//        if (bridge.isBridgeLongEnough()){
//            xPosition += currentPillar.getAttributeValue() + currentPlatform.getAttributeValue();
//            translateTransition.setByX(xPosition);
//            translateTransition.play();
//        } else{
//            xPosition += currentPillar.getAttributeValue();
//            translateTransition.setByX(xPosition);
//            translateTransition.play();
//        }
//    }
//
//    public void drawBridge() {
//
//    }
//    public void collectCherries(){
//
//    }
//    public int calculateScore(){
//        int score = 0;
//        return score;
//    }
//
//    public int printScore(){
//        return calculateScore();
//    }
//
//}
