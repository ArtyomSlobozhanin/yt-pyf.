import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {
    registor registor = new registor();
    User user = new User();
    String name;
    String pass;

    @org.junit.jupiter.api.Test
    void reg()
    {
        user.setname(name);
        user.setpassword(pass);
        registor.registor.add(user);
    }

    @org.junit.jupiter.api.Test
    void testReg()
    {
        registor.reg("admin","1234");
        registor.reg("admin1");
        registor.del("admin2","qwerty");
    }

    @Test
    void del()
    {
        registor.reg("admin","1234");
        registor.reg("admin1","1111");
        registor.reg("admin2");
        registor.registor.remove(0);
        Iterator<User> userIterator = registor.registor.iterator();
        while(userIterator.hasNext())
        {
            User nextUser = userIterator.next();
            System.out.println(nextUser);
        }
    }
}