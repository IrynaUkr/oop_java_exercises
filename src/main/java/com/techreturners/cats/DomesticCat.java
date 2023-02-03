package com.techreturners.cats;

public class DomesticCat extends ParentCat {
    private static final String setting = "domestic";
    private static final int height = 23;

    @Override
    public String getSetting() {
        return setting;
    }

    @Override
    public int getAverageHeight() {
        return height;
    }

    @Override
    public String eat() {
        makeCommentRandomly();
        return EatSounds.CAT.getSound();
    }

    private static void makeCommentRandomly() {
        int max = 10;

        if ((int) (Math.random() * max) > 4) {
            System.out.println("It will do I suppose");
        }
    }

}
