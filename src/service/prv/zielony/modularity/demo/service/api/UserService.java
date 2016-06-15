package prv.zielony.modularity.demo.service.api;

import prv.zielony.modularity.demo.model.User;

import java.util.*;

/**
 * Created by zielony on 14.06.16.
 */
public interface UserService {

    public void addUser(User user);

    public List<User> getUsers();
}
