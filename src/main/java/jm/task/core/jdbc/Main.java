package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService uS = new UserServiceImpl();

        uS.cleanUsersTable();

        uS.saveUser("Алексей", "Натальин", (byte) 34);
        uS.saveUser("Дарья","Охотская",(byte) 35);
        uS.saveUser("Александр", "Знобищев",(byte) 33);
        uS.saveUser("Алексендр","Клепиков",(byte) 30);

        System.out.println(uS.getAllUsers());

        uS.cleanUsersTable();
        uS.dropUsersTable();
    }

}
