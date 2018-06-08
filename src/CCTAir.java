/**
 * This is the main class which instantiates objects.
 * It requires another class called Scanner.
 * 
 * @version 1.0
 * @since 30/03/2018
 */

import java.util.Scanner;

public class CCTAir {
    
    /**
     * This method initiates a number of pilot objects and a number of airplane objects.
     * A pilot object is, then, assigned to an airplane object.
     * It takes one parameter to random which airplane will be selected.
     * 
     * @param random (int)
     * @return  plane (AirPlane)
     */
    public static AirPlane assignFlight(int random) {
        Pilot p0 = new Pilot("Sean", "Avic 404");
        Pilot p1 = new Pilot("John", "Boeing 777");
        Pilot p2 = new Pilot("Sarah", "Airbus 657");
        Pilot p3 = new Pilot("Fabiana", "ATR 321");
        Pilot p4 = new Pilot("Bob", "Beechcraft 123");
        Pilot p5 = new Pilot("Mary", "Bombardier 964");
        Pilot p6 = new Pilot("Aaron", "Antonov 159");
        Pilot p7 = new Pilot("Phil", "Sukhoi 468");
        Pilot p8 = new Pilot("Barbara", "Evektor 328");
        Pilot p9 = new Pilot("Aoife", "Embraer 14");        
       
        AirPlane plane;
        
        switch(random) {
            case 0:
                plane = new AirPlane("Airbus SE", "Avic", 400, p0);
                break;
            case 1:
                plane = new AirPlane("Boeing", "Boeing 777", 350, p1);
                break;
            case 2:
                 plane = new AirPlane("ATR Craft", "Airbus", 75, p2);
                 break;
            case 3:
                plane= new AirPlane("Textron Aviation", "ATR", 200, p3);
                break;
            case 4:
                plane= new AirPlane("Textron Aviation", "Beechcraft", 150, p4);
                break;
            case 5:
                plane= new AirPlane("Textron Aviation", "Bombardier", 175, p5);
                break;
            case 6:
                plane= new AirPlane("Textron Aviation", "Antonov", 220, p6);
                break;
            case 7:
                plane= new AirPlane("Textron Aviation", "Sukhoi", 80, p7);
                break;
            case 8:
                plane= new AirPlane("Textron Aviation", "Evektor", 100, p8);
                break;
            default:
                plane= new AirPlane("Textron Aviation", "Embraer", 120, p9);
                break;
        }
        return plane;
    }
    
    /**
     * The main class.
     * 
     * @param args (String)
     */
    public static void main(String[] args) {
        String origin; //flight origin
        String destination; //flight destination
        String date; //flight date
        String answer; //user answer
        String[] departures = {"10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00"}; //array of departure times
        String[] arrivals = {"12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00"}; //array of arrival times
        char y; //char for 'yes' answer.
        int totalRandom = 10; //total number of objects created to randomize flights.
        int random;
        Flight flight; //declares a flight
        Scanner input = new Scanner(System.in); //Scanner declaration and initialization
        
        System.out.println("Welcome to CCT Airlines!");
        do {
            System.out.print("Origin >>>> ");
            origin = input.nextLine();
            origin = origin.toUpperCase(); //converts string to upper case

            System.out.print("Destination >>>> ");
            destination = input.nextLine();
            destination = destination.toUpperCase(); //converts string to upper case

            System.out.print("Date >>>> ");
            date = input.nextLine();
            
            random = (int)(Math.random() * totalRandom); //selects a random number.
            flight = new Flight(origin, destination, date, assignFlight(random)); // instantiates a flight
            flight.schedule(arrivals[random], departures[random]); //random schedule insertion
            
            System.out.println(flight); //displays the flight
            
            System.out.print("Update this Arrival Time (Y/N)? ");
            answer = input.nextLine();
            y = answer.toLowerCase().charAt(0);  //converts string to lower case and stores the first character.
            
            if(y == 'y') {
                System.out.print("What time is the updated arrival time? ");
                answer = input.nextLine();
                arrivals[random] = answer; //rewrites the array of the arrival time within the random index.
                flight.schedule(arrivals[random]); //restores the array result in the schedule method
                
                System.out.print("Review this flight details (Y/N)? ");
                answer = input.nextLine();
                y = answer.toLowerCase().charAt(0); //converts string to lower case and stores the first character.
                if(y == 'y') {
                    System.out.println(flight); //displays the flight
                }
            }

            System.out.print("Would you like to create another flight (Y/N)? ");
            answer = input.nextLine();
            y = answer.toLowerCase().charAt(0); //converts string to lower case and stores the first character.
            
        } while(y == 'y');
        
        System.out.println("\n******************************"
                           + "\n* Thank you. See you around! *"
                           + "\n******************************");
    }
}