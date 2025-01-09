package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    void saveUser(User user);

    void deleteById(Long id);

    User getUser(Long id);
}
