package com.example.demo3;
import java.util.*;

public class Pillar extends GameComponents{

    //pillar width
    private int[] distance = {60, 70, 50, 28, 15, 30, 80, 45, 20};

    @Override
    int getAttributeValue() {
        Random random = new Random();
        int randomIndex = random.nextInt(distance.length);
        return distance[randomIndex];
    }

}

