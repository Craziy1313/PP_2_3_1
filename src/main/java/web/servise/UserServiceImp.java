package web.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.DAO.UserDaoImp;
import web.models.User;
import java.util.List;


@Service
public class UserServiceImp {

    private final UserDaoImp userDaoImp;
    @Autowired
    public UserServiceImp(UserDaoImp userDaoImp) {
        this.userDaoImp = userDaoImp;
    }

    @Transactional(readOnly = true)
    public List<User> getUsersList() {
        return userDaoImp.getUsersList();
    }

}

