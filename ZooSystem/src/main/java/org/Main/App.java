package org.Main;

import org.errors.HandleExceptions;
import org.Main.UserInterfaceHandler;
import org.Managers.AdminManager;
import org.Managers.VisitorManager;

public class App {
    public void run() {
        UserInterfaceHandler uiHandler = new UserInterfaceHandler();
        VisitorManager visitorManager = new VisitorManager();
        AdminManager adminManager = new AdminManager();

        while (true) {
            uiHandler.displayWelcomeMessage();
            int userInput = uiHandler.getUserChoice("Enter your Choice[1-4] :: ", 1, 4);
            // 1. Login As Admin
            if (userInput == 1) {
                adminManager.handleAdminLogin();
            }
            // 2. Login As Visitor
            else if (userInput == 2) {
                visitorManager.handleVisitorLogin();
            }
            // 3. View Special Deals
            else if (userInput == 3) {
                uiHandler.presentSpecialDeals();
            } else if (userInput == 4) {
                uiHandler.displayExitMessage();
                break;
            } else {
                uiHandler.displayErrorMessage();
            }
        }
    }
    
}
