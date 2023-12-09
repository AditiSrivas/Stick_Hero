package com.example.demo3;

import java.util.*;

public class PillarDistance extends GameComponents{

    // width bw pillars
    private int[] width = {100, 120, 80, 40, 60, 150, 130, 70};
    @Override
    int getAttributeValue() {
        Random random = new Random();
        int randomIndex = random.nextInt(width.length);
        return width[randomIndex];

    }

}