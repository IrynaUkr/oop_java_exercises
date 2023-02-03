package com.techreturners.cats;

public class CheetahCat extends WildCat {
    private final int height = 123;

    @Override
    public String eat() {
        return EatSounds.CHEETAH.getSound();
    }

    @Override
    public int getAverageHeight() {
        return height;
    }

}
