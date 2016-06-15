package prv.zielony.modularity.demo.main;

import prv.zielony.modularity.demo.model.User;
import prv.zielony.modularity.demo.service.api.UserService;

import java.util.*;

/**
 * Created by zielony on 14.06.16.
 */
public class Main {

    public static void main(String[] args) {

        User user = new User();
        user.setName("Kamil");
        user.setPassword("sample");

        UserService userService = ServiceLoader.load(UserService.class).iterator().next();

        userService.addUser(user);

        System.out.println("Users: "  + userService.getUsers());
    }

}

