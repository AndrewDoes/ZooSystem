package org.Main;

public class AdminManager {
    public void handleAdminLogin() {
        Admin admin = new Admin();
        admin.Login();
        boolean exitFlag = false;
        UserInterfaceHandler uiHandler = new UserInterfaceHandler();
        while (!exitFlag) {
            uiHandler.displayAdminMessage();
            int adminInput = uiHandler.getUserChoice("Enter your Choice [1- 8] ::", 1, 8);
            exitFlag = admin.adminChoice(adminInput);
        }
    }
}