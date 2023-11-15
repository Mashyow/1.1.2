package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        Util.getConnection();


        userService.createUsersTable();

        userService.saveUser("Vovan", "Petrov", (byte) 21);
        userService.saveUser("Petr", "Vovanov", (byte) 12);
        userService.saveUser("Elena", "Pokoleno", (byte) 31);
        userService.saveUser("Koleno", "Poelena", (byte) 13);

        userService.removeUserById(1);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }

}