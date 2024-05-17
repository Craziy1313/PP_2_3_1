package web.servise;

import web.models.User;

import java.util.List;

public interface UserService {
    List<User> getUsersList();
    void createUser(User user);
    void deleteUser(Long id);
    void updateUser(User user);
    User getUser(Long id);
}
