/**
 * This class creates a blueprint for an AirPlane object.
 * It requires a Pilot object.
 * 
 * @version 1.0
 * @since 30/03/2018
 */

public class AirPlane {
    private String make; //type of plane
    private String model; // model of plane
    private int capacity; //number of seats
    private Pilot pilot; //Pilot object.
   
    public AirPlane(String make, String model, int capacity, Pilot pilot) {
        this.make = make;
        this.model = model;
        this.capacity = capacity;
        this.pilot = pilot;
    }
    
     /**
     * This method returns the make of a plane assigned in the constructor.
     * make of a plane is the type.
     * 
     * @return make (String)
     */
    public String getMake() {
        return make;
    }
    
     /**
     * This method returns the model of a plane assigned in the constructor.
     * model of a plane is usually the number attached to it.
     * 
     * @return model (String)
     */
    public String getModel() {
        return model;
    }
    
     /**
     * This method returns the capacity of a plane assigned in the constructor.
     * capacity of a plane is how many seats it has.
     * 
     * @return capacity (String)
     */
    public int getCapacity() {
        return capacity;
    }
    
    /**
     * This method creates a Pilot Object. It takes two parameters:
     * 1st Parameter: name which is the name of the pilot.
     * 2nd Parameter: rating which is the type of plane the pilot is qualified to fly.
     * Then, it returns the pilot.
     * 
     * @param name (String)
     * @param rating (String)
     * @return p (Pilot)
     */
    public Pilot assignPilot(String name, String rating) {
        Pilot p = new Pilot(name, rating);
        return p;
    }
    
    /**
     * This method returns the pilot object created in the method assignPilot
     * which took two parameters.
     * 
     * @return pilot (Pilot)
     */
    public Pilot getPilot() {
        return pilot;
    }
    /**
     * This method overrides the toString method in the Object class.
     * It returns useful information about an airplane.
     * 
     * @return a string representation.
     */
    @Override
    public String toString() {
        return "\n****Airplane Information****"
               + "\nAircraft: " + getMake() + " " + getModel()
               + "\nCapacity: " + getCapacity() + " seats"
               + "\nPilot: " + getPilot().getName()
               + "\n--------------------------------------------------";
    }
}
