package com.codecool.wardrobe;

import com.codecool.wardrobe.clothing.Clothes;
import com.codecool.wardrobe.clothing.UpperClothes;

import java.util.Optional;
import java.util.UUID;

public class ShirtHanger implements Hanger<UpperClothes> {

    private UpperClothes itemUpper;

    @Override
    public Optional<UpperClothes> takeOff() {
        Optional<UpperClothes> result = Optional.ofNullable(itemUpper);
        itemUpper = null;
        return result;
    }

    @Override
    public Optional<UpperClothes> takeOff(UUID id) {
        if (itemUpper != null && itemUpper.getId().equals(id)) {
            Optional<UpperClothes> result = Optional.ofNullable(itemUpper);
            itemUpper = null;
            return result;
        }
        return Optional.empty();
    }

    @Override
    public void put(UpperClothes item) {
        if (!hasSlotFor(item.getType())) throw new IllegalStateException("x");
        itemUpper = item;
    }

    @Override
    public boolean hasSlotFor(Clothes.ClothesType type) {
        return Clothes.upperClothesTypes.contains(type) && Optional.ofNullable(itemUpper).isEmpty();
    }
}