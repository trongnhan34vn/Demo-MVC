package mvc.service;

import mvc.config.Config;
import mvc.data.PathFile;
import mvc.model.User;

import java.util.List;


public class UserServiceIMPL implements IUserService {
    List<User> listUsers = new Config<User>().readFromFile(PathFile.USER_PATH);

    @Override
    public void save(User user) {
        listUsers.add(user);
        new Config<User>().writeToFile(listUsers, PathFile.USER_PATH);
    }

    @Override
    public List<User> findAll() {
        return listUsers;
    }

    @Override
    public User findById(int id) {
        for (User user : listUsers) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public boolean checkLogin(String email, String pass) {
        for (User user : listUsers) {
            if (user.getEmail().equals(email) && user.getPassword().equals(pass)) {
                return true;
            }
        }
        return false;
    }
}
