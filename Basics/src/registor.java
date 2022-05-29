import java.lang.reflect.Array;
import java.util.ArrayList;

import java.util.Random;

public class registor {
    ArrayList<User> registor = new ArrayList<>();

    public void reg(String name, String pass) {
        User user = new User();
        user.setpassword(pass);
        user.setname(name);
        registor.add(user);
    }

    public void reg(String name) {
        User user = new User();
        user.setname(name);
        int length = 16;
        Random r = new Random();
        String s = r.ints(48, 122)
                .filter(i -> (i < 57 || i > 65) && (i < 90 || i > 97))
                .mapToObj(i -> (char) i)
                .limit(length)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
        user.setpassword(s);
        registor.add(user);
    }

    public void del(String Name, String pass) {
        for (int i = 0; i < registor.size(); i++) {
            if (registor.get(i).getName().equals(Name) && registor.get(i).getPassword().equals(pass)) ;
            {
                registor.remove(i);
            }
        }
    }
}