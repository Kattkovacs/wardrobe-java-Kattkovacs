package com.codecool.wardrobe;

import com.codecool.wardrobe.clothing.Clothes;

import java.util.*;

/**
 * The task of the class is to model a wardrobe.
 */
public class Wardrobe {

    private final int limit;
    private List<Hanger<? extends Clothes>> hangers;

    public Wardrobe(int limit) {
        if (limit > 120) throw new IllegalArgumentException("Maximum limit is 120.");
        this.limit = limit;
        hangers = new ArrayList<>();
    }

    public int getLimit() {
        return this.limit;
    }

    public int count() {
        return hangers.size();
    }

    public void put(Hanger<? extends Clothes> hanger) {
        if (count() >= limit) throw new IllegalStateException("The wardrobe currently is full.");
        hangers.add(hanger);
    }

    public Hanger<? extends Clothes> getHanger(Clothes.ClothesType clothesType) {
        for (Hanger<? extends Clothes> hanger: hangers) {
            if (hanger.isEmpty()){
                if (Clothes.lowerClothesTypes.contains(clothesType) && hanger instanceof PantHanger) {
                    return hangers.remove(hangers.indexOf(hanger));
                }
                return hangers.remove(hangers.indexOf(hanger));
            }
        }
        throw new NoSuchElementException("No empty hangers for your clothes.");
    }

    public Clothes getClothes(UUID clothesId) {
        for (Hanger<? extends Clothes> hanger: hangers) {
            Optional<Clothes> clothes = (Optional<Clothes>) hanger.takeOff(clothesId);
            if (clothes.isPresent()) return clothes.get();
        }
        throw new NoSuchElementException("Clothes not found.");
    }

    // The main method with this declaration is the entry point of Java applications.
    public static void main(String[] args) {
        // Create an instance of our class with the test data.
        System.out.println("Hello WardROBO");
    }
}