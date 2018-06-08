/**
 * This class creates a blueprint for a Pilot object.
 * 
 * @version 1.0
 * @since 30/03/2018
 */

public class Pilot {
    private String name; //pilot's name
    private String rating; //type of plane a pilot can fly
    
    public Pilot(String name, String rating) {
        this.name = name;
    }
    
    /**
     * This method returns the name of a pilot assigned in the constructor.
     * 
     * @return name (String)
     */
    public String getName() {
        return name;
    }
}
