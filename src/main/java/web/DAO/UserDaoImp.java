package web.DAO;

import org.springframework.stereotype.Repository;
import web.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserDaoImp {

    @PersistenceContext
    private EntityManager em;

}
