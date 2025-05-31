package org.Managers;

import java.util.ArrayList;
import java.util.List;

import org.Factories.AttractionFactory;
import org.Main.Attraction;

public class AttractionManager {
    List<Attraction> attractions = new ArrayList<Attraction>();

    public void addAttraction(String name, String description, double ticketPrice){
        int id = attractions.size();
        Attraction attraction = AttractionFactory.createAttraction(name, description, ticketPrice, id);
        attractions.add(attraction);
        System.out.println("Attraction Added Successfully...");
    }

    public  void removeAttraction(Attraction attraction){
        attractions.remove(attraction);
    }

    public Attraction getAttractionByID(int uniqueID) {
        for(Attraction attraction : attractions){
            if(attraction.getUniqueID() == uniqueID){
                return attraction;
            }
        }
        return null;
    }

    public int searchAttractionByID(int uniqueID){
        int index = 0;
        for(Attraction attraction : attractions){
            if(attraction.getUniqueID() == uniqueID){
                return index;
            }
        }
        return -1;
    }
    
    public void modifyAttraction(int uniqueID, String newName, String newDescription) {
        Attraction attraction = getAttractionByID(uniqueID);
        if (attraction != null) {
            attraction.setTicketPrice(101);
            attraction.setName(newName);
            attraction.setDescription(newDescription);

            System.out.println("Details Has Been Updated Successfully......");
        }
        else System.out.println("No Attraction with Attraction ID ::" + uniqueID + " Exists ....");
    }

    public List<Attraction> getAttractions() {
        return attractions;
    }

    public void setAttractions(List<Attraction> attractions) {
        this.attractions = attractions;
    }

    public int getAttractionCount(){
        return attractions.size();
    }
}
