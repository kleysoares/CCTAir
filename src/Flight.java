/**
 * This class creates a blueprint for a Flight object.
 * It requires a Pilot object and an AirPlane object.
 * 
 * @version 1.0
 * @since 30/03/2018
 */

public class Flight {
    private String origin; //where the flight is coming from
    private String destination; //where the flight is flying to
    private String dateOfFlight; //flight date
    private String departureTime; //flight departure
    private String arrivalTime; //flight arrival 
    private AirPlane airplane; //Airplane object
    
    public Flight(String origin, String destination, String dateOfFlight, AirPlane airplane) {
        this.origin = origin;
        this.destination = destination;
        this.dateOfFlight = dateOfFlight;
        this.airplane = airplane;
    }
    
     /**
     * This method returns the origin of a flight assigned in the constructor.
     * origin is from which airport the airplane took off.
     * 
     * @return origin (String)
     */
    public String getOrigin() {
        return origin;
    }
    
    /**
     * This method returns the destination of a flight assigned in the constructor.
     * destination is to which airport the airplane landed.
     * 
     * @return destination (String)
     */
    public String getDestination() {
        return destination;
    }
    
    /**
     * This method returns the date of a flight which was assigned in the constructor.
     * dateOfFlight is the day of a flight.
     * 
     * @return dateOfFlight (String)
     */
    public String getDateOfFlight() {
        return dateOfFlight;
    }
    
    /**
     * This method returns the airplane object created in the method setAirplane
     * which took four parameters.
     * 
     * @return airplane (AirPlane)
     */
    public AirPlane getAirplane() {
        return airplane;
    }
    
    /**
     * This method takes one parameter to assign or update the arrival time.
     * 
     * @param arrivalTime (String)
     */
    public void schedule(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    
    /**
     * This method takes two parameters to assign the arrival time
     * and departure time consecutively.
     * 
     * @param arrivalTime (String)
     * @param departureTime (String) 
     */
    public void schedule(String arrivalTime, String departureTime) {
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }
    /**
     * This method returns the departure time assigned in the schedule method
     * which takes two parameters. The departureTime is the second parameter.
     * 
     * @return departureTime (String) 
     */
    public String getDepartureTime() {
        return departureTime;
    }
    
     /**
     * This method returns the arrival time assigned in the schedule method.
     * 
     * @return arrivalTime (String) 
     */
    public String getArrivalTime() {
        return arrivalTime;
    }
    
    /**
     * This method overrides the toString method in the Object class.
     * It returns useful information about a flight.
     * 
     * @return a string representation.
     */
    @Override
    public String toString() {
        return  "\n****Flight Information****" 
                + "\nDate: " + getDateOfFlight()
                + "\nFrom: " + getOrigin() + " to " + getDestination()
                + "\nFlight Time: " + getDepartureTime() + " to " + getArrivalTime()
                + "\n" + getAirplane();
    }
}
