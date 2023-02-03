package com.techreturners.cats;

public abstract class ParentCat implements Cat {
    private boolean isCatAsleep = false;

    private String setting;

    @Override
    public void goToSleep() {
        isCatAsleep = true;
    }

    @Override
    public void wakeUp() {
        isCatAsleep = false;
    }

    @Override
    public boolean isDomestic() {
        return setting.equals("domestic");
    }

    @Override
    public void run() {

    }

    @Override
    public boolean isAsleep() {
        return isCatAsleep;
    }

}
