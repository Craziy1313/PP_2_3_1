package web.DAO;

import web.models.User;

import java.util.List;

public interface UserDao {
    List<User> getUsersList();
    void createUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
    User getUser(Long id);
}
