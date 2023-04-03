package mvc.service;

import mvc.model.User;

public interface IUserService extends IGenericService<User>{
    boolean checkLogin(String email, String pass);
}
