package mvc.controller;

import mvc.model.User;
import mvc.service.IGenericService;
import mvc.service.IUserService;
import mvc.service.UserServiceIMPL;

import java.util.List;

public class UserController {
    public IUserService userService = new UserServiceIMPL();

    public void createNewUser(User user) {
        userService.save(user);
    }

    public List<User> getListUser() {
        return userService.findAll();
    }

    public boolean checkLogin(String email, String password) {
        return userService.checkLogin(email, password);
    }
}
