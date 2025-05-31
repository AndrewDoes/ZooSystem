package org.Factories;

import org.Main.Attraction;

public class AttractionFactory {
    public static Attraction createAttraction(String name, String description, double ticketPrice, int id){
        return new Attraction(name, description, ticketPrice, id);
    }
}
