package com.mycompany.csc325_garmentsimulator;

/**
 *
 * @author juan
 */
public class DriverClass {
    /**
     * Creates a new set of garments based on String input.
     * @return 
     */
    private static Application configureApplication(){

        GarmentFactory factory; //To be used as an argument when we call the Application constructor
        Application app;

        String garmentName = "Checking for garment type";
        
        //If professional is in the String, we use ProfessionalFactory to make a set of professional garments
        if (garmentName.contains("professional")) {
            factory = new ProfessionalFactory();
            app = new Application(factory);
        //If casual is in the String, we use CasualFactory to make a set of casual garments
        } else if (garmentName.contains("casual")) {
            factory = new CasualFactory();
            app = new Application(factory);
        //If professional or casual is not in the String, we use PartyFactory to make a set of party garments
        } else {
            factory = new PartyFactory();
            app = new Application(factory);
        }
        return app;
    }
    
    public static void main(String[] args) {
        //Creating a new Application that ends up defaulting to Party garments (since the string we're testing does not contain professional nor casual)
        Application app = configureApplication();
        //Displays that it is indeed a set of Party garments
        app.revealContent();
    }
    
}
