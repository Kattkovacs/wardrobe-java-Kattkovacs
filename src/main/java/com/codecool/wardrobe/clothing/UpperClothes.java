package com.codecool.wardrobe.clothing;

public class UpperClothes extends Clothes {
    public UpperClothes(String brandName, ClothesType type) {
        super(brandName);
        if(type == ClothesType.TROUSERS || type == ClothesType.SKIRT) throw new IllegalArgumentException("Not supported clothes type.");
        this.type = type;
    }


}
