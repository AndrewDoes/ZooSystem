package org.Main;

public class VisitorManager {
    public void handleVisitorLogin() {
        while (true) {
            UserInterfaceHandler uiHandler = new UserInterfaceHandler();
            uiHandler.displayVisitorMessage();
            int visitorInput = uiHandler.getUserChoice("Enter your Choice[1-2] ::", 1, 2);
            // 1. Register New Visitor
            if (visitorInput == 1) {
                Visitor.visitorRegistration();
            }
            // 2. Login
            else if (visitorInput == 2) {
                Visitor newVisitor = new Visitor();
                if (Visitor.presentVisitors.size() == 0) {
                    System.out.println("Register first as there is no registration yet ....");
                } else {
                    newVisitor.Login();
                }
                break;
            } else {
                System.out.println("Error ...");
            }
        }
    }
}