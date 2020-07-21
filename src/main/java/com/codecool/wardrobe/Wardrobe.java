package com.codecool.wardrobe;

import com.codecool.wardrobe.clothing.Clothes;

import java.util.UUID;

/**
 * The task of the class is to model a wardrobe.
 */
public class Wardrobe {

    private final int limit;

    public Wardrobe(int limit) {
        if (limit >120) throw new IllegalArgumentException("Maxiumum limit is 120.");
        this.limit = limit;
    }

    public int getLimit() {
        return this.limit;
    }

    public int count() {
        return 0;
    }

    public void put(Hanger<? extends Clothes> hanger) {
        if (this.limit <= 0) throw new IllegalStateException("The wardrobe currently is full.");
    }

    public Hanger<? extends Clothes> getHanger(Clothes.ClothesType clothesType) {
        return null;
    }

    public Clothes getClothes(UUID clothesId) {
        return null;
    }

    // The main method with this declaration is the entry point of Java applications.
    public static void main(String[] args) {
        // Create an instance of our class with the test data.
        System.out.println("Hello WardROBO");
    }
}
