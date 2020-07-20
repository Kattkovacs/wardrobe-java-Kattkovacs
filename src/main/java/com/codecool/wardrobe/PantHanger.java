package com.codecool.wardrobe;

import com.codecool.wardrobe.clothing.Clothes;
import com.codecool.wardrobe.clothing.Clothes.ClothesType;

import java.util.Optional;
import java.util.UUID;

public class PantHanger implements Hanger<Clothes> {
    @Override
    public Optional<Clothes> takeOff() {
        return null;
    }

    @Override
    public Optional<Clothes> takeOff(UUID id) {
        return null;
    }

    @Override
    public void put(Clothes item) {

    }

    @Override
    public boolean hasSlotFor(ClothesType type) {
        return false;
    }
}
