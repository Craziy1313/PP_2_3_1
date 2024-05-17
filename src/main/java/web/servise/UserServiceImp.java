package web.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.DAO.UserDao;
import web.models.User;
import java.util.List;


@Service
public class UserServiceImp implements UserService {
    @Autowired
    private final UserDao userDao;

    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }
    @Transactional(readOnly = true)
    public List<User> getUsersList() {
        return userDao.getUsersList();
    }
    @Transactional
    public void createUser(User user) {
        userDao.createUser(user);
    }
    @Transactional
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
    @Transactional
    public void deleteUser(Long id) {
        userDao.deleteUser(id);
    }
    @Transactional
    public User getUser(Long id) {
        return userDao.getUser(id);
    }

}

