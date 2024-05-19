package web.DAO;

import org.springframework.stereotype.Repository;
import web.models.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<User> getUsersList() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    public void createUser(User user) {
        entityManager.persist(user);
    }

    public void updateUser(User user) {
        entityManager.merge(user);
    }

    public void deleteUser(Long id) {
        entityManager.remove(entityManager.find(User.class, id));
    }
    public User getUser(Long id) {
        return entityManager.find(User.class, id);
    }

}
