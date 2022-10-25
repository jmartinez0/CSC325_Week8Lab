package com.mycompany.csc325_garmentsimulator;

/**
 *  This class contains methods to create a new application.
 * @author juan
 */
public class Application {
    private Tops top;
    private Pants pants;
    private Shoes shoes;
    
    /**
     * Creates a new top, pants, and shoes all of one type (professional, casual, or party).
     * @param factory 
     */
    public Application(GarmentFactory factory) {
        top = factory.createTop();
        pants = factory.createPants();
        shoes = factory.createShoes();
    }
    
    /**
     * Reveals whether it is a professional, casual, or party set of garments.
     */
    public void revealContent(){
        top.Tops();
        pants.Pants();
        shoes.Shoes();
    }
    
}
