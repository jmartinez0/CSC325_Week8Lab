package com.mycompany.csc325_garmentsimulator;

/**
 * This class contains methods to create Professional garments.
 * @author juan
 */
public class ProfessionalFactory implements GarmentFactory {
    @Override
    public Tops createTop() {
        return new ProfessionalTop();
    }
    @Override
    public Pants createPants() {
        return new ProfessionalPants();
    }
    @Override
    public Shoes createShoes() {
        return new ProfessionalShoes();
    }
}
