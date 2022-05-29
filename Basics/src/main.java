import java.util.Iterator;
public class main {
    public static void main(String[] args) {
                    registor register = new registor();
                    register.reg("admin","1234");
                    register.reg("admin1");
                    register.del("admin","1234");


                    Iterator<User>userIterator = register.registor.iterator();
                    while(userIterator.hasNext()) {
                        User nextUser = userIterator.next();
                        System.out.println(nextUser);
                    }
    }
}