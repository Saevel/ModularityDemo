package prv.zielony.modularity.demo.service;

import prv.zielony.modularity.demo.dao.api.UserDao;
import prv.zielony.modularity.demo.model.User;
import prv.zielony.modularity.demo.service.api.UserService;

import java.util.*;

/**
 * Created by zielony on 14.06.16.
 */
public class DefaultUserService implements UserService {

    private UserDao userDao = ServiceLoader.load(UserDao.class).iterator().next();

    @java.lang.Override
    public void addUser(User user) {
        userDao.save(user);
    }

    @java.lang.Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }
}
