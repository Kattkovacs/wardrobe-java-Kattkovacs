package com.codecool.wardrobe;

import com.codecool.wardrobe.clothing.Clothes;
import com.codecool.wardrobe.clothing.Clothes.ClothesType;

import java.util.*;

public class PantHanger implements Hanger<Clothes> {

    private Clothes itemLower;
    private Clothes itemUpper;

    @Override
    public Optional<Clothes> takeOff() {
        Clothes result = Optional.ofNullable(itemUpper).orElse(itemLower);
        removeItemFromHanger(result);
        return Optional.ofNullable(result);
    }

    private void removeItemFromHanger(Clothes item) {
        if (item != null) {
            if (Clothes.upperClothesTypes.contains(item.getType())) itemUpper = null;
            if (Clothes.lowerClothesTypes.contains(item.getType())) itemLower = null;
        }
    }

    @Override
    public Optional<Clothes> takeOff(UUID id) {
        Clothes result = null;
        if (itemUpper != null && itemUpper.getId().equals(id)) result = itemUpper;
        if (itemLower != null && itemLower.getId().equals(id)) result = itemLower;
        removeItemFromHanger(result);
        return Optional.ofNullable(result);
    }

    @Override
    public void put(Clothes item) {
        ClothesType type = item.getType();
        if (!hasSlotFor(type)) throw new IllegalStateException("x");
        if (Clothes.lowerClothesTypes.contains(type)) itemLower = item;
        if (Clothes.upperClothesTypes.contains(type)) itemUpper = item;
    }

    @Override
    public boolean hasSlotFor(ClothesType type) {
        if (Clothes.lowerClothesTypes.contains(type)) return itemLower == null;
        if (Clothes.upperClothesTypes.contains(type)) return itemUpper == null;
        return false;
    }

    @Override
    public boolean isEmpty() {
        return itemLower == null && itemUpper == null;
    }
}