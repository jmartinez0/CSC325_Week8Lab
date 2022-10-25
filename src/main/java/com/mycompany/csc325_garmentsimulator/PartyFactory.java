package com.mycompany.csc325_garmentsimulator;

/**
 *  This class contains methods to create Party garments.
 * @author juan
 */
public class PartyFactory implements GarmentFactory {
    @Override
    public Tops createTop() {
        return new PartyTop();
    }
    @Override
    public Pants createPants() {
        return new PartyPants();
    }
    @Override
    public Shoes createShoes() {
        return new PartyShoes();
    }
}
