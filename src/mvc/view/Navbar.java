package mvc.view;

import mvc.config.Config;

public class Navbar {
    public static void homePage() {
        System.out.println("-------------------- Home Page --------------------");
        System.out.println("1. Login & Register");
        System.out.println("-------------------- Home Page --------------------");
        System.out.println("Enter the choice: ");
        int choice = Integer.parseInt(Config.scanner().nextLine());
        switch (choice) {
            case 1:
                new LoginRegister().showMenu();
                break;
        }
    }
    public static void main(String[] args) {
        homePage();
    }
}