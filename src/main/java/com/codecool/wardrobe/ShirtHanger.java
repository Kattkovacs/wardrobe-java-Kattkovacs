package com.codecool.wardrobe;

import com.codecool.wardrobe.clothing.Clothes;
import com.codecool.wardrobe.clothing.UpperClothes;

import java.util.Optional;
import java.util.UUID;

public class ShirtHanger implements Hanger<UpperClothes> {
    @Override
    public Optional<UpperClothes> takeOff() {
        return null;
    }

    @Override
    public Optional<UpperClothes> takeOff(UUID id) {
        return null;
    }

    @Override
    public void put(UpperClothes item) {

    }

    @Override
    public boolean hasSlotFor(Clothes.ClothesType type) {
        return false;
    }
}
