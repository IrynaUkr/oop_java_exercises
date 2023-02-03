package com.techreturners.cats;

public class DomesticCat  extends ParentCat{
    private final String setting = "domestic";
    private final int height = 23;
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
        return EatSounds.CAT.getSound();
    }

}
