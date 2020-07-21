package com.codecool.wardrobe.clothing;

public class LowerClothes extends Clothes {
    public LowerClothes(String brandName, ClothesType type) {
        super(brandName);
        if(type == ClothesType.SHIRT || type == ClothesType.BLOUSE) throw new IllegalArgumentException("Not supported clothes type.");
        this.type = type;
    }
}
