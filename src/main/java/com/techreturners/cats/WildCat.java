package com.techreturners.cats;

public  abstract class WildCat extends ParentCat {
    private final String setting = "wild";
    @Override
    public String getSetting() {
        return setting;
    }
}
