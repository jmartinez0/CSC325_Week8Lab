package com.mycompany.csc325_garmentsimulator;

/**
 * This class contains methods to create new casual garments.
 * @author juan
 */
public class CasualFactory implements GarmentFactory {
    @Override
    public Tops createTop() {
        return new CasualTop();
    }
    @Override
    public Pants createPants() {
        return new CasualPants();
    }
    @Override
    public Shoes createShoes() {
        return new CasualShoes();
    }
}
