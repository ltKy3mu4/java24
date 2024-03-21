package ru.mpei.lec7;

import ru.mpei.lec7.protocols.Container;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        new Container();
        List<User> users =new ArrayList<>();
        users.add(new User("1", "Peter", 18));
        users.add(new User("120", "Ivan", 2));
        users.add(new User("1000", "Kate", 21));
        users.add(new User("1500", "Sonya", 42));

        String requiredId = "1000";
        User requiredUser = null;
        for (User user : users) {
            if (user.getId().equals(requiredId)){
                requiredUser = user;
                break;
            }
        }

        System.out.println(requiredUser);

        Map<String, User> usersByID = new HashMap<>();
        usersByID.put("1",new User("1", "Peter", 18));
        usersByID.put("120", new User("120", "Ivan", 2));
        usersByID.put("1000", new User("1000", "Kate", 21));
        usersByID.put("1500", new User("1500", "Sonya", 42));

        User user = usersByID.get(requiredId);
        System.out.println(user);

        usersByID.remove(requiredId);
        if (usersByID.containsKey(requiredId)){
            user = usersByID.get(requiredId);
            System.out.println(user);
        }

        for (Map.Entry<String, User> entry : usersByID.entrySet()) {
            entry.getKey();
            entry.getValue();
        }

        for (String s : usersByID.keySet()) {
            User user1 = usersByID.get(s);
            System.err.println(user1);
        }


    }

}
