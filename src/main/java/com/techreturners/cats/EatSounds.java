package com.techreturners.cats;

enum EatSounds {
    LION("Roar!!!!"),
    CHEETAH("Zzzzzzz"),
    CAT("Purrrrrrr");
    private String sound;

    EatSounds(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}
