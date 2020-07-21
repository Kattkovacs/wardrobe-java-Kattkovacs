package com.codecool.wardrobe.clothing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.UUID;

public class Clothes {
    private final UUID id;
    private final String brandName;

    public static final HashSet<ClothesType> upperClothesTypes = new HashSet<>(Arrays.asList(ClothesType.SHIRT, ClothesType.BLOUSE));
    public static final HashSet<ClothesType> lowerClothesTypes = new HashSet<>(Arrays.asList(ClothesType.SKIRT, ClothesType.TROUSERS));

    protected ClothesType type;

    public Clothes(String brandName) {
        this.id = UUID.randomUUID();
        this.brandName = brandName;
    }

    public UUID getId() {
        return id;
    }

    public String getBrandName() {
        return brandName;
    }

    public ClothesType getType() {
        return this.type;
    }

    public enum ClothesType {
        SHIRT,
        BLOUSE,
        TROUSERS,
        SKIRT
    }
}