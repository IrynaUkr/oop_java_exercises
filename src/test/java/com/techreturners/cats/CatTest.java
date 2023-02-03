package com.techreturners.cats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CatTest {

    @Test
    public void checkCatIsAwake() {
        Cat domesticCat = new DomesticCat();
        assertFalse(domesticCat.isAsleep(), "Cat should be awake by default");
    }

    @Test
    public void checkCatCanGoToSleep() {
        Cat domesticCat = new DomesticCat();
        domesticCat.goToSleep();
        assertTrue(domesticCat.isAsleep(), "Cat should be snoozing");
    }

    @Test
    public void checkCatCanWakep() {
        Cat domesticCat = new DomesticCat();
        domesticCat.goToSleep();
        domesticCat.wakeUp();
        assertFalse(domesticCat.isAsleep(), "Cat should be awake now");
    }

    @Test
    public void checkCatSetting() {
        Cat domesticCat = new DomesticCat();
        Cat cheetah = new CheetahCat();
        assertEquals("domestic", domesticCat.getSetting());
        assertNotEquals("domestic", cheetah.getSetting());
    }

    @Test
    public void checkCatHeight() {
        Cat domesticCat = new DomesticCat();
        assertEquals(23, domesticCat.getAverageHeight());
    }

    @Test
    public void checkLionHeight() {
        Cat lionCat = new LionCat();
        Cat cheetahCat = new CheetahCat();
        assertEquals(1100, lionCat.getAverageHeight());
        assertEquals(123, cheetahCat.getAverageHeight());

    }


    @Test
    public void feedTheLion() {
        Cat lionCat = new LionCat();
        assertEquals("Roar!!!!", lionCat.eat());
    }

    @Test
    public void feedTheCheetah() {
        Cat cheetahCat = new CheetahCat();
        assertEquals("Zzzzzzz", cheetahCat.eat());
    }

    @Test
    public void feedTheCat() {
        Cat domesticCat = new DomesticCat();
        assertEquals("Purrrrrrr", domesticCat.eat());
    }

}
