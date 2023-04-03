package mvc.view;

import mvc.config.Config;
import mvc.controller.UserController;
import mvc.model.User;

import java.util.List;

public class LoginRegister {
    UserController userController = new UserController();
    List<User> listUsers = userController.getListUser();

    public void showMenu() {
        System.out.println("--------------- Login & Register -----------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");
        System.out.println("--------------- Login & Register -----------------");
        System.out.println("Enter the choice: ");
        int choice = Integer.parseInt(Config.scanner().nextLine());
        switch (choice) {
            case 1:
                login();
                break;
            case 2:
                register();
                break;
            case 3:

                break;
        }
    }

    public void register() {
        int id;
        if (listUsers.isEmpty()) {
            id = 1;
        } else {
            id = listUsers.get(listUsers.size() - 1).getId() + 1;
        }
        System.out.println("Enter the email: ");
        String email = Config.scanner().nextLine();
        System.out.println("Enter the password: ");
        String password = Config.scanner().nextLine();
        System.out.println("Enter the fullname: ");
        String fullName = Config.scanner().nextLine();
        System.out.println("Enter the age: ");
        int age = Integer.parseInt(Config.scanner().nextLine());
        System.out.println("Enter the address: ");
        String address = Config.scanner().nextLine();
        boolean permission = false;
        boolean status = true;
        User user = new User(id, email, password, fullName, age, address, permission, status);
        userController.createNewUser(user);
        System.out.println("Register Successfully!");
    }

    public void login() {
        System.out.println("Enter the email: ");
        String email = Config.scanner().nextLine();
        System.out.println("Enter the password: ");
        String password = Config.scanner().nextLine();
        boolean checkLogin = userController.checkLogin(email,password);
        if (checkLogin) {
            System.out.println("Login Success!");
        } else {
            System.out.println("Login Failed! Try again!");
        }
    }
}
