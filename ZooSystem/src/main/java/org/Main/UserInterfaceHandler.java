package org.Main;

import org.errors.HandleExceptions;

public class UserInterfaceHandler {
    public void displayWelcomeMessage() {
        UserInterface.displayWelcomeMessage();
    }

    public int getUserChoice(String message, int min, int max) {
        return HandleExceptions.getInputInRange(message, min, max);
    }

    public void displayVisitorMessage() {
        UserInterface.displayVisitorMessage();
    }

    public void displayAdminMessage() {
        UserInterface.displayAdminMessage();
    }

    public void presentSpecialDeals() {
        UserInterface.presentSpecialDeals();
    }

    public void displayExitMessage() {
        System.out.println("Thanks For Using Interface ....");
    }

    public void displayErrorMessage() {
        System.out.println("Error");
    }
}