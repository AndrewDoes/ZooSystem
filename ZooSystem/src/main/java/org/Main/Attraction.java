//Package of Attraction.java
package org.Main;
/**
 * The Attraction class provides different methods that for admin to add remove modify and view attractions
 * and also name , description, ticketPrice and uniqueID as data Members
 */
public class Attraction {
    //Data Members
    private String name;
    private String description;
    private double ticketPrice;
    private int uniqueID;
    private boolean isOpen = false;
    private int countOfTicketedVisitors = 0;
    /**
     * Constructor for Attraction class.
     *
     * @param name Name of the attraction that the admin wants to add .
     * @param description    Description of the Attraction that admin wants to enter.
     * @param ticketPrice    Already fixed to 101.0 for Basic members
     */
    public Attraction(String name, String description, double ticketPrice, int id) {
        this.name = name;
        this.description = description;
        this.ticketPrice = ticketPrice;
        this.uniqueID = id;
    }

    // Getter and Setter for the members
    /**
     * Get the name of the attraction.
     * @return The attraction's name.
     */
    public String getName() {
        return name;
    }
    /**
     * Set the name of the attraction.
     * @param name The attraction's name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the description of the attraction.
     * @return The attraction's description.
     */
    public String getDescription() {
        return description;
    }
    /**
     * Set the description of the attraction.
     * @param description The attraction's description.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get the ticket price of the attraction.
     * @return The attraction's ticket price.
     */
    public double getTicketPrice() {
        return ticketPrice;
    }
    /**
     * Set the ticket price of the attraction.
     * @param ticketPrice The attraction's ticket price.
     */
    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    /**
     * Get the uniqueID of the attraction.
     * @return The attraction's uniqueID.
     */
    public int getUniqueID() {
        return uniqueID;
    }
    /**
     * Set the description of the attraction.
     * @param uniqueID The attraction's UniqueID.
     */
    public void setUniqueID(int uniqueID) {
        this.uniqueID = uniqueID;
    }

    /**
     * Gets the count of ticketed visitors for the attraction.
     *
     * @return The count of ticketed visitors.
     */
    public int getCountOfTicketedVisitors() {
        return countOfTicketedVisitors;
    }

    /**
     * Sets the count of ticketed visitors for the attraction.
     *
     * @param countOfTicketedVisitors The new count of ticketed visitors to set.
     */
    public void setCountOfTicketedVisitors(int countOfTicketedVisitors) {
        this.countOfTicketedVisitors = countOfTicketedVisitors;
    }

    /**
     * Checks if the attraction is currently open.
     *
     * @return {@code true} if the attraction is open, {@code false} if it is closed.
     */
    public boolean isOpen() {
        return isOpen;
    }

    /**
     * Sets the status of the attraction, whether it is open or closed.
     *
     * @param openStatus {@code true} to indicate that the attraction is open, {@code false} to indicate that it is closed.
     */
    public void setOpen(boolean openStatus) {
        this.isOpen = openStatus;
    }

}

