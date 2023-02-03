package com.techreturners.cats;

public class LionCat extends WildCat {
    private final int height = 1100;

    @Override
    public String eat() {
        return EatSounds.LION.getSound();
    }

    @Override
    public int getAverageHeight() {
        return height;
    }


}
