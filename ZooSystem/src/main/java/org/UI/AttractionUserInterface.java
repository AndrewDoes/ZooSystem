package org.UI;

import java.util.List;
import java.util.Scanner;
import org.Main.Attraction;
import org.Managers.AttractionManager;
import org.errors.HandleExceptions;
import org.w3c.dom.Attr;

public class AttractionUserInterface {
    private AttractionManager manager;
    private Scanner sc = new Scanner(System.in);
    public AttractionUserInterface(AttractionManager manager) {
        this.manager = manager;
    }
        public void viewAttractions() {
        if (manager.getAttractionCount() == 0) {
            System.out.println("No Attractions Present...");
            return;
        }
        List<Attraction> attractions = manager.getAttractions();
        String border = "+---------------------------+";
        int i = 1;
        for (Attraction attraction : attractions) {
            System.out.println(border);
            printAttractionByIndex(i, attraction);
            System.out.println(border);
            i++;
        }
    }

    private void printAttractionByIndex(int i, Attraction attraction) {
        System.out.println(i + ". Name ::" + attraction.getName());
        System.out.println(i + ". Description ::" + attraction.getDescription());
        System.out.println(i + ". UniqueID ::" + attraction.getUniqueID());
    }

    private void displayAttractionDetails(Attraction attraction) {
        System.out.println("Details of Attraction with Attraction ID ::" + attraction.getUniqueID());
        System.out.println("Name of Attraction ID ->" + attraction.getName());
        System.out.println("Description of Attraction ID -> " + attraction.getDescription());
    }

    public int displayVisitorAttractionDetails() {
        if (manager.getAttractionCount() == 0) {
            System.out.println("No Attractions Present...");
            return -1;
        } else {
            List<Attraction> attractions = manager.getAttractions();
            int i = 1;
            String border = "+---------------------------+";
            System.out.println(border);
            for (Attraction presentAttraction : attractions) {
                System.out.println(i + ". Name ::" + presentAttraction.getName());
                System.out.println("Price ::" + presentAttraction.getTicketPrice());
                i++;
            }
            System.out.println(border);
            return i;
        }
    }

    public void viewAttractionInVisitor(){
        int foundAt = displayVisitorAttractionDetails();
        List<Attraction> attractions = manager.getAttractions();
        if(foundAt!=-1){
            int choiceVisitor = HandleExceptions.getInputInRange("Enter the Number to learn about between [1- "+attractions.size()+"] :::::",1,attractions.size());
            Attraction chosenAttraction = attractions.get(choiceVisitor-1);
            System.out.println(chosenAttraction.getDescription());
            System.out.println(".....Buy Your Ticket Now .......");
        }
    }

    public boolean handleAdminChoice(int adminAttractionInput) {
        switch (adminAttractionInput) {
            case 1:
                addAttraction();
                break;
            case 2:
                viewAttractions();
                break;
            case 3:
                modifyAttraction();
                break;
            case 4:
                removeAttraction();
                break;
            case 5:
                return true; // Exit
            default:
                System.out.println("Error");
                break;
        }
        return false;
    }

    private void addAttraction(){
        System.out.println("Enter Attraction Name::");
        String attractionName = sc.nextLine();
        System.out.println("Enter Attraction Description::");
        String attractionDescription = sc.nextLine();
        System.out.println("Enter the ticket price");
        double ticketPrice = HandleExceptions.getInputInRange("Enter ticket price :::", 0, Integer.MAX_VALUE);
        manager.addAttraction(attractionName,attractionDescription,ticketPrice);
    }

    private void modifyAttraction(){
        System.out.println("Enter the Attraction ID ::: ");
        int attractionID = sc.nextInt();
        sc.nextLine(); // Consume newline
        displayAttractionDetails(manager.getAttractionByID(attractionID));
        System.out.println("Enter New Name ::");
        String newName = sc.nextLine();
        System.out.println("Enter Updated Description ::");
        String newDescription = sc.nextLine();
        manager.modifyAttraction(attractionID, newName, newDescription);
    }

    private void removeAttraction(){
        System.out.println("Enter attractionID to remove the attraction ::: ");
        Attraction attraction = manager.getAttractionByID(sc.nextInt());
        manager.removeAttraction(attraction);
    }
}