package web.DAO;

import web.model.User;

import java.util.List;

public interface UserDAO {

    List<User> findAll();

    void saveUser(User user);

    void deleteById(Long id);

    User getUser(Long id);

}
