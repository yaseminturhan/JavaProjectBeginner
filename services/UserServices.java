package services;

import proje.User;

import java.util.List;

public interface UserServices {

    User loginUser(User user);
    boolean logoutUser(String username);
    void registerUser(User user);
    List<String> listUser();

}
