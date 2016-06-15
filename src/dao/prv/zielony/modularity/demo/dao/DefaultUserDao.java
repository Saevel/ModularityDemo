package prv.zielony.modularity.demo.dao;

import prv.zielony.modularity.demo.dao.api.UserDao;
import prv.zielony.modularity.demo.model.User;

import java.util.*;

/**
 * Created by zielony on 14.06.16.
 */
public class DefaultUserDao implements UserDao {

    private List<User> users = new LinkedList<User>();

    @java.lang.Override
    public User save(User user) {
        users.add(user);
        return user;
    }

    @java.lang.Override
    public List<User> getUsers() {
        return users;
    }
}
