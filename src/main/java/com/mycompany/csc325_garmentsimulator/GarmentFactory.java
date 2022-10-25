package com.mycompany.csc325_garmentsimulator;

/**
 * This interface contains method declarations for creating tops, pants, and shoes.
 * @author juan
 */
public interface GarmentFactory {
    Tops createTop();
    Pants createPants();
    Shoes createShoes();
}
