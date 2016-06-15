package prv.zielony.modularity.demo.dao.api;

import prv.zielony.modularity.demo.model.User;

import java.util.*;

/**
 * Created by zielony on 09.06.16.
 */
public interface UserDao {

    User save(User user);

    List<User> getUsers();
}
